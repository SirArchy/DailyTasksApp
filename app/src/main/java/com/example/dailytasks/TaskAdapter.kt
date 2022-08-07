package com.example.dailytasks

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_task.view.*
import java.text.FieldPosition

class TaskAdapter(
    private val tasks : MutableList<Tasks>
)   : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>()
{
    class TaskViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        return TaskViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_task,
                parent,
                false
            )
        )
    }

    fun addTask(task: Tasks) {
        tasks.add(task)
        notifyItemInserted(tasks.size -1)
    }

    fun deleteTask(task: Tasks) {
        // delete task when pressing delete button after swiping left on task
        tasks.remove(task)
        // notifyItemRemoved(task[position])
    }

    fun moveTaskToDone(fromPosition: FieldPosition, toPosition: FieldPosition) {
        // move task to second recycle View after checking Checkbox
        // notifyItemMoved(fromPosition, toPosition)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val curTask = tasks[position]
        holder.itemView.apply{
            cbTask.text = curTask.taskName
            cbTask.isChecked = curTask.isChecked
            cbTask.setOnCheckedChangeListener {_, } //add delete when checkbox checked
        }
    }

    override fun getItemCount(): Int {
        return tasks.size
    }
}