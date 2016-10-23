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
public class Panneau {
    
    private int surfacep ;
    private double rendementp ;
    private int puissance;
    private double coeffperte;
    private int prix;
    private ArrayList prodhh ;
    
    //arraylist production h/h
    
    public Panneau (int psurfacep, double prendementp,int ppuissance,double pcoeffperte,int pprix , ArrayList pprodhh)
    {
      this.rendementp=prendementp;
      this.surfacep=psurfacep;
      this.puissance=ppuissance;
      this.coeffperte=pcoeffperte;
      this.prix=pprix;
      this.prodhh =pprodhh;

    }

    /////////////////////////////////////////

    public double getPrix() {
        return coeffperte;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }         
    ///////////////////////////////////
      
    
     public double getCoeffperte() {
        return coeffperte;
    }

    public void setCoeffperte(double coeffperte) {
        this.coeffperte = coeffperte;
    }         
    
    ////////////////////////////////////////
    
     public int getPuissance() {
        return puissance;
    }

    public void setRendementp(int puissance) {
        this.puissance = puissance;
    }
    
    /////////////////////////////////////////
    
    public double getRendementp() {
        return rendementp;
    }

    public void setRendementp(double rendementp) {
        this.rendementp = rendementp;
    }
///////////////////////////////////////////////
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
 
