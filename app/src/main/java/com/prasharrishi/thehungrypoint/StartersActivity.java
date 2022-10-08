package com.prasharrishi.thehungrypoint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ListView startersList = findViewById(R.id.list_view_starters);

        Dish[] dishes = {
                new Dish("Tomato Soup","Fresh Tomato soup,Topped up with fresh cream and bread cuts",150),
                new Dish("Manchow Soup","A dark brown soup prepared with various vegetables, scallions, and chicken, thickened with broth and corn flour",200),
                new Dish("Panner Tikka","An Indian dish made from chunks of paneer marinated in spices and grilled in a tandoor.",250),
                new Dish("Potato Kabab","A delicious snack cum starter made using mixed vegetables.",250),
                new Dish("Honey Chilli Potato","fried chilli potato fingers are tossed in a sesame honey chilli sauce.",200),
                new Dish("Honey Chilli Cauliflower","fried chilli cauli fingers are tossed in a sesame honey chilli sauce.",200),
                new Dish("Panner 65","A spicy Hyderabadi appetizer made with paneer, flour, yogurt, curry leaves and spices.",300),
                new Dish("Veg Spring Roll","Rolls filled with minced vegetables, folded into a food wrapper made from dough or rice paper.",350),
                new Dish("Chilli Panner","A popular Indo-Chinese dish where cubes of fried crispy paneer are tossed in a spicy sauce made with soy sauce, vinegar & chili",400),
                new Dish("Chicken Tangdi","Chicken leg served with kemma inside the chicken leg piece",350),
                new Dish("Chilli Chicken","Chicken tossed in hot garlic sauce served with spring onions on top",400),
                new Dish("Chicken Lolipop","Chicken leg piece grilled in a tandoor",450),
                new Dish("Chicken Barbeque","Chicken grilled on slow heat coal",500),
                new Dish("Tandoori Fish","Boneless fish pieces grilled in traditional Indian tandoor",550),
                new Dish("Tandoori Prawns","Prawns pieces grilled in traditional Indian tandoor",550),
                new Dish("Fish Fingers","Deep fried Fish served with Poatato chips",600),
                new Dish("Chicken Afgani","Tandoori chicken made with fresh creamy afgani sauce",600),
                new Dish("Mutton Roast","Fresh mutton roasted with Indian Spices",650),
                new Dish("Mutton Tunda Soup","Mutton leg piece soup",680),
                new Dish("Tunde Kabab","Beef and Mutton meat mixed together with Indian spices",700),
        };



        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);

        startersList.setAdapter(dishesAdapter);


    }
}