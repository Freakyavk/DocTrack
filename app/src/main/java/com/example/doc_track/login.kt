package com.example.doc_track

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class login : AppCompatActivity() {
    lateinit var user : EditText
    lateinit var pass : EditText
    lateinit var but : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        user=findViewById(R.id.editTextEmail)
        pass=findViewById(R.id.editTextPassword)
        but=findViewById(R.id.buttonLogin)

        but.setOnClickListener(object:View.OnClickListener{
            override fun onClick(p0: View?) {
                var a="AVK"
                var b="aakash"
                if (user.text.toString() == a && pass.text.toString() == b){
                    var i = Intent(this@login,Home::class.java)
                    startActivity(i)
                }
                else{
                    Toast.makeText(this@login,"Invalid Username or Password",Toast.LENGTH_LONG).show()
                }
            }
        })
    }
}