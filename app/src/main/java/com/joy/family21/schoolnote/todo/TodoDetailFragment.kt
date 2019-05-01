package com.joy.family21.schoolnote.todo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.joy.family21.schoolnote.databinding.FragmentTodoDetailBinding

class TodoDetailFragment : Fragment() {

    val safeArgs: TodoDetailFragmentArgs by navArgs()
//    val itemId = safeArgs.itemId

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentTodoDetailBinding.inflate(inflater, container, false)
        return binding.root
    }
}