package com.vincentagung.view_binding_10683

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vincentagung.view_binding_10683.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        val adapter = MainAdapter(TaskList.taskList)
        binding?.taskBy?.adapter = adapter
    }

    override fun onDestroy(){
        super.onDestroy()
        binding = null
    }
}