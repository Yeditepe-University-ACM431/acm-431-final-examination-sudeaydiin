package com.yeditepe.finalexam.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.yeditepe.finalexam.model.Task

class TaskViewModel : ViewModel() {

    // TODO 1: Create a mutable state list of Task objects
    // Initially add at least 2 tasks
    var tasks = mutableStateListOf(
        Task(1, "Submit Final Project", true),
        Task(2, "Study for ACM 431", true)
    )

    fun toggleTask(taskId: Int) {
        // TODO 2: Update isCompleted for the given task
        val taskIndex = tasks.indexOfFirst { it.id == taskId }
        if (taskIndex != -1) {
            val task = tasks[taskIndex]
            tasks[taskIndex] = task.copy(isCompleted = !task.isCompleted)
        }
    }
}
