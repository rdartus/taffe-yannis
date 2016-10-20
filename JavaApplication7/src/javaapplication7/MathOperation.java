package javaapplication7;

/**
 * Created by Richard-DT on 20/10/2016.
 */
public class MathOperation {
    
    
     public static double surface_installee(Espace maison , Panneau pan){

        return pan.getSurfacep()*Math.floor(maison.getSurfacedispo()/pan.getSurfacep());
         
    }
     
    public static double energy_prod(Panneau pan , Lieu li){
        int cst = 24;
        return pan.getRendementp() * pan.getSurfacep() * li.getMirr() * cst;
    }
        
        
       
    public static double prix_panneaux (Panneau pan , double surfaceinstallee){

        double nbpanneaux;
        nbpanneaux=surfaceinstallee/pan.getSurfacep();
        
        return pan.getPrix()*nbpanneaux;
         
    }
    
    
    }
