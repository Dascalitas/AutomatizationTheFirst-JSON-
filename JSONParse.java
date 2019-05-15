package com.dascalitas;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class JSONParse {

    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("company.json"));
            JSONObject jsonObject = (JSONObject) obj;

            JSONObject company = (JSONObject)  jsonObject.get("mafia");

            JSONArray department = (JSONArray) company.get("department");

            for (int i = 0; i < department.size() ; i++) {

                JSONObject depObj =  (JSONObject) department.get(i);
                JSONArray member = (JSONArray) depObj.get("member");

                String name = (String) depObj.get("-name");
                System.out.println("Family postion: " + name);

                for (int j = 0; j <member.size() ; j++) {
                    System.out.println("_________________");

                    JSONObject memObj = (JSONObject) member.get(j);

                    String firstName = (String) memObj.get("firstName");
                    System.out.println("First name: " + firstName);

                    String lastName =(String) memObj.get("lastName");
                    System.out.println("Last name" + lastName);

                    String position = (String) memObj.get("position");
                    System.out.println("Position: " + position);

                    String birthDate = (String) memObj.get("birthDate");
                    System.out.println("Date of Birth: " + birthDate);

                    String managerId = (String) memObj.get("managerId");
                    System.out.println("Manager ID: " + managerId);

                    System.out.println("Skills :");
                    JSONArray skills = (JSONArray) memObj.get("skill");
                    Iterator<String> iterator = skills.iterator();

                    while (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    System.out.println();
                }
                System.out.println();


            }

            //read JSON file
//            Object obj = parser.parse(new FileReader("company.json"));
//
//            JSONObject jsonObject = (JSONObject) obj;
////            System.out.println(jsonObject);
//
//            JSONObject company = (JSONObject)  jsonObject.get("mafia");
//
//            JSONArray department = (JSONArray) company.get("department");
//
//            for (int i = 0; i < department.size() ; i++) {
//
//                JSONObject depart = (JSONObject) department.get(i);
//                System.out.println(depart.get("-name"));
//
//                JSONArray member = (JSONArray) jsonObject.get("member");
//                for (int j = 0; j < member.size(); j++) {
//                    JSONObject mem = (JSONObject) member.get(j);
//
//                    String firstName = (String) mem.get("firstName");
//                    System.out.println(firstName);
//
//                    String lastName = (String) mem.get("lastName");
//                    System.out.println(lastName);
//
//                    String birthDate = (String) mem.get("birthDate");
//                    System.out.println(birthDate);
//
//                    String pos = (String) mem.get("Position");
//                    System.out.println(pos);
//
//                    // loop array
//                JSONArray skills = (JSONArray) mem.get("skills");
//                Iterator<String> iterator = skills.iterator();
//                while (iterator.hasNext()) {
//                    System.out.println(iterator.next());
//                }
//                }
//            }

//            String firstName = (String) jsonObject.get("firstName");
//            System.out.println(firstName);
//
//            String lastName = (String) jsonObject.get("lastName");
//            System.out.println(lastName);
//
//            String birthDate = (String) jsonObject.get("birthDate");
//            System.out.println(birthDate);
//
//            String pos = (String) jsonObject.get("Position");
//            System.out.println(pos);
//
//            // loop array
//            JSONArray skills = (JSONArray) jsonObject.get("skills");
//            Iterator<String> iterator = skills.iterator();
//            while (iterator.hasNext()) {
//                System.out.println(iterator.next());
//            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }catch (NullPointerException e) {
            e.printStackTrace();
        }


    }
}
