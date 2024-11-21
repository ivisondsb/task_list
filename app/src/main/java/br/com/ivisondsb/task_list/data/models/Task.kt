package br.com.ivisondsb.task_list.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

@Entity(tableName = "tasks")
data class Task(
    @PrimaryKey(autoGenerate = true)
    val id: Long? = 0,
    val title: String,
    val description: String? = null,
    val status: String,
    val createdOn: LocalDate,
    val finishedOn: LocalDate? = null
)
