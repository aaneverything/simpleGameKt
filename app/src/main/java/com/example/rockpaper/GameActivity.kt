package com.example.rockpaper

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GameActivity : AppCompatActivity() {

    lateinit var computer : ImageView
    lateinit var rockButton: ImageButton
    lateinit var paperButton: ImageButton
    lateinit var scissorsButton: ImageButton
    lateinit var hasilcomputer: ImageView
    lateinit var keterangan: TextView

    private fun initComponents(){
        computer = findViewById(R.id.computer)
        rockButton = findViewById(R.id.rockButton)
        paperButton = findViewById(R.id.paperButton)
        scissorsButton = findViewById(R.id.guntingButton)
        hasilcomputer = findViewById(R.id.hasilcomputer)
        keterangan = findViewById(R.id.keterangan)
    }

    private fun iniListener(){
        rockButton.setOnClickListener {
            startGame("rock")
        }
        paperButton.setOnClickListener {
            startGame("paper")
        }
        scissorsButton.setOnClickListener {
            startGame("scissors")
        }
    }

    private fun startGame(option : String){
        val computerOption = game.randd()
        computer.setImageResource(game.pickdrwa(computerOption))

        when {
            game.isDraw(option, computerOption) -> {
                hasilcomputer.setImageResource(R.drawable.draw)
                keterangan.text = "Draw anjer"
            }
            game.isWin(option, computerOption) -> {
                hasilcomputer.setImageResource(R.drawable.menang)
                keterangan.text = "Kamu Menang coy"
            }
            else -> {
                hasilcomputer.setImageResource(R.drawable.kalah)
                keterangan.text = "Kamu Kalah wkwkwkw"
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game)

        initComponents()
        iniListener()
    }

}