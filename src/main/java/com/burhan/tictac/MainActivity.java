package com.burhan.tictac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button b[][] = new Button[3][3];


        b[0][0] = (Button) findViewById(R.id.b1);
        b[0][1] = (Button) findViewById(R.id.b2);
        b[0][2] = (Button) findViewById(R.id.b3);

        b[1][0] = (Button) findViewById(R.id.b4);
        b[1][1] = (Button) findViewById(R.id.b5);
        b[1][2] = (Button) findViewById(R.id.b6);

        b[2][0] = (Button) findViewById(R.id.b7);
        b[2][1] = (Button) findViewById(R.id.b8);
        b[2][2] = (Button) findViewById(R.id.b9);

        View.OnClickListener mylistner = new View.OnClickListener() {
            int turn = 0;

            @Override
            public void onClick(View v) {
                Button thisbutton =(Button) v;
                     if(!thisbutton.getText().toString().equals("-"))
                return;
                if (turn%2==0){
                    thisbutton.setText("0");
                }
                else
                    thisbutton.setText("X");
                turn++;

                if(b[0][0].getText().toString().equals("0")&&(b[0][0].getText().toString().equals("0") && (b[0][0].getText().toString().equals("0") ))){
//                   Toast.makeText(getApplicationContext(), Text:"0 Wins",Toast.LENGTH_SHORT.show();
                };
            }
        };
 
        for (int i=0; i<3; i++){

            for (int j=0; j<3; j++){

                b[i][j].setOnClickListener(mylistner);
            }
        }

    }
}




