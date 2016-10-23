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
        
              System.out.println ("test");
              System.out.println ("testGitKraken");


              
              Panneau test1 = new Panneau (2,0.15,200,0.2,500,new ArrayList());
              Lieu li = new Lieu (200);
              Espace lisb = new Espace (20,10,10,10000, new ArrayList());
              
              
             
              double eneprod;
              double prix;
              double surfaceinst;
                      
              test1.afficherPanneau();
              li.afficherLieu();
              


eneprod=MathOperation.energy_prod(test1, li);
System.out.println("eneprod"+eneprod);

surfaceinst=MathOperation.surface_installee(lisb,test1);
System.out.println("surfaceinst"+surfaceinst);


prix=MathOperation.prix_panneaux(test1, surfaceinst);
System.out.println("prix"+prix);
        

ArrayList arrayTest = CsvReader.main("consoh.csv");
              
for (ArrayList<String> als:alContainer) {
                for (String str :
                        als) {
                    System.out.println("args = [" + str + "]");
                }
            }
    //faire un arraylist 
    //fichier csv interraction excel java
              

       
        
               

        
        
        
        
    }
    
}