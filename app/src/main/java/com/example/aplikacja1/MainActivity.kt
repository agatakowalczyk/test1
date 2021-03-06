package com.example.aplikacja1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var nazwaAplikacji: TextView? = null;
    private var wybierzTryb: TextView? = null;
    private var zoo: Button? =null;
    private var instrumenty: Button? =null;
    private var pojazdy: Button? =null;
    private var farma: Button? =null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nazwaAplikacji =findViewById(R.id.Tytuł_aplikacji)
        wybierzTryb = findViewById(R.id.wybierzTryb)
        zoo = findViewById(R.id.zoo)
        farma = findViewById(R.id.farma)
        instrumenty = findViewById(R.id.instrumenty)
        pojazdy = findViewById(R.id.pojazdy)

        farma?.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v:View?){
                openLayoutFarma()
            }
        })

    }

    private fun openLayoutFarma(){
        val intent = Intent(this, FarmaActivity::class.java)
        startActivity(intent)
    }



}