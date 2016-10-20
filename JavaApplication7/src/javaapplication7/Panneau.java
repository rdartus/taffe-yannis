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

    public double getRendementp() {
        return rendementp;
    }

    public void setRendementp(double rendementp) {
        this.rendementp = rendementp;
    }

    public int getSurfacep() {
        return surfacep;
    }

    public void setSurfacep(int surfacep) {
        this.surfacep = surfacep;
    }

    public void afficherPanneau (){
        
       System.out.println (rendementp);
       System.out.println (surfacep);

        
    }

}
   