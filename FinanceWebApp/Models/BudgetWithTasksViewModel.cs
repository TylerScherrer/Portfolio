namespace BudgetTracker.Models
{
    public class BudgetWithTasksViewModel
    {
        /// <summary>
        /// A list of all budgets.
        /// </summary>
        public List<Budget> Budgets { get; set; } = new List<Budget>();

        /// <summary>
        /// Tasks scheduled for the current week.
        /// </summary>
        public List<TaskItem> CurrentWeekTasks { get; set; } = new List<TaskItem>();

        /// <summary>
        /// Tasks scheduled for today.
        /// </summary>
        public List<ToDoItem> TodayTasks { get; set; } = new List<ToDoItem>();

        /// <summary>
        /// All daily schedules associated with tasks.
        /// </summary>
        public List<DailySchedule> DailySchedules { get; set; } = new List<DailySchedule>();

        /// <summary>
        /// A list of all tasks.
        /// </summary>
        public List<ToDoItem> AllTasks { get; set; } = new List<ToDoItem>();

    }
}
