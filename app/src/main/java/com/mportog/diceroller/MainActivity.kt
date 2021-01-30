package com.mportog.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        roll_dice_button.setOnClickListener(){
            rollDice()
        }
    }

    private fun rollDice(){
        val getDiceImg = when (Random().nextInt(6)){
            0->R.drawable.dice_1
            1->R.drawable.dice_2
            2->R.drawable.dice_3
            3->R.drawable.dice_4
            4->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        dice_img.setImageResource(getDiceImg)
    }
}