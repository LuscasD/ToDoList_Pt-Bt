package com.example.listadetarefas

interface TaskItemClickListener
{
    fun editTaskItem(taskItem: TaskItem)
    fun completTaskItem(taskItem: TaskItem)
}