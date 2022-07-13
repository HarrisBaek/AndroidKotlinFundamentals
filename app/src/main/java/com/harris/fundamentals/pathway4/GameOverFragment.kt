package com.harris.fundamentals.pathway4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.harris.fundamentals.R
import com.harris.fundamentals.databinding.FragmentConstraintBinding
import com.harris.fundamentals.databinding.FragmentGameOverBinding

class GameOverFragment : Fragment() {

    private var _binding: FragmentGameOverBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGameOverBinding.inflate(inflater, container, false)
        binding.overBtn.setOnClickListener {
            findNavController().navigate(R.id.action_gameover_to_game)
        }
        return binding.root
    }
}