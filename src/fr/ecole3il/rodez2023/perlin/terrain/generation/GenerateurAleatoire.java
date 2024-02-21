package fr.ecole3il.rodez2023.perlin.terrain.generation;

import java.util.Random;

import fr.ecole3il.rodez2023.perlin.terrain.elements.MauvaiseValeurException;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;

public class GenerateurAleatoire extends GenerateurCarte{

	private Random random;
	public GenerateurAleatoire(long graine) {
		super(graine);
		this.random = new Random();
		// TODO Auto-generated constructor stub
	}
	/**Constructeur pour un generer un terrain de maniere aleatoire*/
	@Override
	protected Terrain genererTerrain(int i, int j, int largeur, int hauteur) {
		/**@info la pif-au-métrie est dans la place*/
		Random pifomètre = new Random();
		double altitude= pifomètre.nextDouble();
		double hydrometrie=pifomètre.nextDouble();
		double temperature=pifomètre.nextDouble();
		try {
            return new Terrain(altitude, hydrometrie, temperature);
        } catch (MauvaiseValeurException e) {
            e.printStackTrace();
            return null;
        }
	}
	
	
}
