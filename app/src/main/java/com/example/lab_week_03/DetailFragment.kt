package com.example.lab_week_03

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class DetailFragment : Fragment(R.layout.fragment_detail) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val titleRes = arguments?.getInt(ListFragment.COFFEE_TITLE) ?: 0
        val descRes = arguments?.getInt(ListFragment.COFFEE_DESC) ?: 0

        val titleText = view.findViewById<TextView>(R.id.detailTitle)
        val descText = view.findViewById<TextView>(R.id.detailDesc)

        if (titleRes != 0 && descRes != 0) {
            titleText.setText(titleRes)
            descText.setText(descRes)
        }

        view.findViewById<Button>(R.id.backButton).setOnClickListener {
            findNavController().navigateUp()
        }
    }
}
