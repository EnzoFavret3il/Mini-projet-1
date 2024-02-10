package fr.ecole3il.rodez2023.perlin.terrain.generation;

import fr.ecole3il.rodez2023.perlin.math.BruitPerlin2D;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;

public class GenerateurPerlin extends GenerateurCarte{

	public GenerateurPerlin(long graine) {
		super(graine);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Terrain genererTerrain(int i, int j, int largeur, int hauteur) {
		/**Generation des valeurs de types BruitPerlin2D*/
		BruitPerlin2D altitudePerlin = new BruitPerlin2D(getGraine(), 1); 
        BruitPerlin2D hydrometriePerlin = new BruitPerlin2D(getGraine(), 1); 
        BruitPerlin2D temperaturePerlin = new BruitPerlin2D(getGraine() * 2, 1); 
        
	}

}
