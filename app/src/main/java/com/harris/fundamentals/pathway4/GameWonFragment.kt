package com.harris.fundamentals.pathway4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.harris.fundamentals.R
import com.harris.fundamentals.databinding.FragmentConstraintBinding
import com.harris.fundamentals.databinding.FragmentGameWonBinding

class GameWonFragment : Fragment() {

    private var _binding: FragmentGameWonBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGameWonBinding.inflate(inflater, container, false)
        binding.wonBtn.setOnClickListener {
            findNavController().navigate(R.id.action_gamewon_to_game)
        }
        return binding.root
    }
}