package com.example.dailytasks

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dailytasks.databinding.ActivityMainBinding
import com.google.android.gms.tasks.Task
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_task.*
import kotlinx.android.synthetic.main.item_task.view.*

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding
    private lateinit var taskAdapter: TaskAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        taskAdapter = TaskAdapter(mutableListOf())
        rvTasks.adapter = taskAdapter
        rvTasks.layoutManager = LinearLayoutManager(this)

        btnAddTask.setOnClickListener{
            // add empty Task, only Checkbox shown, and cursor is on position to add content
            val taskTitle = cbTask.text.toString()
            val task = Tasks(taskTitle)
            taskAdapter.addTask(task)
        }

        // add delete button Click Listener


    }
}