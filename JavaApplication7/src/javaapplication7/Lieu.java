
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
public class Lieu {
    
  private int mirr;
  private String nom;
  private int tempmin;
  private int tempmax;
 // private int tabirr [][]=new int [12][365];
 //arraylist consommation h/
  private ArrayList Irrhh ;
  
  
  public Lieu (int mirr, String nom, int tempmin, int tempmax)
    {
      this.mirr = mirr;
      this.nom = nom;
      this.tempmin = tempmin;
      this.tempmax = tempmax;

    }
 
  public void setIrrh(ArrayList<ArrayList> grandeArrayList){
      
      String value ;
      int i;
      
      for (i=1; i<grandeArrayList.size(); i++)
      {
            
          ArrayList<String> alLigne = grandeArrayList.get(i);
          System.out.println(alLigne.get(1));
          Irrhh.add(Integer.valueOf(alLigne.get(1)));
     
      
      }

      
      
  }
  
   
  

    public int getMirr() {
        return mirr;
    }

    public void setMirr(int mirr) {
        this.mirr = mirr;
    }

    public int getTempmin() {
        return tempmin;
    }

    public void setTempmin(int tempmin) {
        this.tempmin = tempmin;
    }

    public int getTempmax() {
        return tempmax;
    }

    public void setTempmax(int tempmax) {
        this.tempmax = tempmax;
    }

    /*public int[][] getTabirr() {
        return tabirr;
    }

    public void setTabirr(int[][] tabirr) {
        this.tabirr = tabirr;
    }
*/
   
  
  
   public void afficherLieu (){
        
       System.out.println (mirr);
       
    }
   
   public String getNom(){
       return this.nom;
   }
  
  
  
}

