package com.jmbp.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Formulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        //crear objetos layout
        Button btnValidar=findViewById(R.id.btnValidar);
        EditText edNombre,edApellidos,edCedula,edCorreo,edDireccion;
        edNombre=findViewById(R.id.txtNombre);
        edApellidos=findViewById(R.id.txtApellido);
        edCedula=findViewById(R.id.txtCedula);
        edCorreo=findViewById(R.id.txtCorreo);
        edDireccion=findViewById(R.id.txtDireccion);

        btnValidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre=edNombre.getText().toString();
                String apellido=edApellidos.getText().toString();
                String cedula=edCedula.getText().toString();
                String correo=edCorreo.getText().toString();
                String direccion=edDireccion.getText().toString();
                    if(!nombre.isEmpty()
                    && !apellido.isEmpty()
                    && !cedula.isEmpty()
                    && !correo.isEmpty()
                    && !direccion.isEmpty()) {
                        Toast.makeText(Formulario.this,"Ingreso exitoso!",Toast.LENGTH_LONG).show();
                    }else{

                    Toast.makeText(Formulario.this,"No dejar campos en blanco",Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}