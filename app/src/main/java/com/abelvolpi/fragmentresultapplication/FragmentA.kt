package com.abelvolpi.fragmentresultapplication

import android.os.Bundle
import android.view.View
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.fragment.findNavController
import com.abelvolpi.fragmentresultapplication.databinding.FragmentABinding

class FragmentA : BaseFragment<FragmentABinding>(FragmentABinding::inflate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setFragmentResultListener("MyRequestKey") { requestKey, bundle ->
            val result = bundle.getString("bundleKey")
            binding.resultText.text = result
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextButton.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentA_to_fragmentB)
        }
    }

}