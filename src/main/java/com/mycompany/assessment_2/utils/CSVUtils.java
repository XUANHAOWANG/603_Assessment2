package com.mycompany.assessment_2.utils;

/*
 * @author wxh19
*/
import com.mycompany.assessment_2.model.Administer;
import com.mycompany.assessment_2.model.Gamer;
import com.mycompany.assessment_2.model.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CSVUtils {
    public static List<User> readCSV() {
        String csvFile = "data.csv";
        String line = "";
        String csvSplitBy = ",";
        InputStream inputStream = CSVUtils.class.getClassLoader().getResourceAsStream(csvFile);
        List<User> users = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                String[] data = line.split(csvSplitBy);
                if(data[6].equals("Administer")){
                    User user = new Administer(Integer.parseInt(data[0]), data[1], data[2], data[3], Integer.parseInt(data[4]), data[5]);
                    users.add(user);
                }else{
                    User user = new Gamer(Integer.parseInt(data[0]), data[1], data[2], data[3], Integer.parseInt(data[4]), data[5]);
                    users.add(user);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

    public static void main(String[] args) {
        System.out.println(CSVUtils.readCSV());
    }
}
