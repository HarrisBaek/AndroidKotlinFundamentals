package com.harris.fundamentals.pathway3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.harris.fundamentals.R
import com.harris.fundamentals.databinding.FragmentConstraintBinding
import com.harris.fundamentals.databinding.FragmentDiceRollerBinding
import com.harris.fundamentals.databinding.FragmentFirstPathwayBinding

class ConstraintFragment : Fragment() {
    private var _binding: FragmentConstraintBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentConstraintBinding.inflate(inflater, container, false)


        return binding.root
    }

}