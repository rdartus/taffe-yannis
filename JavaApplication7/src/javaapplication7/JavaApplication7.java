/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.ArrayList;

/**
 *
 * @author CAUBET
 */
public class JavaApplication7 {

       /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        

        ArrayList<String> al = CsvReader.getValues("consoh.csv");
        
    //public static ArrayList prodhh (Panneau pan, ArrayList prodh, ArrayList Irrh, double coefperte, double surface){
 
 /*    
        
        
        System.out.println ("test");
              System.out.println ("testGitKraken");


              
           
         
             
              double eneprod;
              double prix;
              double surfaceinst;
                      
              test1.afficherPanneau();
              lisb.afficherLieu();
              


eneprod=MathOperation.energy_prod(test1, lisb);
System.out.println("eneprod"+eneprod);

surfaceinst=MathOperation.surface_installee(maiz,test1);
System.out.println("surfaceinst"+surfaceinst);


prix=MathOperation.prix_panneaux(test1, surfaceinst);
System.out.println("prix"+prix);
       */ 

           Lieu lisb = new Lieu (1,"nom",1,1,new ArrayList());
            Espace maiz = new Espace (20,10,10,10000, new ArrayList());
              
        
ArrayList<ArrayList> arrayTest = CsvReader.main("consoh.csv");
ArrayList<ArrayList> arrayTest2 = CsvReader.main("Irrh.csv");

  ArrayList arrayTest3 =   CsvReader.getValues("Irrh.csv");
  
lisb.setIrrh(arrayTest3);


/*for (ArrayList<String> als:arrayTest) {
                for (String str :
                        als) {
                    System.out.println("args = [" + str + "]");
                }
            }*/
    //faire un arraylist 
    //fichier csv interraction excel java
              

//lisb.setIrrh(arrayTest2);
//maiz.setConsoh(arrayTest);
   
        
 
 // maxstock= MathOperation.consostock(arrayTest, arrayTest2);
 // System.out.println(maxstock) ;
        
        
        
        
    }
    
}