package com.example.veilitionapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.veilitionapp.R;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etEmail, etPassword, etNama, etTelepon, etAlamat;
    Button buttonDaftar;
    TextView tvLogin;
    String email, password, nama, telepon, alamat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etNama = findViewById(R.id.etNama);
        etTelepon = findViewById(R.id.etNoTelp);
        etAlamat = findViewById(R.id.etAlamat);
        buttonDaftar = findViewById(R.id.btnDaftar);
        tvLogin = findViewById(R.id.tv_loginreg);

        buttonDaftar.setOnClickListener(this);
        tvLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnDaftar:
                email = etEmail.getText().toString();
                password = etPassword.getText().toString();
                nama = etNama.getText().toString();
                telepon = etTelepon.getText().toString();
                alamat = etAlamat.getText().toString();
                daftar(email, password, nama, telepon, alamat);
                break;
            case R.id.tv_loginreg:
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                finish();
        }
    }

    private void daftar(String email, String password, String nama, String telepon, String alamat) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}