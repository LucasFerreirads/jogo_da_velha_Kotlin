package com.example.jogodavelha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class PvPActivity : AppCompatActivity() {

    private lateinit var btn1:Button
    private lateinit var btn2:Button
    private lateinit var btn3:Button
    private lateinit var btn4:Button
    private lateinit var btn5:Button
    private lateinit var btn6:Button
    private lateinit var btn7:Button
    private lateinit var btn8:Button
    private lateinit var btn9:Button
    private lateinit var textjogador1:TextView
    private lateinit var textjogador2:TextView

    private var sair:Boolean=false
    private var winJogador:Boolean?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pvp)

        onResume()

        var cont:Int=0
        var jogador:Boolean=true

        var btnJogador1:Int=0
        var btnJogador2:Int=0
        var btnJogador3:Int=0
        var btnJogador4:Int=0
        var btnJogador5:Int=0
        var btnJogador6:Int=0
        var btnJogador7:Int=0
        var btnJogador8:Int=0
        var btnJogador9:Int=0

        var clickBtn_1:Boolean?=null
        var clickBtn_2:Boolean?=null
        var clickBtn_3:Boolean?=null
        var clickBtn_4:Boolean?=null
        var clickBtn_5:Boolean?=null
        var clickBtn_6:Boolean?=null
        var clickBtn_7:Boolean?=null
        var clickBtn_8:Boolean?=null
        var clickBtn_9:Boolean?=null

        val intent= intent
        var nome1:String?=null
        var nome2:String?=null
        val n1=intent.getStringExtra("nome1")
        val n2=intent.getStringExtra("nome2")

        nome1=" $n1"
        nome2=" $n2"
        textjogador1.text= " $n1"
        textjogador2.text= " $n2"

        btn1.setOnClickListener {
            if (clickBtn_1!=true)
            {
                if (jogador==true)
                {
                    btn1.setBackgroundResource(R.drawable.ic_x)
                    jogador=false
                    btn1.isEnabled=true
                    clickBtn_1=true
                    btnJogador1=1
                    cont+=1
                    winToGame(btnJogador1, btnJogador2, btnJogador3, btnJogador4, btnJogador5, btnJogador6, btnJogador7, btnJogador8, btnJogador9,cont, jogador,nome1,nome2)
                }
                else
                {
                    btn1.setBackgroundResource(R.drawable.ic_o)
                    jogador=true
                    btn1.isEnabled=true
                    clickBtn_1=true
                    btnJogador1=2
                    cont+=1
                    winToGame(btnJogador1, btnJogador2, btnJogador3, btnJogador4, btnJogador5, btnJogador6, btnJogador7, btnJogador8, btnJogador9,cont, jogador,nome1,nome2)
                }
            }
        }

        btn2.setOnClickListener {
            if (clickBtn_2!=true)
            {
                if (jogador==true)
                {
                    btn2.setBackgroundResource(R.drawable.ic_x)
                    jogador=false
                    btn2.isEnabled=true
                    clickBtn_2=true
                    btnJogador2=1
                    cont+=1
                    winToGame(btnJogador1, btnJogador2, btnJogador3, btnJogador4, btnJogador5, btnJogador6, btnJogador7, btnJogador8, btnJogador9,cont, jogador,nome1,nome2)
                }
                else
                {
                    btn2.setBackgroundResource(R.drawable.ic_o)
                    jogador=true
                    btn2.isEnabled=true
                    clickBtn_2=true
                    btnJogador2=2
                    cont+=1
                    winToGame(btnJogador1, btnJogador2, btnJogador3, btnJogador4, btnJogador5, btnJogador6, btnJogador7, btnJogador8, btnJogador9,cont, jogador,nome1,nome2)
                }
            }
        }

        btn3.setOnClickListener {
            if (clickBtn_3!=true)
            {
                if (jogador==true)
                {
                    btn3.setBackgroundResource(R.drawable.ic_x)
                    jogador=false
                    btn3.isEnabled=true
                    clickBtn_3=true
                    btnJogador3=1
                    cont+=1
                    winToGame(btnJogador1, btnJogador2, btnJogador3, btnJogador4, btnJogador5, btnJogador6, btnJogador7, btnJogador8, btnJogador9,cont, jogador,nome1,nome2)
                }
                else
                {
                    btn3.setBackgroundResource(R.drawable.ic_o)
                    jogador=true
                    btn3.isEnabled=true
                    clickBtn_3=true
                    btnJogador3=2
                    cont+=1
                    winToGame(btnJogador1, btnJogador2, btnJogador3, btnJogador4, btnJogador5, btnJogador6, btnJogador7, btnJogador8, btnJogador9,cont, jogador,nome1,nome2)
                }
            }
        }

        btn4.setOnClickListener {
            if (clickBtn_4!=true)
            {
                if (jogador==true)
                {
                    btn4.setBackgroundResource(R.drawable.ic_x)
                    jogador=false
                    btn4.isEnabled=true
                    clickBtn_4=true
                    btnJogador4=1
                    cont+=1
                    winToGame(btnJogador1, btnJogador2, btnJogador3, btnJogador4, btnJogador5, btnJogador6, btnJogador7, btnJogador8, btnJogador9,cont, jogador,nome1,nome2)
                }
                else
                {
                    btn4.setBackgroundResource(R.drawable.ic_o)
                    jogador=true
                    btn4.isEnabled=true
                    clickBtn_4=true
                    btnJogador4=2
                    cont+=1
                    winToGame(btnJogador1, btnJogador2, btnJogador3, btnJogador4, btnJogador5, btnJogador6, btnJogador7, btnJogador8, btnJogador9,cont, jogador,nome1,nome2)
                }
            }
        }

        btn5.setOnClickListener {
            if (clickBtn_5!=true)
            {
                if (jogador==true)
                {
                    btn5.setBackgroundResource(R.drawable.ic_x)
                    jogador=false
                    btn5.isEnabled=true
                    clickBtn_5=true
                    btnJogador5=1
                    cont+=1
                    winToGame(btnJogador1, btnJogador2, btnJogador3, btnJogador4, btnJogador5, btnJogador6, btnJogador7, btnJogador8, btnJogador9,cont, jogador,nome1,nome2)
                }
                else
                {
                    btn5.setBackgroundResource(R.drawable.ic_o)
                    jogador=true
                    btn5.isEnabled=true
                    clickBtn_5=true
                    btnJogador5=2
                    cont+=1
                    winToGame(btnJogador1, btnJogador2, btnJogador3, btnJogador4, btnJogador5, btnJogador6, btnJogador7, btnJogador8, btnJogador9,cont, jogador,nome1,nome2)
                }
            }
        }

        btn6.setOnClickListener {
            if (clickBtn_6!=true)
            {
                if (jogador==true)
                {
                    btn6.setBackgroundResource(R.drawable.ic_x)
                    jogador=false
                    btn6.isEnabled=true
                    clickBtn_6=true
                    btnJogador6=1
                    cont+=1
                    winToGame(btnJogador1, btnJogador2, btnJogador3, btnJogador4, btnJogador5, btnJogador6, btnJogador7, btnJogador8, btnJogador9,cont, jogador,nome1,nome2)
                }
                else
                {
                    btn6.setBackgroundResource(R.drawable.ic_o)
                    jogador=true
                    btn6.isEnabled=true
                    clickBtn_6=true
                    btnJogador6=2
                    cont+=1
                    winToGame(btnJogador1, btnJogador2, btnJogador3, btnJogador4, btnJogador5, btnJogador6, btnJogador7, btnJogador8, btnJogador9,cont, jogador,nome1,nome2)
                }
            }
        }

        btn7.setOnClickListener {
            if (clickBtn_7!=true)
            {
                if (jogador==true)
                {
                    btn7.setBackgroundResource(R.drawable.ic_x)
                    jogador=false
                    btn7.isEnabled=true
                    clickBtn_7=true
                    btnJogador7=1
                    cont+=1
                    winToGame(btnJogador1, btnJogador2, btnJogador3, btnJogador4, btnJogador5, btnJogador6, btnJogador7, btnJogador8, btnJogador9,cont, jogador,nome1,nome2)
                }
                else
                {
                    btn7.setBackgroundResource(R.drawable.ic_o)
                    jogador=true
                    btn7.isEnabled=true
                    clickBtn_7=true
                    btnJogador7=2
                    cont+=1
                    winToGame(btnJogador1, btnJogador2, btnJogador3, btnJogador4, btnJogador5, btnJogador6, btnJogador7, btnJogador8, btnJogador9,cont, jogador,nome1,nome2)
                }
            }
        }

        btn8.setOnClickListener {
            if (clickBtn_8!=true)
            {
                if (jogador==true)
                {
                    btn8.setBackgroundResource(R.drawable.ic_x)
                    jogador=false
                    btn8.isEnabled=true
                    clickBtn_8=true
                    btnJogador8=1
                    cont+=1
                    winToGame(btnJogador1, btnJogador2, btnJogador3, btnJogador4, btnJogador5, btnJogador6, btnJogador7, btnJogador8, btnJogador9,cont, jogador,nome1,nome2)
                }
                else
                {
                    btn8.setBackgroundResource(R.drawable.ic_o)
                    jogador=true
                    btn8.isEnabled=true
                    clickBtn_8=true
                    btnJogador8=2
                    cont+=1
                    winToGame(btnJogador1, btnJogador2, btnJogador3, btnJogador4, btnJogador5, btnJogador6, btnJogador7, btnJogador8, btnJogador9,cont, jogador,nome1,nome2)
                }
            }
        }

        btn9.setOnClickListener {
            if (clickBtn_9!=true)
            {
                if (jogador==true)
                {
                    btn9.setBackgroundResource(R.drawable.ic_x)
                    jogador=false
                    btn9.isEnabled=true
                    clickBtn_9=true
                    btnJogador9=1
                    cont+=1
                    winToGame(btnJogador1, btnJogador2, btnJogador3, btnJogador4, btnJogador5, btnJogador6, btnJogador7, btnJogador8, btnJogador9,cont, jogador,nome1,nome2)
                }
                else
                {
                    btn9.setBackgroundResource(R.drawable.ic_o)
                    jogador=true
                    btn9.isEnabled=true
                    clickBtn_9=true
                    btnJogador9=2
                    cont+=1
                    winToGame(btnJogador1, btnJogador2, btnJogador3, btnJogador4, btnJogador5, btnJogador6, btnJogador7, btnJogador8, btnJogador9,cont, jogador,nome1,nome2)
                }
            }
        }

    }

    private fun dialogZebraToGame()
    {
        val dialog= LayoutInflater.from(this).inflate(R.layout.dialog_zebra, null)

        val builder= AlertDialog.Builder(this)
        builder.setView(dialog)

        val alertDialog= builder.show()

        val buttomConf= dialog.findViewById<Button>(R.id.btn_conf_dialog)
        val buttomRev= dialog.findViewById<Button>(R.id.btn_retry_dialog)

        buttomConf.setOnClickListener {
            finish()
            alertDialog.dismiss()
            startActivity(Intent(this, MainActivity::class.java))
        }
        buttomRev.setOnClickListener {
            finish()
            alertDialog.dismiss()
            startActivity(Intent(this, PvPActivity::class.java))
        }
    }
    private fun dialogWinToGame(jogador:Boolean, textjogador1:String, textjogador2:String)
    {
        val dialog= LayoutInflater.from(this).inflate(R.layout.dialog_win_to_game, null)

        val builder= AlertDialog.Builder(this)
        builder.setView(dialog)

        val alertDialog= builder.show()

        val buttomConf= dialog.findViewById<Button>(R.id.btn_conf_dialog)
        val buttomRev= dialog.findViewById<Button>(R.id.btn_retry_dialog)
        val textWin = dialog.findViewById<TextView>(R.id.text_name_player_dialog)
        if(jogador)
        {
            textWin.text= textjogador1
            textWin.setTextColor(resources.getColor(R.color.vermelho_x))
        }
        else
        {
            textWin.text = textjogador2
            textWin.setTextColor(resources.getColor(R.color.azul_bola))
        }
        buttomConf.setOnClickListener {
            finish()
            alertDialog.dismiss()
            startActivity(Intent(this, MainActivity::class.java))
        }
        buttomRev.setOnClickListener {
            finish()
            alertDialog.dismiss()
            startActivity(Intent(this, PvPActivity::class.java))
        }
    }

    private fun winToGame(btnJogador1:Int, btnJogador2:Int, btnJogador3:Int,
                          btnJogador4:Int, btnJogador5:Int, btnJogador6:Int,
                          btnJogador7:Int, btnJogador8:Int, btnJogador9:Int,
                          cont:Int, jogada:Boolean,nome1:String, nome2:String) {


        //verificação na horizontal
        if (btnJogador1==1 && btnJogador2==1 && btnJogador3==1)
        {
            Toast.makeText(this,"Jogador 1 venceu !",Toast.LENGTH_SHORT).show()
            winJogador=true
            sair=true
        }
        else if(btnJogador1==2 && btnJogador2==2 && btnJogador3==2)
        {
            Toast.makeText(this,"Jogador 2 venceu !",Toast.LENGTH_SHORT).show()
            winJogador=false
            sair=true
        }


        else if (btnJogador4==1 && btnJogador5==1 && btnJogador6==1)
        {
            Toast.makeText(this,"Jogador 1 venceu !",Toast.LENGTH_SHORT).show()
            winJogador=true
            sair=true
        }
        else if(btnJogador4==2 && btnJogador5==2 && btnJogador6==2)
        {
            Toast.makeText(this,"Jogador 2 venceu !",Toast.LENGTH_SHORT).show()
            winJogador=false
            sair=true
        }


        else if (btnJogador7==1 && btnJogador8==1 && btnJogador9==1)
        {
            Toast.makeText(this,"Jogador 1 venceu !",Toast.LENGTH_SHORT).show()
            winJogador=true
            sair=true
        }
        else if(btnJogador7==2 && btnJogador8==2 && btnJogador9==2)
        {
            Toast.makeText(this,"Jogador 2 venceu !",Toast.LENGTH_SHORT).show()
            winJogador=false
            sair=true
        }


        //verificação na vertical
        else if (btnJogador1==1 && btnJogador4==1 && btnJogador7==1)
        {
            Toast.makeText(this,"Jogador 1 venceu !",Toast.LENGTH_SHORT).show()
            winJogador=true
            sair=true
        }
        else if(btnJogador1==2 && btnJogador4==2 && btnJogador7==2)
        {
            Toast.makeText(this,"Jogador 2 venceu !",Toast.LENGTH_SHORT).show()
            winJogador=false
            sair=true
        }


        else if (btnJogador2==1 && btnJogador5==1 && btnJogador8==1)
        {
            Toast.makeText(this,"Jogador 1 venceu !",Toast.LENGTH_SHORT).show()
            winJogador=true
            sair=true
        }
        else if(btnJogador2==2 && btnJogador5==2 && btnJogador8==2)
        {
            Toast.makeText(this,"Jogador 2 venceu !",Toast.LENGTH_SHORT).show()
            winJogador=false
            sair=true
        }


        else if (btnJogador3==1 && btnJogador6==1 && btnJogador9==1)
        {
            Toast.makeText(this,"Jogador 1 venceu !",Toast.LENGTH_SHORT).show()
            winJogador=true
            sair=true
        }
        else if(btnJogador3==2 && btnJogador6==2 && btnJogador9==2)
        {
            Toast.makeText(this,"Jogador 2 venceu !",Toast.LENGTH_SHORT).show()
            winJogador=false
            sair=true
        }


        //verificação na diagonal
        else if (btnJogador1==1 && btnJogador5==1 && btnJogador9==1)
        {
            Toast.makeText(this,"Jogador 1 venceu !",Toast.LENGTH_SHORT).show()
            winJogador=true
            sair=true
        }
        else if(btnJogador1==2 && btnJogador5==2 && btnJogador9==2)
        {
            Toast.makeText(this,"Jogador 2 venceu !",Toast.LENGTH_SHORT).show()
            winJogador=false
            sair=true
        }


        else if (btnJogador3==1 && btnJogador5==1 && btnJogador7==1)
        {
            Toast.makeText(this,"Jogador 1 venceu !",Toast.LENGTH_SHORT).show()
            winJogador=true
            sair=true
        }
        else if(btnJogador3==2 && btnJogador5==2 && btnJogador7==2)
        {
            Toast.makeText(this,"Jogador 2 venceu !",Toast.LENGTH_SHORT).show()
            winJogador=false
            sair=true
        }


        //verificar se deu velha
        else if(cont==9)
        {
            Toast.makeText(this,"Empate",Toast.LENGTH_SHORT).show()
            dialogZebraToGame()
        }

       if(sair)
        {
            dialogWinToGame(jogada, nome1, nome2)
        }
    }

    override fun onResume()
    {
        btn1=findViewById(R.id.btn_1)
        btn2=findViewById(R.id.btn_2)
        btn3=findViewById(R.id.btn_3)
        btn4=findViewById(R.id.btn_4)
        btn5=findViewById(R.id.btn_5)
        btn6=findViewById(R.id.btn_6)
        btn7=findViewById(R.id.btn_7)
        btn8=findViewById(R.id.btn_8)
        btn9=findViewById(R.id.btn_9)
        textjogador1=findViewById(R.id.text_player1)
        textjogador2=findViewById(R.id.text_player2)

        super.onResume()
    }
}