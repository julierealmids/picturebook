package dev.nakayiza.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity_Main2 : AppCompatActivity() {
    lateinit var btnNext:Button
    lateinit var btnPreview:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btnNext=findViewById(R.id.btnNext)
        btnNext.setOnClickListener {
            val intent=Intent(this,Activity_Main3::class.java)
            startActivity(intent)
        }
        btnPreview=findViewById(R.id.btnPreview)
        btnPreview.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}