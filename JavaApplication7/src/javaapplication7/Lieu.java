
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.ArrayList;
import java.util.Iterator;

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
  
  
  public Lieu (int mirr, String nom, int tempmin, int tempmax, ArrayList pIrrhh)
    {
      this.mirr = mirr;
      this.nom = nom;
      this.tempmin = tempmin;
      this.tempmax = tempmax;
      this.Irrhh = pIrrhh;

    }
 
  /*public void setIrrh(ArrayList<ArrayList> grandeArrayList){
      
      String value ;
      int i;
      
      for (i=1; i<grandeArrayList.size(); i++)
      {
            
          ArrayList<String> alLigne = grandeArrayList.get(i);
          System.out.println(alLigne.get(1));
          Irrhh.add(Integer.valueOf(alLigne.get(1)));
     
      
      }

     
      
  }*/
  
  public void setIrrh(ArrayList<String> arraylist){
      
      String value ;
     int i;
      
      for (i=1; i<arraylist.size(); i++)
      {
            
          Irrhh.add(arraylist.get(i));
     
      
      }
 /*Iterator it = arraylist.listIterator();
        while (it.hasNext()) {
            
            double elt = Double.parseDouble(it.next().toString());
            Irrhh.add(elt);
            
        }
     
  */    
  }
  
     public ArrayList getIrrh(){
          return Irrhh;
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

