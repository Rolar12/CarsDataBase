package com.android.carsdb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.List;

import Data.DatabaseHandler;
import Model.Car;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler databaseHandler = new DatabaseHandler(this);

        databaseHandler.addCar(new Car("BMW", "25000 $"));
        databaseHandler.addCar(new Car("Honda", "22000 $"));
        databaseHandler.addCar(new Car("Mercedes", "55000 $"));
        databaseHandler.addCar(new Car("KIA", "17000 $"));
        databaseHandler.addCar(new Car("Renault", "20000 $"));

        List<Car> carList = databaseHandler.getAllCars();
    }
}
