package com.example.database.viewmodels

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.database.R
import com.example.database.databinding.ShowMessageFragmentBinding

class ShowMessageFragment : Fragment() {

    private lateinit var binding: ShowMessageFragmentBinding

    companion object {
        fun newInstance() = ShowMessageFragment()
    }

    private  val viewModel: ShowMessageViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.show_message_fragment,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.user = viewModel
        binding.lifecycleOwner =viewLifecycleOwner

        binding.btn.setOnClickListener {
            showMessage()
        }
    }

//    private fun showMessage() {
//            viewModel.showMsg(binding.tvShow.text.toString())
//    }

    private fun showMessage(){
        viewModel.showMsg2()

    }

}