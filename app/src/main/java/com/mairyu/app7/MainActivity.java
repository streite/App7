package com.mairyu.app7;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final TextView txtStart = (TextView) findViewById(R.id.txtStart);
        TextView txtI = (TextView) findViewById(R.id.txtI);
        final TextView txtSwitch = (TextView) findViewById(R.id.txtSwitch);

        Button btnLoop = (Button) findViewById(R.id.btnLoop);
        Button btnSwitch = (Button) findViewById(R.id.btnSwitch);

        btnLoop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

/*                for (int i = 0; i <= 10; i++) {
                    txtStart.setText(i + "");
                }*/

                int i = 0;

                while (i <= 10) {
                    txtStart.setText(i + "");
                    i++;
                }

                txtI.setText(i + "");

        /*        int y = 0;

                do {

                    txtStart.setText(y + "");
                    y++;

                } while (y < 15);*/

            }
        });

        btnSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nameString = "Animal Name";

                switch (nameString){

                    case "Animal1":
                        txtSwitch.setText("Our Animal Name is Animal 1");
                        break;
                    
                }
            }
        });

}
