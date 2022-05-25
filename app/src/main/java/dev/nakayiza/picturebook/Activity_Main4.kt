package dev.nakayiza.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity_Main4 : AppCompatActivity() {
    lateinit var button7:Button
    lateinit var button6:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        button7=findViewById(R.id.button7)
        button7.setOnClickListener {
            val intent = Intent(this,Activity_Main5::class.java)
            startActivity(intent)
        }
        button6=findViewById(R.id.button6)
        button6.setOnClickListener {
            val intent=Intent(this,Activity_Main3::class.java)
            startActivity(intent)
        }
    }
}