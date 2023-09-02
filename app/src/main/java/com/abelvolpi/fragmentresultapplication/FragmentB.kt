package com.abelvolpi.fragmentresultapplication

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController
import com.abelvolpi.fragmentresultapplication.databinding.FragmentBBinding

class FragmentB :BaseFragment<FragmentBBinding>(FragmentBBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.backButton.setOnClickListener {
            val result = binding.editText.text.toString()
            setFragmentResult("MyRequestKey", bundleOf("bundleKey" to result, "" to ""))
            findNavController().popBackStack()
        }
    }

}