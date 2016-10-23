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
    
    private double surfacep ;
    private double rendementp ;
    private int puissance;
    private int prix;
    private ArrayList prodhh ;
    private String nom;
    
    //arraylist production h/h
    
    public Panneau (double psurfacep, double prendementp,int ppuissance,int pprix , ArrayList pprodhh, String pnom)
    {
      this.rendementp=prendementp;
      this.surfacep=psurfacep;
      this.puissance=ppuissance;
      this.prix=pprix;
      this.prodhh =pprodhh;
      this.nom =pnom;

    }

    /////////////////////////////////////////

    public double getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }         
    ///////////////////////////////////
      
    
   /*  public double getCoeffperte() {
        return coeffperte;
    }

    public void setCoeffperte(double coeffperte) {
        this.coeffperte = coeffperte;
    }         
    */
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
    public double getSurfacep() {
        return surfacep;
    }

    public void setSurfacep(int surfacep) {
        this.surfacep = surfacep;
    }

    public void afficherPanneau (){
        
       System.out.println (rendementp);
       System.out.println (surfacep);

        
    }
    
    
      public String getNom(){
       return this.nom;
   }
  

}
 
