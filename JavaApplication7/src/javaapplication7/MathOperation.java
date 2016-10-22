package javaapplication7;

import java.util.ArrayList;

/**
 * Created by Richard-DT on 20/10/2016.
 */
public class MathOperation {
    
        public static double consostock (ArrayList consoh, ArrayList prodh){

        double maxstock=0;
        double jstock=0;
        double totstock=0;
        int i=0;
        int j=0;
        double prodj;
        double consj;
        
        for(i=0;i<365;i++){
            for(j=j;j<j+24;j++){
                if( (double)prodh.get(j) > (double)consoh.get(j) ){
                    jstock = jstock + ((double)prodh.get(j) - (double)consoh.get(j)); 
                }
            }
            if(jstock>maxstock){
                maxstock=jstock;
                jstock=0;
            }
            else{
                jstock=0;
            }    
        }
          
        return maxstock;
            
      }
        
      public static int nbBat (double maxstock, double decharge, int jautonomie, int tension, int capacite){
          int nbBat;
          nbBat = (int)Math.ceil(maxstock*decharge*jautonomie/(tension*capacite));
          return nbBat;
      }  
      
      public static double tarif(int nbBat, double prix){
          double tarif = nbBat*prix;
          return tarif;
      }
    /*
    http://energie-developpement.blogspot.fr/2012/01/photovoltaique-batteries-capacite.html
    */
    
      public static double surface_installee_libre(double conso , double energieunpan, Panneau pan){

        double nbpan;
        nbpan= conso/energieunpan;
          
        return nbpan*pan.getSurfacep();
            
      }
    
    
     public static double surface_installee(Espace maison , Panneau pan){

        return pan.getSurfacep()*Math.floor(maison.getSurfacedispo()/pan.getSurfacep());
         
    }
     
   public static double coefperte(Panneau pan,int or, int inc, double tabor[][],double tabinc[][]){
        
      double coeffi= tabinc[inc][1];
      double coeffo= tabor[or][1];

       return coeffo*coeffi;
    }   
     
    public static double energy_prod(Panneau pan , Lieu li){
        int cst = 24;
        return pan.getRendementp() * pan.getSurfacep() * li.getMirr() * cst*pan.getCoeffperte();
    }
        
        
       
    public static double prix_panneaux (Panneau pan , double surfaceinstallee){

        double nbpanneaux;
        nbpanneaux=surfaceinstallee/pan.getSurfacep();
        
        return pan.getPrix()*nbpanneaux;
         
    }
    
    
    }
