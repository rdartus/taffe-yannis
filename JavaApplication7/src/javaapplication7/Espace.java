package javaapplication7;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CAUBET
 */
public class Espace {
    
    private int surfacedispo;
    private double inclinaison;
    private double orientation ;
    private int consommation;
    
      public Espace (int psurfacedispo , double pinclinaison, double porientation, int pconsommation)
    {
      this.surfacedispo=psurfacedispo;
      this.inclinaison=pinclinaison;
      this.orientation=porientation;
      this.consommation=pconsommation;
           
      
    }
    ////////////////////////////////////////////
         public int getSurfacedispo() {
        return surfacedispo;
    }

    public void setSurfacedispo(int surfacedispo) {
        this.surfacedispo = surfacedispo;
    }
   //////////////////////////////////////////////         
    
       public double getInclinaison() {
        return inclinaison;
    }

    public void setInclinaison(double inclinaison) {
        this.inclinaison = inclinaison;
    }
    
    /////////////////////////////////////////////////
       public double getOrientation() {
        return orientation;
    }

    public void setOrientation(double orientation) {
        this.orientation = orientation;
    }
    
    ///////////////////////////////////////////////////
       public int getConsommation() {
        return consommation;
    }

    public void setConsommation(int consommation) {
        this.consommation = consommation;
    }
    
    
}
