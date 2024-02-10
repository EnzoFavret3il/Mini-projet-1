package fr.ecole3il.rodez2023.perlin.terrain.generation;

import java.util.Random;

import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;

public class GenerateurAleatoire extends GenerateurCarte{

	public GenerateurAleatoire(long graine) {
		super(graine);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Terrain genererTerrain(int i, int j, int largeur, int hauteur) {
		/**@info la pif-au-métrie est dans la place*/
		Random pifomètre = new Random();
		double altitude= pifomètre.nextDouble();
		double hydrometrie=pifomètre.nextDouble();
		double temperature=pifomètre.nextDouble();
		return new Terrain(altitude, hydrometrie, temperature);
	}
	
	
}
