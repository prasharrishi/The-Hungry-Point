package com.prasharrishi.thehungrypoint;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainCoursesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);

        ListView mainCoursesList = findViewById(R.id.list_view_main_courses);

        Dish [] mainCourses = {
                new Dish("Panner Tikka Masala","Panner tikka served hot with Tomato gravy",400),
                new Dish("Panner 65 Masala","Deep fried Panner gravy",400),
                new Dish("Amritsari Chole Kulcha","Chickpeas served with Indian Bread",500),
                new Dish("Gaon ki Thali","Variety of Dal served with chapati,sweet and rice",550),
                new Dish("Veg Thali","Variety of Panner served with chapati,sweet and rice",600),
                new Dish("Thadai Chicken","Tender Chicken served hot with Tomato gravy",650),
                new Dish("Chicken 65 Masala","Deep fried Chicken gravy",650),
                new Dish("Egg Curry","Boiled & Fried egg served with spicy tomato gravy",500),
                new Dish("Non Veg Thali","Variety of chicken served with chapati,sweet and rice",700),
                new Dish("Mega Non Veg Thali","Variety of chicken & egg served with chapati,sweet and rice",800)
        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mainCourses);

        mainCoursesList.setAdapter(dishesAdapter);


    }
}
