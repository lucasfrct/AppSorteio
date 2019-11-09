package com.lucas.costa.appsorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void buttonPlay (View view ) {
        TextView setNumberView = findViewById( R.id.numberView );
        TextView nDisplay = findViewById( R.id.numberDisplay );

        int number = this.numberSorted ( );

        setNumberView.setText( "O número selecionado é:" );
        nDisplay.setText( "" + number + "" );
    }

    public int numberSorted ( ) {
        return new Random ( ).nextInt ( 10 );
    }
}
