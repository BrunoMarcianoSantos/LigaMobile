package com.example.ligajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void MostrarBatman(View v)
    {
        Intent intent = new Intent(this, ActivityBatman.class);
        startActivity(intent);
    }

    public void MostrarSuperman(View v)
    {
        Intent intent = new Intent(this, ActivitySuperman.class);
        startActivity(intent);
    }

    public void MostrarFlash(View v)
    {
        Intent intent = new Intent(this, ActivityFlash.class);
        startActivity(intent);
    }

    public void EnviarDadosemail(View v) throws UnsupportedEncodingException
    {
        String uriText =
                "mailto:brunomarcianosantos@gmail.com" +
                        "?subject=" + URLEncoder.encode("Dados do Lanterna Verde", "utf-8") +
                        "&body=" + URLEncoder.encode("Codinome:Lanterna Verde\nNome:Hal Jordan\nEspécie:Humano\n" +
                        "Nível de Acesso:1\nEquipamento:Anel do Poder\nHabilidades:Criar qualquer coisa com a força de vontade\n" +
                        "Vulnerabilidades: O anel pode descarregar", "utf-8");
        Uri uri = Uri.parse(uriText);
        Intent it = new Intent(Intent.ACTION_SENDTO);
        it.setData(uri);
        startActivity(Intent.createChooser(it, "Enviar Email"));
    }


}