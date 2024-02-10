package fr.ecole3il.rodez2023.perlin.terrain.generation;

import java.util.Random;

import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;

public class GenerateurAleatoire extends GenerateurCarte{

	public GenerateurAleatoire(long graine) {
		super(graine);
		// TODO Auto-generated constructor stub
	}
	/**Constructeur pour un generer un terrain de maniere aleatoire*/
	@Override
	protected Terrain genererTerrain(int i, int j, int largeur, int hauteur) {
		/**@info la pif-au-métrie est dans la place*/
		Random pifomètre = new Random();
		double altitude= pifomètre.nextDouble(0,1);//j'aurais bien aimé mettre 0 et 254 pour la ref
		double hydrometrie=pifomètre.nextDouble(-1,1);
		double temperature=pifomètre.nextDouble(0,1);
		return new Terrain(altitude, hydrometrie, temperature);
	}
	
	
}
