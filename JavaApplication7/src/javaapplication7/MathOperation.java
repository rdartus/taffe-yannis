package javaapplication7;

import java.util.ArrayList;
import java.util.Iterator;

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
        
        for(i=0 ;i<365;i++){
            for(j=i*24;j<(i+1)*24;j++){
                if( ((double)prodh.get(j)) > (double)consoh.get(j) ){
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
        
         public static double consotot (ArrayList consoh){
          
             double consotot = 0;
             int j;
             
             for(j=1;j<consoh.size();j++){
                 consotot = consotot + (double)consoh.get(j); 
                }
             
          return consotot;
      }  
      
        
         public static ArrayList prodhh (Panneau pan, Lieu li , double coefperte, double surface){
          
             //int cst =24;
             int j;
             ArrayList prodh = new ArrayList();
             ArrayList Irrh = li.getIrrh();
             
               for(j=0;j<Irrh.size();j++){
                   
                   double d =(double)Irrh.get(j)* pan.getRendementp()*coefperte*surface;
                 prodh.add(d); 
                }
             
             
          /*   Iterator<String> it = prodh.iterator();
             Iterator<String> it2 = Irrh.iterator();


        while (it.hasNext()) {
            double tempo = Double.parseDouble(it.next());
            double tempo2 = Double.parseDouble(it2.next());
            
          prodh.add(tempo2*pan.getRendementp() *pan.getSurfacep()*cst*coefperte*surface);


           
        }
*/
                        
             return prodh;
      }  
         
           public static double prodtot (ArrayList prodhh){
         
          int j;
          double prodtot=0;
          
           for(j=1;j<prodhh.size();j++){
                 prodtot = prodtot + (double)prodhh.get(j); 
                }
          
          return prodtot ;
      }  
        
      public static int nbBat (double maxstock, Batterie bat ){
          int nbBat;
          double decharge =0.5;
          int jautonomie = 2; // a mettre en variable si possible
          
          //double decharge, int jautonomie, int tension, int capacite
          
          nbBat = (int)Math.ceil((maxstock*0.8*decharge*jautonomie)/(bat.getpuissance()*bat.getcapastock()));
          return nbBat;
      }  
      
      public static double tarif(int nbBat, Batterie bat){
         
          double tarif = nbBat*bat.getprix();
          return tarif;
      }
    /*
    http://energie-developpement.blogspot.fr/2012/01/photovoltaique-batteries-capacite.html
    */
    
      public static double surface_installee_libre(double conso , double energieunpan, Panneau pan, double coefperte ,Lieu li){

          
          //double surface;
          //surface = (conso)/(pan.getRendementp()*coefperte*li.getMirr()*365);
                  
                  
        double nbpan;
        nbpan= conso/(energieunpan*365);
          
        double resultat;
        resultat =nbpan*pan.getSurfacep();
        
        return resultat;
            
      }
      
      public static double calculerGain(double eneprod){
          
          double prixkwh =0.15; 
          double resultat;
          
          resultat = (eneprod/1000)*prixkwh;
                
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
     
    public static double energy_prod(Panneau pan , Lieu li, Espace maiz ){
        
        
        int cst = 24;
        double coefperte;
        coefperte=MathOperation.coefperte(maiz);
                
        //faire calcul pour remplir arraylist prod
        
        return pan.getRendementp() * pan.getSurfacep() * li.getMirr() * cst*coefperte;
    }
        
        
       
    public static double prix_panneaux (Panneau pan , double surfaceinstallee){

        double nbpanneaux;
        nbpanneaux=surfaceinstallee/pan.getSurfacep();
        
        return pan.getPrix()*nbpanneaux;
         
    }
    
    
   
     public static double Autoprod (double eneprodtot , double consotot){ 
 
double resultat;
resultat = eneprodtot/consotot;
         
        return resultat; 
          
    } 
     /* 
     public static double Autoconso (Panneau pan , double surfaceinstallee){ 
 
       prod consommée / prod tot
         
        return pan.getPrix()*nbpanneaux; 
          
    } 
     */
     public static double GainEnv (double eneprod){ 
          
         double eco =0.476; 
          
       
         
        return (eneprod/1000)*eco; 
          
    } 
     
     public static double roi (double tarifbat , double prixpan, double prodan){ 
          
          
          
         double prixkwh=0.15; 
          
         
       
         
        return (tarifbat+prixpan)/((prodan/1000)*prixkwh); 
          
    } 
      
    } 
 