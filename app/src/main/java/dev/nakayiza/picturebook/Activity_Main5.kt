package dev.nakayiza.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity_Main5 : AppCompatActivity() {
    lateinit var button8:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        button8=findViewById(R.id.button8)
        button8.setOnClickListener {
            val intent=Intent(this,Activity_Main4::class.java)
            startActivity(intent)
        }

    }

}
