package com.example.navigationtestapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.navigationtestapp.databinding.InformationDialogBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class InformDialog : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.information_dialog, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = InformationDialogBinding.bind(view)

        val args: InformDialogArgs by navArgs()


        if (args.testStringValueNavArgs.isNotEmpty()) binding.textView.text = args.testStringValueNavArgs else binding.textView.text = getString(R.string.no_arg_passed)


    }
}