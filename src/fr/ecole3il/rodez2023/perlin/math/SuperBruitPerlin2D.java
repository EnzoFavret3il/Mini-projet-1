package fr.ecole3il.rodez2023.perlin.math;

public class SuperBruitPerlin2D extends BruitPerlin2D {

	//TODO ? no, héritage de la classe bruitperlin2D
    public SuperBruitPerlin2D(long mineSeed, double laresolution) {
        super(mineSeed, laresolution);
    }

    @Override
    //Overide de l'existant avec modif du return
    public double bruit2D(double x, double y) {
        return super.bruit2D(x, y);
    }

    public double produitScalaire(double[] vecteur, double x, double y) {
    	
        // methode de scalairisme, return le produit scalaire en type double 
    	/**@double --> calcul des distances*/
        double distanceX = x - vecteur[0];
        double distanceY = y - vecteur[1];
        //return du produit
        return vecteur[0] * distanceX + vecteur[1] * distanceY;
    }
    	//lissage du t
    	public double lissage(double t) {
    		/**@Source : StackOverflow*/
    	    double t2 = t * t;
    	    double t3 = t2 * t;
    	    //calcul du resultat
    	    double result = 6 * t3 - 15 * t2 + 10 * t3;

    	    return result;
    	}
    

    public double interpolation(double d, double a, double b) {
        /**Interpolation des valeurs : */
        return a + d * (b - a);
    }
}
