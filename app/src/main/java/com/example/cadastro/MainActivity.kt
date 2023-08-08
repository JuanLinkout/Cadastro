package com.example.cadastro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.RadioButton
import android.widget.Toast
import com.example.cadastro.databinding.ActivityMainBinding
import com.example.cadastro.models.Form

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConfirm.setOnClickListener { handleOnClickListener() }
        binding.buttonClear.setOnClickListener { handleOnClearClickListener() }
    }

    private fun handleOnClickListener() {
        val checkedRadioId = binding.radioGroupGender.checkedRadioButtonId
        var selectedText: String? = null
        val selectedRadioButton = findViewById<RadioButton>(checkedRadioId)
        if (selectedRadioButton != null) selectedText = selectedRadioButton.text.toString()

        val form = Form(
            name = binding.editTextFullName.text.toString(),
            email = binding.editTextEmail.text.toString(),
            city = binding.editTextCity.text.toString(),
            phone = binding.editTextPhone.text.toString(),
            sex = selectedText,
            shouldReceiveNewsletter = if (binding.checkBoxEmailList.isChecked) "Sim" else "Não"
        )

        Toast.makeText(this, form.toString(), Toast.LENGTH_SHORT).show()
    }

    private fun handleOnClearClickListener() {
        binding.editTextFullName.text = null
        binding.editTextEmail.text = null
        binding.editTextCity.text = null
        binding.editTextPhone.text = null
        binding.radioGroupGender.clearCheck()
        binding.checkBoxEmailList.isChecked = false
    }
}