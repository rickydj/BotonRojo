package com.orbitalsoftware.botonrojo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.EditText;

public class Inicio extends AppCompatActivity {

    public final static String EXTRA_MESSAGE ="com.orbitalsoftware.botonrojo.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_inicio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    ///////////MIS METODOS INICIALES ANDROID/////////////////

    public void sendMessage(View view){
        //Se envia el mensaje a otra vista
        //La clase no existe, se creara luego
        Intent intent = new Intent(this, MostrarMensaje.class);
        //Conectar la informacion del campo de texto a un objeto java
        EditText editText=(EditText) findViewById(R.id.edit_message);
        //Tomar el mensaje y colocarlo en una objeto String
        String message = editText.getText().toString();
        //Colocar el mensaje dentro del intent como una constante
        intent.putExtra(EXTRA_MESSAGE,message);
        //Iniciar la actividad (Ejecutar el metodo)
        startActivity(intent);
    }
}
