package com.example.counter_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.makeText

var countTemeA=0
var countTemeB=0
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*This is for declare */
        val temeA=findViewById(R.id.text_team_A)as TextView
        val temeB=findViewById(R.id.text_team_B)as TextView
        /*For button  */
        val btn_free_throw_team_a=findViewById(R.id.btn_free_throw_team_a)as Button
        btn_free_throw_team_a.setOnClickListener {
            Toast.makeText(this@MainActivity,"Free throw team A ", Toast.LENGTH_SHORT).show()
            countTemeA+=1
            temeA.text= countTemeA.toString()
        }
        val btn_free_throw_team_b=findViewById(R.id.btn_free_throw_team_b)as Button
        btn_free_throw_team_b.setOnClickListener {
            Toast.makeText(this@MainActivity,"Free throw team B ", Toast.LENGTH_SHORT).show()
            countTemeB+=1
            temeB.text= countTemeB.toString()
        }
        val btn_plus_2_points_team_a=findViewById(R.id.btn_plus_2_points_team_a)as Button
        btn_plus_2_points_team_a.setOnClickListener {
            Toast.makeText(this@MainActivity,"Plus 2 to team A ", Toast.LENGTH_SHORT).show()
            countTemeA+=2
            temeA.text= countTemeA.toString()

        }
        val btn_plus_2_points_team_b=findViewById(R.id.btn_plus_2_points_team_b)as Button
        btn_plus_2_points_team_b.setOnClickListener {
            Toast.makeText(this@MainActivity,"Plus 2 to team B ", Toast.LENGTH_SHORT).show()
            countTemeB+=2
            temeB.text= countTemeB.toString()
        }
        val btn_plus_3_points_team_a=findViewById(R.id.btn_plus_3_points_team_a)as Button
        btn_plus_3_points_team_a.setOnClickListener {
            Toast.makeText(this@MainActivity,"Plus 3 to team A ", Toast.LENGTH_SHORT).show()
            countTemeA+=3
            temeA.text= countTemeA.toString()

        }
        val btn_plus_3_points_team_b=findViewById(R.id.btn_plus_3_points_team_b)as Button
        btn_plus_3_points_team_b.setOnClickListener {
            Toast.makeText(this@MainActivity,"Plus 3 to team A ", Toast.LENGTH_SHORT).show()
            countTemeB+=3
            temeB.text= countTemeB.toString()
        }
        val reset=findViewById(R.id.btn_reset)as Button
        reset.setOnClickListener{
            Toast.makeText(this@MainActivity,"You clike Rest ", Toast.LENGTH_SHORT).show()
            if (countTemeA> countTemeB){
                countTemeA=0
                countTemeB=0
                temeB.text= countTemeB.toString()
                temeA.text= countTemeA.toString()
                Toast.makeText(this@MainActivity,"The winer is A ", Toast.LENGTH_SHORT).show()
            }else
            {
                countTemeA=0
                countTemeB=0
                temeB.text= countTemeB.toString()
                temeA.text= countTemeA.toString()
                Toast.makeText(this@MainActivity,"The winer is B ", Toast.LENGTH_SHORT).show()
            }



        }



    }
}