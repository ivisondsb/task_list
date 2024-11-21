package br.com.ivisondsb.task_list.data.dao

import androidx.room.Insert
import androidx.room.Query
import br.com.ivisondsb.task_list.data.models.Task

interface TaskDAO {
    @Insert
    suspend fun insertTask(task: Task)

    @Query("SELECT * FROM tasks")
    suspend fun getAllTasks(): List<Task>

    @Query("SELECT * FROM tasks WHERE status = :status")
    suspend fun getTasksByStatus(status: String): List<Task>

    @Query("DELETE FROM tasks WHERE id = :id")
    suspend fun deleteTask(id: Long)

    @Query("UPDATE tasks SET title = :title, description = :description, status = :status WHERE id = :id")
    suspend fun updateTask(id: Long, title: String, description: String?, status: String)
}
