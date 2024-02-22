//Réimport de l'ancien projet
package fr.ecole3il.rodez2023.perlin.terrain.generation;

import fr.ecole3il.rodez2023.perlin.math.BruitPerlin2D;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
/**@author EnzoFAVRET*/
public class GenerateurPerlin extends GenerateurCarte{
	private BruitPerlin2D altitudePerlin;
	private BruitPerlin2D hydrometriePerlin;
	private BruitPerlin2D temperaturePerlin;
	public GenerateurPerlin(long graine) {
		super(graine);
		 /** @BruitPerlin2D --> génération des valeurs avec des graines*/
		 altitudePerlin = new BruitPerlin2D(getGraine()*4, 1); 
         hydrometriePerlin = new BruitPerlin2D(getGraine(), 1); 
         temperaturePerlin = new BruitPerlin2D(getGraine() * 2, 1);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Terrain genererTerrain(int i, int j, int largeur, int hauteur) {
		/**Generation des valeurs de types BruitPerlin2D
		 * 
		 * Vous êtes parti très très très loin dans la réalisation de cette classe
		 * J'ai failli faire un coma
		 */
        /**@double x/y --> création des coordonnées*/
        double x = (double) i / (double) largeur;
        double y = (double) j / (double) hauteur;
        /**@double --> attribution des valeurs aux attributs*/
        double altitude = altitudePerlin.bruit2D(x, y);
        double hydrometrie = hydrometriePerlin.bruit2D(x, y);
        double temperature = temperaturePerlin.bruit2D(x, y);

        /**@return --> création d'un nouveau terrain*/
        return new Terrain(altitude, hydrometrie, temperature);
	}

}
