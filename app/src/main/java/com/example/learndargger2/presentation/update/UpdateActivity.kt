package com.example.learndargger2.presentation.update

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.learndargger2.R
import com.example.learndargger2.UserApplication
import com.example.learndargger2.data.model.Test
import com.example.learndargger2.databinding.ActivityUpdateBinding
import com.example.learndargger2.di.factory.ViewModelFactory
import com.example.learndargger2.di.module.Test22
import javax.inject.Inject

class UpdateActivity : AppCompatActivity() {

    companion object{
        private const val TAG = "UpdateActivity"
    }

    private lateinit var binding: ActivityUpdateBinding

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private lateinit var viewModel: UpdateViewModel

    @Inject
    lateinit var test: Test

    @Inject
    lateinit var test22: Test22

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUpdateBinding.inflate(layoutInflater)
        setContentView(binding.root)
        UserApplication.instance.userComponent.inject(this)
        viewModel = ViewModelProvider(this,viewModelFactory)[UpdateViewModel::class.java]
        binding.btnUpdate.setOnClickListener {
//            viewModel.insertUser(binding.edtUpdate.text.toString())
            Log.d(TAG, "setOnClickListener: ${test22}")
        }
    }
}
