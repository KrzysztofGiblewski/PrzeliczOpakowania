package com_krzysztofgiblewski.github.ilekartonow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ile_Kartonow extends AppCompatActivity {
    private Button button1;
    private EditText editTextIleWKartonie;
    private EditText editTextIleWorkow;
    private TextView tekstWyswietlany;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ile__kartonow);
        tekstWyswietlany = (TextView) findViewById(R.id.tekstWyswietlany);
        editTextIleWorkow = (EditText) findViewById(R.id.editTextIleWorkow);
        editTextIleWKartonie = (EditText) findViewById(R.id.editTextIleWKartonie);
        button1 = (Button) findViewById(R.id.button1);
        // tu twortze onclicklistener
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KalkulatorKartonow kalkukatorKartonow = new KalkulatorKartonow();
                int ileWorkow = Integer.valueOf(String.valueOf(editTextIleWorkow.getText()));
                int ileWKartonie = Integer.valueOf(String.valueOf(editTextIleWKartonie.getText()));

                int ileKartonow = kalkukatorKartonow.policzIloscOpakowań(ileWorkow, ileWKartonie);
                int wOstatnimKartonie = kalkukatorKartonow.policzIleWOstatnimKartonie(ileWorkow, ileWKartonie);
                tekstWyswietlany.setText("wychodzi że to " + ileKartonow + " pełnych opakowań a w ostatnim " + wOstatnimKartonie);
            }
        });


    }
}
