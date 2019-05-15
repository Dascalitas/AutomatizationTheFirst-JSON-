package com.dascalitas;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CreateJSONFile {
    public static void main(String[] args) {
        JSONObject obj = new JSONObject();

        obj.put("-memId", "036");
        obj.put("firstName", "Fernando");
        obj.put("lastName", "Maratono");
        obj.put("birthDate", "17.10.1888");
        obj.put("position", "Gungster");

        JSONArray skills = new JSONArray();
        skills.add("police captain");
        skills.add("murder");
        skills.add("love coffee");
        obj.put("skills", skills);

        System.out.print(obj);
    }
}
