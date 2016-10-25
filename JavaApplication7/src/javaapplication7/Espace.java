package javaapplication7;

import java.util.ArrayList;

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
    private ArrayList consohh;
    
      public Espace (int psurfacedispo , double pinclinaison, double porientation, int pconsommation, ArrayList pconsohh)
    {
      this.surfacedispo=psurfacedispo;
      this.inclinaison=pinclinaison;
      this.orientation=porientation;
      this.consommation=pconsommation;
      this.consohh=pconsohh;     
      
    }
      
      
       public ArrayList getconsoh(){
          return this.consohh;
      }
      
      
     /*  public void setConsoh(ArrayList<ArrayList> grandeArrayList){
      
      String value ;
      int i;
      
      for (i=1; i<grandeArrayList.size(); i++)
      {
            
          ArrayList<String> alLigne = grandeArrayList.get(i);
          System.out.println(alLigne.get(1));
          consohh.add(Integer.valueOf(alLigne.get(1)));
     
      
      }

      
      
  }*/
      /*  public void setConsoh(ArrayList<String> arraylist){
      
      String value ;
      int i;
      
      for (i=1; i<arraylist.size(); i++)
      {
            
          System.out.println(arraylist.get(i));
          consohh.add(Integer.valueOf(arraylist.get(i)));
     
      
      }
 
        }*/
        
          public void setConsoh(ArrayList<String> arraylist){
      
      String value ;
     int i;
      
      for (i=1; i<arraylist.size(); i++)
      {
            
          consohh.add(arraylist.get(i));
     
      
      }
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
