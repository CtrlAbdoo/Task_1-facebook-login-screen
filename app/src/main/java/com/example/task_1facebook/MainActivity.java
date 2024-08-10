package com.example.task_1facebook;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etMobileOrEmail, etPassword;
    private Button btnLogin, btnCreateAccount;
    private TextView tvForgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMobileOrEmail = findViewById(R.id.et_mobile_or_email);
        etPassword = findViewById(R.id.et_password);
        btnLogin = findViewById(R.id.btn_login);
        btnCreateAccount = findViewById(R.id.btn_create_account);
        tvForgotPassword = findViewById(R.id.tv_forgot_password);

        btnLogin.setOnClickListener(v -> {
            String mobileOrEmail = etMobileOrEmail.getText().toString().trim();
            String password = etPassword.getText().toString().trim();
            // Handle login logic here
            Toast.makeText(MainActivity.this, "Login clicked", Toast.LENGTH_SHORT).show();
        });

        btnCreateAccount.setOnClickListener(v -> {
            // Handle create account logic here
            Toast.makeText(MainActivity.this, "Create new account clicked", Toast.LENGTH_SHORT).show();
        });

        tvForgotPassword.setOnClickListener(v -> {
            // Handle forgot password logic here
            Toast.makeText(MainActivity.this, "Forgot password clicked", Toast.LENGTH_SHORT).show();
        });
    }
}
