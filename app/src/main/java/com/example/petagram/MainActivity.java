
package com.example.petagram;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.time.Year;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Button Fecha_boton;
    Calendar c;
    DatePickerDialog dpd;
    EditText editTextTextPersonName, editTextPhone, editTextTextEmailAddress, descripcionContacto, Enviar_datos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fecha_boton= (Button) findViewById(R.id.Fecha_boton);
        Fecha_boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                c= Calendar.getInstance();
                int day = c.get(Calendar.DAY_OF_MONTH);
                int month = c.get(Calendar.MONTH);
                int year = c.get(Calendar.YEAR);

                dpd = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int mYear, int mMonth, int mDayOfMonth) {

                    }
                }, day, month, year);
                dpd.show();

            }
        });
    }

    @Override
    public void sendFeedback(View button) {
        // Do click handling here

        final EditText nameField = (EditText) findViewById(R.id.editTextTextPersonName);
        String name = nameField.getText().toString();

        final EditText phoneField = (EditText) findViewById(R.id.editTextPhone);
        String phone = phoneField.getText().toString();

        final EditText emailField = (EditText) findViewById(R.id.editTextTextEmailAddress);
        String email = emailField.getText().toString();

        final EditText descripcionField = (EditText) findViewById(R.id.descripcionContacto);
        String descripcion = descripcionField.getText().toString();

    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        SetContentView(R.layout.activity_main);

        Fecha_boton = findViewById(R.id.Fecha_boton);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextPhone = findViewById(R.id.editTextPhone);
        editTextTextEmailAddress = findViewById(R.id.editTextTextEmailAddress);
        descripcionContacto = findViewById(R.id.descripcionContacto);

    }
     public void Siguiente(View v){
       Enviar_datos.setText(Fecha_boton.getText().toString()+"    "+editTextTextPersonName.getText().toString()+"    "+editTextPhone.getText());

     }
}