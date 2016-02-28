package com.orbitalsoftware.botonrojo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MostrarMensaje extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_mensaje);

        //Traigo la llamada desde Inicio
        Intent intent=getIntent();
        //Cargo el texto del objeto estatico EXTRA_MESSAGE y lo convierto en un objeto tipo String
        String mensaje = intent.getStringExtra(Inicio.EXTRA_MESSAGE);
//Creo un objeto tipo TextView que sera colocado en el layout de MostrarMensaje
        TextView texto= new TextView(this);

        //Ajusto el tamaño del texto
        texto.setTextSize(40);
        //Le coloco el mensaje de la vista anterior
        texto.setText(mensaje);
        //Cargo el layout de la respuesta (id: contenido)
        RelativeLayout layout=(RelativeLayout) findViewById(R.id.contenido);
        //Agrego el TextView al Layout
        layout.addView(texto);

    }

}
