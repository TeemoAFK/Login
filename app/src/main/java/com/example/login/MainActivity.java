package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
private EditText et1;
private EditText et2;
private String clave1 = "1234op";
private String usuario1 = "oscar";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText2);

    }

    public void cerrrarAPP(View view){
        finish();
    }

    public void accesso(View view) {
        String usuario=et1.getText().toString();
        String clave=et2.getText().toString();
        if(usuario.equals(usuario1) && clave.equals(clave1)){
            Intent i = new Intent(this, accessgranted.class);
            startActivity(i);
        }else{
            Intent i = new Intent(this, accesodenegado.class);
            startActivity(i);
        }
    }
}


