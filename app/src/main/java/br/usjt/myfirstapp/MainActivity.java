package br.usjt.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
    }
    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class); }
    public final static String EXTRA_MESSAGE =
            "br.usjt.meuprimeiroapp.MESSAGE"; //será chamado quando o usuário clicar em Enviar public void sendMessage(View view){
    Intent intent = new Intent(this, DisplayMessageActivity.class);
    EditText editText = (EditText) findViewById(R.id.edit_message);
    String message = editText.getText().toString();
    intent.putExtra(EXTRA_MESSAGE, message);
}