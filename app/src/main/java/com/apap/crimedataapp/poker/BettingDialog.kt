package com.apap.crimedataapp.poker

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.apap.crimedataapp.R
import com.apap.crimedataapp.app.PokerCivilizationsActivity

class BettingDialog(private val hasMoreLands: Boolean, private val playerPoints: Int, private val opponentPoints: Int) : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val message: String

        val builder = AlertDialog.Builder(activity)
                .setCancelable(true)
                .setPositiveButton("OK") { dialog, which ->
                    PokerCivilizationsActivity.pokerFragment?.showCommunityCards()
                    dismiss()
                }

        when (hasMoreLands) {
            false -> message = "More than one state is needed to bet"
            true -> {
                message = "Please place your bet"
                builder.setView(R.layout.betting_dialog)
            }
        }

        builder.setMessage(message)

        return builder.create()
    }

    override fun onStart() {
        super.onStart()


    }

    companion object {
        const val TAG = "BETTING"

        @JvmStatic
        fun newInstance(hasMoreLands: Boolean, playerPoints: Int, opponentPoints: Int) : BettingDialog {
            return BettingDialog(hasMoreLands, playerPoints, opponentPoints)
        }
    }
}