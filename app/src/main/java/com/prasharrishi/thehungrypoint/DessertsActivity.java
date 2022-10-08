package com.prasharrishi.thehungrypoint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DessertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);

        ListView dessertsList = findViewById(R.id.list_view_desserts);

        Dish[] desserts = {

                new Dish("Shahi Kheer", "Rice boiled in milk served with kesar", 250),
                new Dish("Sahi Tukra", "Deep fried bread piece served with a sweet sauce", 150),
                new Dish("Rasmalai", "Special Indian sweet served with sweet milk", 300),
                new Dish("Gulab Jammun", "Bread Rolls served hot with sugar water", 150),
                new Dish("Rasogulla", "White bread Rolls served hot with sugar water", 150),
                new Dish("Moong daal ka halwa", "Mashed sweet Lentil", 100),
                new Dish("Ice Creams", "Variety of Flavours to choose from", 200),
                new Dish("Too Much Brownie", "Szilling hot brownie served with an icecream", 300)
        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, desserts);

        dessertsList.setAdapter(dishesAdapter);
    }
}