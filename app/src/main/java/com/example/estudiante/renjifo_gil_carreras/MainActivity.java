package com.example.estudiante.renjifo_gil_carreras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Comunicacion.OnMessage  {


    Button btn_play;
    Button btn_stop;

    TextView tv_p1;
    TextView tv_p2;
    TextView tv_p3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Comunicacion com = new Comunicacion();
        com.setObserver(this);
        com.start();

    }



    @Override
    public void onReceived(String input) {
        System.out.println(input);

        //runOnUIThread(new Runn...);

    }
}
