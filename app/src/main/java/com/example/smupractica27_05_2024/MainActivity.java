package com.example.smupractica27_05_2024;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void clickBotonIngresar(View view){
        TextInputLayout tilUsuario = findViewById(R.id.tilUsuario);
        TextInputEditText txtCedula = findViewById(R.id.txtCedula);
        String cedula = txtCedula.getText().toString();
        if (cedula.equals("") || cedula.length()!=10{
            tilUsuario.setError("Ingrese una cédula");
        }else
            tilUsuario.setError("");
    }

    public void clickBotonCancelar(View view){

        TextInputLayout tilUsuario = findViewById(R.id.tilUsuario);
        TextInputEditText txtClave = findViewById(R.id.txtClave);
        String cedula = txtClave.getText().toString();
        if (cedula.equals("")){
            tilUsuario.setError("Ingrese una clave");
        }else
            tilUsuario.setError("");
        }
    }
}