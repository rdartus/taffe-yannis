/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

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


              
              Panneau test1 = new Panneau (1, 0.1);
              Lieu li = new Lieu (1);
              double eneprod;

System.out.println(MathOperation.energy_prod(test1, li));

eneprod=MathOperation.energy_prod(test1, li);
System.out.println(eneprod);
        
              test1.afficherPanneau();
              

              

       
        
               

        
        
        
        
    }
    
}