package com.example.videojuego

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var radioGroup: RadioGroup
    private lateinit var mensajeTextView: TextView
    private lateinit var mensaje2: TextView
    private lateinit var checkBoxquest: CheckBox
    private var firtsCheck = true


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkBoxquest= findViewById(R.id.checkBoxQuestion)
        radioGroup = findViewById(R.id.GroupGames)
        mensajeTextView = findViewById(R.id.textViewMessage)
        mensaje2 = findViewById(R.id.textViewmess2)

        // Configura un Listener para el RadioGroup
        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            // Verifica cuál RadioButton se ha seleccionado
            val radioButton = findViewById<RadioButton>(checkedId)

            // Cambia el mensaje de acuerdo al RadioButton seleccionado
            val mensaje = "Veo que te gusta el ${radioButton.text}"
            mensajeTextView.text = mensaje
        }

        checkBoxquest.setOnClickListener {
           //selecciona checkbox
            if(firtsCheck){
                val mensaje ="si que te mola"
                mensaje2.text = mensaje
                firtsCheck=false
            }else {
                val mensaje ="“¡¿No te molan!?”"
                mensaje2.text = mensaje
                firtsCheck=true
            }

        }
    }


}