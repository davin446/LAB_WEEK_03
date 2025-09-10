package com.example.lab_week_03

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class ListFragment : Fragment(R.layout.fragment_list) {

    companion object {
        const val COFFEE_TITLE = "COFFEE_TITLE"
        const val COFFEE_DESC = "COFFEE_DESC"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val coffeeMap = mapOf(
            R.id.affogato to Pair(R.string.affogato_title, R.string.affogato_desc),
            R.id.americano to Pair(R.string.americano_title, R.string.americano_desc),
            R.id.latte to Pair(R.string.latte_title, R.string.latte_desc),
            R.id.mocha to Pair(R.string.mocha_title, R.string.mocha_desc),
            R.id.cappuccino to Pair(R.string.cappuccino_title, R.string.cappuccino_desc)
        )

        coffeeMap.forEach { (viewId, pair) ->
            view.findViewById<View>(viewId).setOnClickListener {
                val bundle = Bundle()
                bundle.putInt(COFFEE_TITLE, pair.first)
                bundle.putInt(COFFEE_DESC, pair.second)
                it.findNavController().navigate(R.id.coffee_id_action, bundle)
            }
        }
    }
}
