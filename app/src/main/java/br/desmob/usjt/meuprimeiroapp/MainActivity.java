package br.desmob.usjt.meuprimeiroapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    //constante static para identificar a mensagem
    public final static String EXTRA_MESSAGE = "br.desmob.usjt.meuprimeiroapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Envia mensagem para outra view
    public void sendMsg(View view)
    {
        Intent internt = new Intent(this,DisplayMessageActivity.class); // classe aonde o intent ira levar os dados
        EditText editText = (EditText) findViewById(R.id.edit_msg); // busca a mensagem na view
        String message = editText.getText().toString(); // Pega a mensagem do vind view
        internt.putExtra(EXTRA_MESSAGE, message);
        startActivity(internt);

    }
}

