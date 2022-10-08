package com.prasharrishi.thehungrypoint;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    CardView startersCard;
    CardView mainsCard;
    CardView dessertsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startersCard = findViewById(R.id.card_view_starters);
        mainsCard = findViewById(R.id.card_view_mains);
        dessertsCard = findViewById(R.id.card_view_desserts);


        startersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent startersActivityIntent = new Intent(MainActivity.this, StartersActivity.class);

                startActivity(startersActivityIntent);
            }
        });

        mainsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainCoursesActivityIntent = new Intent(MainActivity.this, MainCoursesActivity.class);

                startActivity(mainCoursesActivityIntent);

            }
        });

        dessertsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent dessertsActivityIntent = new Intent(MainActivity.this, DessertsActivity.class);
                startActivity(dessertsActivityIntent);

            }
        });

        TextView emailTexView = findViewById(R.id.text_view_email_address);
        emailTexView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchEmailAppIntent = new Intent(Intent.ACTION_SENDTO);
                launchEmailAppIntent.setData(Uri.parse("mailto:thehungrypoint@rishiprashar.com"));
                startActivity(launchEmailAppIntent);
            }
        });

        TextView phone_number_view = findViewById(R.id.text_view_phone_number);
        phone_number_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchPhoneApp = new Intent(Intent.ACTION_DIAL);
                launchPhoneApp.setData(Uri.parse("tel: 6200587198"));
                if (launchPhoneApp.resolveActivity(getPackageManager()) != null) {
                    startActivity(launchPhoneApp);
                }
            }
            });


        }

    }
