package com.javamasterclass;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import static com.javamasterclass.Plant.initializePlantDataFromJsonFile;

public class Main {
    public static final String PLANT_DATA_FILE_NAME = "plantData.json";

    public static void main(String[] args) {
        System.out.println("Welcome to the garden planner app!");

        ArrayList<Plant> plants = initializePlantDataFromJsonFile(PLANT_DATA_FILE_NAME);
    }

}
