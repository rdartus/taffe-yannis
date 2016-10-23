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
      
      public static double calculerGain(Lieu lieu, Panneau panneau){
          int mirr = lieu.getMirr();
          double coeff = panneau.getCoeffperte();
          double resultat = mirr*coeff;
          return resultat;
      }
    
    
     public static double surface_installee(Espace maison , Panneau pan){

        return pan.getSurfacep()*Math.floor(maison.getSurfacedispo()/pan.getSurfacep());
         
    }
     
   public static double coefperte(Espace maiz){
        
     /* double coeffi= tabinc[inc][1];
      double coeffo= tabor[or][1];*/
       double coeffi=0;
       double coeffo=0;
       double resultat;
       
       if (maiz.getOrientation()==1)
       {
       coeffo=1;            }
       else if(maiz.getOrientation()==2)
       {
           coeffo=0.8;
       }
       else if(maiz.getOrientation()==3)
       {
           coeffo=0.7;
       }
else if(maiz.getOrientation()==4)
       {
           coeffo=0.5;
       }
       
       //
       
        if (maiz.getInclinaison()==1)
       {
       coeffi=1;            }
       else if(maiz.getInclinaison()==2)
       {
           coeffi=0.8;
       }
       else if(maiz.getInclinaison()==3)
       {
           coeffi=0.7;
       }
       else if(maiz.getInclinaison()==4)
       {
           coeffi=0.5;
       }
       
        resultat=coeffo*coeffi;
        
       return resultat ;
    }   
     
    public static double energy_prod(Panneau pan , Lieu li){
        
        
        int cst = 24;
        //faire calcul pour remplir arraylist prod
        
        return pan.getRendementp() * pan.getSurfacep() * li.getMirr() * cst*pan.getCoeffperte();
    }
        
        
       
    public static double prix_panneaux (Panneau pan , double surfaceinstallee){

        double nbpanneaux;
        nbpanneaux=surfaceinstallee/pan.getSurfacep();
        
        return pan.getPrix()*nbpanneaux;
         
    }
    
    
   /* 
     public static double Autoprod (Panneau pan , double surfaceinstallee){ 
 
       
         
        return pan.getPrix()*nbpanneaux; 
          
    } 
     
     public static double Autoconso (Panneau pan , double surfaceinstallee){ 
 
       
         
        return pan.getPrix()*nbpanneaux; 
          
    } 
     */
     public static double GainEnv (double eneprod){ 
          
         double eco =0.476; 
          
       
         
        return eneprod*eco; 
          
    } 
     
     public static double roi (double tarifbat , double prixpan, double prodan){ 
          
          
          
         double prixkwh=0.15; 
          
         
       
         
        return (tarifbat+prixpan)/(prodan*prixkwh); 
          
    } 
      
    } 
 