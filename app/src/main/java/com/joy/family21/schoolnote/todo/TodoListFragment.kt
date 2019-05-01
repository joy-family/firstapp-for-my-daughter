package com.joy.family21.schoolnote.todo

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.joy.family21.schoolnote.R
import com.joy.family21.schoolnote.databinding.FragmentTodoListBinding

class TodoListFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentTodoListBinding.inflate(inflater, container, false)
        /*val goDetail = TodoListFragmentDirections.actionTodoListFragmentToTodoDetailFragment(1)
        findNavController().navigate(goDetail)*/
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.todo_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }
}