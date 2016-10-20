/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author CAUBET
 */
public class Panneau {
    
    private int surfacep ;
    private double rendementp ;
    
    public Panneau (int psurfacep, double prendementp)
    {
      this.rendementp=prendementp;
      this.surfacep=psurfacep;
    }
    
    
      
    public void afficherPanneau (){
        
       System.out.println (rendementp);
       System.out.println (surfacep);

        
    }

}
   