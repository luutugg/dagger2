package com.example.learndargger2.presentation.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.learndargger2.data.model.User
import com.example.learndargger2.databinding.UserItemBinding

class UserAdapter : ListAdapter<User, UserAdapter.UserVH>(UserDiffCallback()) {
    inner class UserVH(private val binding: UserItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(user: User) {
            with(binding) {
                Glide.with(this.root.context).load(user.image).into(ivUserImage)
                tvUserName.text = user.name
            }
        }
    }

    class UserDiffCallback : DiffUtil.ItemCallback<User>() {
        override fun areItemsTheSame(oldItem: User, newItem: User): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: User, newItem: User): Boolean {
            return oldItem.name == newItem.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserVH {
        return UserVH(UserItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: UserVH, position: Int) {
        holder.onBind(getItem(position))
    }
}
