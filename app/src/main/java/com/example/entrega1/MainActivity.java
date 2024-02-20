package com.example.entrega1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    TextView nombreUsuario;
    Button btn1,btn2, Send;
    String Tag = "Prueba";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nombreUsuario = (TextView) findViewById(R.id.usuario);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        Send = findViewById(R.id.btnSend);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombreUsuario.setText("Presioné Boton Uno");
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombreUsuario.setText("Presioné Boton Dos");
            }
        });


        Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pasarInformacion();
            }
        });
    }

        private void pasarInformacion() {
            String textoActual = nombreUsuario.getText().toString();
            String nombre = "Mariana";
            Intent pasarInfo = new Intent(this, PantallaTwo.class);

            pasarInfo.putExtra("name", nombre);
            startActivity(pasarInfo);
        }



        @Override
        protected void onStart(){
            super.onStart();
            Log.i(Tag, "Estoy en onStart");

            nombreUsuario = (TextView) findViewById(R.id.usuario);
            btn1 = findViewById(R.id.btn1);
            btn2 = findViewById(R.id.btn2);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    nombreUsuario.setText("Login now");
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    nombreUsuario.setText("Ingresar con tu cuenta");
                }
            });

        }

        @Override
        protected void onRestart(){
            super.onRestart();
            Log.i(Tag, "Estoy en onRestart");
        }

        @Override
        protected void onResume(){
            super.onResume();
            Log.i(Tag, "Estoy en onResume");
            nombreUsuario.setText("Estas en onResume");
        }

        @Override
        protected void onPause(){
            super.onPause();
            Log.i(Tag, "Estoy en onPause");
            nombreUsuario.setText("Estas en onPause");
        }

        @Override
        protected void onStop(){
            super.onStop();
            Log.i(Tag, "Estoy en onStop");
        }

        @Override
        protected void onDestroy(){
            super.onDestroy();
            Log.i(Tag, "Estoy en onDestroy");
        }

}