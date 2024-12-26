﻿using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace BudgetTracker.Migrations
{
    /// <inheritdoc />
    public partial class DailyFunctionalityList : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.AddColumn<bool>(
                name: "IsTodayOnly",
                table: "ToDoItems",
                type: "INTEGER",
                nullable: false,
                defaultValue: false);

            migrationBuilder.CreateTable(
                name: "ToDoItemToDoItem",
                columns: table => new
                {
                    AllTasksId = table.Column<int>(type: "INTEGER", nullable: false),
                    TodayTasksId = table.Column<int>(type: "INTEGER", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_ToDoItemToDoItem", x => new { x.AllTasksId, x.TodayTasksId });
                    table.ForeignKey(
                        name: "FK_ToDoItemToDoItem_ToDoItems_AllTasksId",
                        column: x => x.AllTasksId,
                        principalTable: "ToDoItems",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Cascade);
                    table.ForeignKey(
                        name: "FK_ToDoItemToDoItem_ToDoItems_TodayTasksId",
                        column: x => x.TodayTasksId,
                        principalTable: "ToDoItems",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateIndex(
                name: "IX_ToDoItemToDoItem_TodayTasksId",
                table: "ToDoItemToDoItem",
                column: "TodayTasksId");
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "ToDoItemToDoItem");

            migrationBuilder.DropColumn(
                name: "IsTodayOnly",
                table: "ToDoItems");
        }
    }
}
