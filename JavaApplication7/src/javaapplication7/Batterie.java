/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author CAUBET
 */
public class Batterie {
    
    private int capastock;
    private double puissance;
    private int nbcycle ;
    private int prix;
    private String nom;
    
      public Batterie (int pcapastock , double ppuissance, int pnbcycle, int pprix, String pnom)
    {
      this.capastock=pcapastock;
      this.puissance=ppuissance;
      this.nbcycle=pnbcycle;
      this.prix=pprix;
      this.nom=pnom;
           
      
    }
    
      
    public int getcapastock() {
        return capastock;
    }

      
      public double getpuissance() {
        return puissance;
    }
    
     public int getnbcycle() {
        return nbcycle;
    }
     
      public int getprix() {
        return prix;
    }
      
      public String getNom(){
          return this.nom;
      }
}
