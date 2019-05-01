package com.joy.family21.schoolnote.money

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.joy.family21.schoolnote.databinding.FragmentMoneyBinding

class MoneyFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentMoneyBinding.inflate(inflater, container, false)
        return binding.root
    }
}