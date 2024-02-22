package fr.ecole3il.rodez2023.perlin.terrain.visualisation;
/**@author EnzoFAVRET*/
import fr.ecole3il.rodez2023.perlin.terrain.elements.TypeTerrain;
//Interface pour le DetermineurTerrain
public interface DetermineurTerrain {
	//DeterminerTerrain en fonction de ses caractéristiques
	public TypeTerrain determinerTerrain(double altitude, double hydrometrie, double temperature);


}
