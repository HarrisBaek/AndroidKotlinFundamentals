package com.harris.fundamentals.pathway4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.harris.fundamentals.databinding.FragmentConstraintBinding
import com.harris.fundamentals.databinding.FragmentRuleBinding

class RuleFragment :Fragment() {

    private var _binding: FragmentRuleBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRuleBinding.inflate(inflater, container, false)
        return binding.root
    }
}