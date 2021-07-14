package com.example.jogodavelha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    private lateinit var btmPvp: Button
    private lateinit var btmConfig: Button
    private lateinit var btmPvIa: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        onResume()


        btmPvp.setOnClickListener {
            val dialog= LayoutInflater.from(this).inflate(R.layout.dialog_player_pvp, null)

            val builder= AlertDialog.Builder(this)
            builder.setView(dialog)

            val alertDialog= builder.show()

            val ButtomConf= dialog.findViewById<Button>(R.id.btn_dialog_comecar)
            val ButtomCanc= dialog.findViewById<Button>(R.id.btn_dialog_cancelar)

            val EditText1=dialog.findViewById<EditText>(R.id.edit_jogador_1)
            val EditText2=dialog.findViewById<EditText>(R.id.edit_jogador_2)


            ButtomConf.setOnClickListener {
                alertDialog.dismiss()

                val nome1=EditText1.text.toString()
                val nome2=EditText2.text.toString()

                if(nome1.isNotEmpty() && nome2.isNotEmpty())
                {
                    val intent= Intent(this@MainActivity, PvPActivity::class.java)
                    intent.putExtra("nome1",nome1)
                    intent.putExtra("nome2",nome2)
                    startActivity(intent)
                }
            }
            ButtomCanc.setOnClickListener {
                alertDialog.dismiss()
            }
        }
    }

    override fun onResume() {
        btmPvp = findViewById(R.id.btn_pvp)
        super.onResume()
    }
}