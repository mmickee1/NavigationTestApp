package com.example.navigationtestapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.example.navigationtestapp.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            if (findNavController().currentDestination?.id == R.id.FirstFragment) {
                findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
            }
        }
        binding.buttonOpenInfoDialog.setOnClickListener {
            if (findNavController().currentDestination?.id == R.id.FirstFragment) {
                findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToInformDialog("Passed NavArgs from FirstFragment successfully!"))
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}