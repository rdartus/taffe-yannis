package javaapplication7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/**
 * Created by Richard-DT on 23/10/2016.
 */
public class CsvReader {
    public static void main(String[] args) {

        String csvFile = "/Data/auto.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] tab = line.split(cvsSplitBy);
                System.out.println("args = [" + tab + "]");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
