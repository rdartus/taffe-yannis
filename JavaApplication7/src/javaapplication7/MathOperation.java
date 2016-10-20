package javaapplication7;

/**
 * Created by Richard-DT on 20/10/2016.
 */
public class MathOperation {
    public static double energy_prod(Panneau pan , Lieu li){
        int cst = 24;
        return pan.getRendementp() * pan.getSurfacep() * li.getMirr() * cst;
    }
}
