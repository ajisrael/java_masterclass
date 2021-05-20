package com.javamasterclass;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Plant {
    String name = "";
    ArrayList<String> companions;
    ArrayList<String> enemies;

    public Plant(String name, ArrayList<String> companions, ArrayList<String> enemies) {
        this.name = name;
        this.companions = companions;
        this.enemies = enemies;
    }

    public static ArrayList<Plant> initializePlantDataFromJsonFile(String fileName) {
        // TODO: File name validation

        ArrayList<Plant> plants = new ArrayList<>();

        try {
            Object obj = new JSONParser().parse(new FileReader("plantData.json"));
            JSONObject jo = (JSONObject) obj;
            JSONArray ja = (JSONArray) jo.get("plants");
            Iterator itr = ja.iterator();

            while(itr.hasNext()) {
                JSONObject currentJSONPlant = (JSONObject) itr.next();
                String plantName = (String) currentJSONPlant.get("name");

                // TODO: Factor this out to separate function
                JSONArray JSONPlantCompanions = (JSONArray) currentJSONPlant.get("companions");
                Iterator compItr = JSONPlantCompanions.iterator();
                ArrayList<String> plantCompanions = new ArrayList<>();
                while (compItr.hasNext()) {
                    plantCompanions.add((String) compItr.next());
                }

                JSONArray JSONPlantEnemies = (JSONArray) currentJSONPlant.get("enemies");
                Iterator enemItr = JSONPlantEnemies.iterator();
                ArrayList<String> plantEnemies = new ArrayList<>();
                while (enemItr.hasNext()) {
                    plantEnemies.add((String) enemItr.next());
                }

                Plant currentPlant = new Plant(plantName, plantCompanions, plantEnemies);
                plants.add(currentPlant);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return plants;
    }

}
