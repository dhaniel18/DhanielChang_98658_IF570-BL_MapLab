package com.example.lab_week_01 // Pastikan nama paket ini sesuai dengan proyek Anda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {


    private lateinit var etName: TextInputEditText
    private lateinit var btnSubmitName: Button
    private lateinit var etStudentNumber: TextInputEditText
    private lateinit var btnSubmitNim: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        etName = findViewById(R.id.et_name)
        btnSubmitName = findViewById(R.id.btn_submit_name)
        etStudentNumber = findViewById(R.id.et_student_number)
        btnSubmitNim = findViewById(R.id.btn_submit_nim)


        btnSubmitName.setOnClickListener {
            val name = etName.text.toString().trim() // .trim() untuk menghilangkan spasi di awal/akhir

            if (name.isEmpty()) {
                Toast.makeText(this, "Nama tidak boleh kosong!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Halo, $name!", Toast.LENGTH_LONG).show()
            }
        }


        btnSubmitNim.setOnClickListener {
            val studentNumber = etStudentNumber.text.toString().trim()

            if (studentNumber.isEmpty()) {
                Toast.makeText(this, "Nomor mahasiswa tidak boleh kosong!", Toast.LENGTH_SHORT).show()
            } else if (studentNumber.length != 11) {
                Toast.makeText(this, "Nomor mahasiswa harus 11 digit!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "NIM Anda: $studentNumber", Toast.LENGTH_LONG).show()
            }
        }
    }
}