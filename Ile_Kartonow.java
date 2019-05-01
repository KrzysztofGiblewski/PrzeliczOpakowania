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
                long ileWorkow = Integer.valueOf(String.valueOf(editTextIleWorkow.getText()));
                long ileWKartonie = Integer.valueOf(String.valueOf(editTextIleWKartonie.getText()));

                long ileKartonow = kalkukatorKartonow.policzIloscOpakowań(ileWorkow, ileWKartonie);
                long wOstatnimKartonie = kalkukatorKartonow.policzIleWOstatnimKartonie(ileWorkow, ileWKartonie);
                //jesli miniej jest zrobione niz mieści pelen karton to wyswietl ilosc zrobiona
                if (ileWorkow < ileWKartonie)
                    tekstWyswietlany.setText("jedno opakowanie " + ileWorkow);
                if (wOstatnimKartonie > 0)
                    tekstWyswietlany.setText("wychodzi że to " + ileKartonow + " pełnych opakowań a w ostatnim " + wOstatnimKartonie);
                else
                    tekstWyswietlany.setText("wychodzi że to " + ileKartonow + " pełnych opakowań ");

            }
        });


    }
}
