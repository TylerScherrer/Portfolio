using BudgetTracker.Data;
using BudgetTracker.Interfaces;
using BudgetTracker.Models;
using Microsoft.EntityFrameworkCore;

namespace BudgetTracker.Services
{
    public class ToDoService : IToDoService
    {
        private readonly ApplicationDbContext _context;

        public ToDoService(ApplicationDbContext context)
        {
            _context = context;
        }

        public async Task<List<ToDoItem>> GetTodayTasksAsync()
        {
            var today = DateTime.Now.Date;
            return await _context.ToDoItems
                .Where(t => t.IsDaily || (t.IsTodayOnly && t.DueDate.Date == today))
                .ToListAsync();
        }


        public async Task<List<ToDoItem>> GetDailyTasksAsync()
        {
            return await _context.ToDoItems
                .Where(t => t.IsDaily)
                .ToListAsync();
        }

        public async Task<List<DailySchedule>> GetDailySchedulesAsync()
        {
            return await _context.DailySchedules
                .Include(ds => ds.Task)
                .ToListAsync();
                }
        public async Task CreateTaskAsync(ToDoItem task)
        {
            Console.WriteLine($"Saving Task: Name={task.Name}, DueDate={task.DueDate}, IsDaily={task.IsDaily}, IsTodayOnly={task.IsTodayOnly}");

            _context.ToDoItems.Add(task);
            await _context.SaveChangesAsync();
        }




        public async Task MarkTaskAsCompleteAsync(int id)
        {
            var task = await _context.ToDoItems.FindAsync(id);
            if (task != null)
            {
                task.IsCompleted = true;
                await _context.SaveChangesAsync();
            }
        }

        public async Task DeleteTaskAsync(int id)
        {
            var task = await _context.ToDoItems.FindAsync(id);
            if (task != null)
            {
                _context.ToDoItems.Remove(task);
                await _context.SaveChangesAsync();
            }
        }

        public async Task AssignTaskToTimeAsync(int taskId, int hour)
        {
            var task = await _context.ToDoItems.FindAsync(taskId);
            if (task != null)
            {
                var existingSchedule = await _context.DailySchedules
                    .FirstOrDefaultAsync(ds => ds.Hour == hour);

                if (existingSchedule != null)
                {
                    existingSchedule.TaskId = taskId; // Update existing schedule
                }
                else
                {
                    var newSchedule = new DailySchedule
                    {
                        TaskId = taskId,
                        Hour = hour
                    };
                    _context.DailySchedules.Add(newSchedule);
                }

                await _context.SaveChangesAsync();
            }
        }

        public async Task<List<ToDoItem>> GetAllTasksAsync()
        {
            return await _context.ToDoItems.ToListAsync(); // Fetch all tasks from the database
        }

    }
}
