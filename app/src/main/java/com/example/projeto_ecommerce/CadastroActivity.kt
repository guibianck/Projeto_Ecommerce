package com.example.projeto_ecommerce

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)



        val tiposUsuario = resources.getStringArray(R.array.tipos_usuario)

        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, tiposUsuario)

        val autoCompleteTextView: AutoCompleteTextView = findViewById(R.id.autoCompleteTipoUsuario)


        autoCompleteTextView.setAdapter(adapter)

    }
}
