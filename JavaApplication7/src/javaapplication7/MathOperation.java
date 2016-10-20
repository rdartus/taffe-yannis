package javaapplication7;

/**
 * Created by Richard-DT on 20/10/2016.
 */
public class MathOperation {
    
    
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
