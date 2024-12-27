package com.example.listadetarefas

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.listadetarefas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{

    private  lateinit var  binding: ActivityMainBinding
    private  lateinit var  taskViewModel: TaskViewModel

    override fun onCreate(savedInstanceState: Bundle?)
    {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        taskViewModel = ViewModelProvider(this).get(TaskViewModel::class.java)
        binding.newTaskButton.setOnClickListener{
            NewTaskSheet().show(supportFragmentManager, "newTaskTag")
        }

        taskViewModel.name.observe(this){
            binding.taskName.text = String.format("Nome da tarefa: %s", it)
        }
        taskViewModel.name.observe(this){
            binding.taskDesc.text = String.format("Descrição da tarefa: %s", it)
        }

    }
}