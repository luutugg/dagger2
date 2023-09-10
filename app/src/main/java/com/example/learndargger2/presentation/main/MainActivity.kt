package com.example.learndargger2.presentation.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.learndargger2.UserApplication
import com.example.learndargger2.data.model.Test
import com.example.learndargger2.databinding.ActivityMainBinding
import com.example.learndargger2.di.factory.ViewModelFactory
import com.example.learndargger2.di.module.Test22
import com.example.learndargger2.di.module.XXX
import com.example.learndargger2.presentation.update.UpdateActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "MainActivity"
    }

    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var bookViewModelFactory: ViewModelFactory

    @Inject
    lateinit var xxx: XXX

    private lateinit var viewModel: MainViewModel

    private val adapter by lazy { UserAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        injectDagger()

        createViewModel()

        setUpAdapter()

        observeViewModel()

        setOnClickView()
        xxx

    }

    override fun onStart() {
        super.onStart()
        viewModel.getAllUser()
    }

    private fun injectDagger() {
        UserApplication.instance.userComponent.inject(this)
    }

    private fun createViewModel() {
        viewModel = ViewModelProvider(this, bookViewModelFactory)[MainViewModel::class.java]
    }

    private fun setUpAdapter() {
        binding.rvMain.adapter = adapter
        binding.rvMain.layoutManager = LinearLayoutManager(this)
    }

    private fun observeViewModel() {
        lifecycleScope.launchWhenCreated {
            viewModel.userListState.collect {
                adapter.submitList(it)
            }
        }
    }

    @Inject
    lateinit var test: Test

    @Inject
    lateinit var test22: Test22


    private fun setOnClickView() {
        binding.fabMain.setOnClickListener {
            startActivity(Intent(this, UpdateActivity::class.java))
        }
    }
}
