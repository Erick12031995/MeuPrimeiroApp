package br.desmob.usjt.meuprimeiroapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent(); // pega o intent que chamou a activity
        String  message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE); // recuperar os dados da activity que passou s dados

        TextView textView = new TextView(this); // instancia um textView
        textView.setTextSize(40); //  define tamanho do texto
        textView.setText(message); // passa a mensagem para o text view

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        layout.addView(textView);



    }
}
