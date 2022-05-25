package dev.nakayiza.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity_Main3 : AppCompatActivity() {
    lateinit var btnnexxt:Button
    lateinit var btnprevious:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        btnnexxt=findViewById(R.id.btnnexxt)
        btnnexxt.setOnClickListener {
            val intent=Intent(this,Activity_Main4::class.java)
            startActivity(intent)
        }
        btnprevious=findViewById(R.id.btnprevious)
        btnprevious.setOnClickListener {
            val intent=Intent(this,Activity_Main2::class.java)
            startActivity(intent)
        }
    }
}
