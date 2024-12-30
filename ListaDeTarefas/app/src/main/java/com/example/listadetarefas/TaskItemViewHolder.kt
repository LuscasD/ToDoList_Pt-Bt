package com.example.listadetarefas

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.example.listadetarefas.databinding.FragmentNewTaskSheetBinding
import com.example.listadetarefas.databinding.TaskItemCellBinding
import java.time.format.DateTimeFormatter

class TaskItemViewHolder(
    private  val context: Context,
    private  val binding: TaskItemCellBinding
): RecyclerView.ViewHolder(binding.root)
{
    private val timeFormat = DateTimeFormatter.ofPattern("HH:mm")
    fun bindTaskItem(taskItem: TaskItem)
    {
        binding.name.text = taskItem.name

        if(taskItem.dueTime != null)
            binding.dueTime.text = timeFormat.format(taskItem.dueTime)
        else
            binding.dueTime.text = ""
    }

}