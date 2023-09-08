package com.example.learndargger2.presentation.update

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.learndargger2.R
import com.example.learndargger2.UserApplication
import com.example.learndargger2.databinding.ActivityUpdateBinding
import com.example.learndargger2.di.factory.ViewModelFactory
import javax.inject.Inject

class UpdateActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUpdateBinding

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private lateinit var viewModel: UpdateViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUpdateBinding.inflate(layoutInflater)
        setContentView(binding.root)
        UserApplication.instance.userComponent.inject(this)
        viewModel = ViewModelProvider(this,viewModelFactory)[UpdateViewModel::class.java]
        binding.btnUpdate.setOnClickListener {
            viewModel.insertUser(binding.edtUpdate.text.toString())
        }
    }
}
