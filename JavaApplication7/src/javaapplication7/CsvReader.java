package javaapplication7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


/**
 * Created by Richard-DT on 23/10/2016.
 */
public class CsvReader {
    public static ArrayList main(String nomFichier) {

        ArrayList<ArrayList> alContainer = new ArrayList<>();
        ArrayList<String> alLine = new ArrayList<>();
//        String csvFile = "\\src\\Data\\consoh.csv";
        String csvFile = "\\src\\Data\\"+nomFichier;
        String line = "";
        String path ="";
        String cvsSplitBy = ";";
        try {
            path = new File(".").getCanonicalPath();
            System.out.println(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        String[] pathTab = path.split("\\\\");
//        path = "";
//        for (int i =0 ; i<pathTab.length ; i++){
//            path += pathTab[i] +"\\";
//        }
        path += csvFile;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] tab = line.split(cvsSplitBy);
                alLine =new ArrayList<>();
                for (String str: tab) {
                    alLine.add(str);
                }
                alContainer.add(alLine);
            }

            return alContainer;
//            for (ArrayList<String> als:alContainer) {
//                for (String str :
//                        als) {
//                    System.out.println("args = [" + str + "]");
//                }
//
//            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList();

    }
}
