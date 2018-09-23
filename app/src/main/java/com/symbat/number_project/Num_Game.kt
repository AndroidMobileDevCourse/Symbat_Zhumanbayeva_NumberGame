package com.symbat.number_project

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class Num_Game : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_num__game)
        val tv_lf = findViewById<TextView>(R.id.textView)
        val tv_rg = findViewById<TextView>(R.id.textView3)
        tv_lf.apply { text = Random().nextInt(10).toString() }
        tv_rg.apply { text = Random().nextInt(10).toString() }
    }
    fun lessbutton(view: View){
        compare(1)
    }
    fun equalbutton(view: View){
        compare(2)
    }
    fun biggerbutton(view: View){
        compare(3)
    }
    fun compare(comparesign: Int) {
        val left = findViewById<TextView>(R.id.textView)
        val right = findViewById<TextView>(R.id.textView3)
        val score = findViewById<TextView>(R.id.textView5)
        val leftInt = Integer.parseInt(left.text.toString())
        val rightInt = Integer.parseInt(right.text.toString())
        val scoreInt = Integer.parseInt(score.text.toString())
        var right_answer = 1
        if (leftInt>rightInt){
            right_answer = 3
        } else if (leftInt==rightInt){
            right_answer = 2
        } else {
            right_answer = 1
        }

        if (right_answer == comparesign){
            score.apply { text = (scoreInt+1).toString() }
        } else {
            score.apply { text = (scoreInt-1).toString() }
        }

        left.apply {
            text = ""+(Random().nextInt((10-1))+1)
        }
        right.apply {
            text = ""+ (Random().nextInt((10-1))+1)
        }
    }
}
