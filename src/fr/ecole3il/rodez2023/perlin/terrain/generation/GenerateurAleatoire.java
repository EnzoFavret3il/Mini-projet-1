package fr.ecole3il.rodez2023.perlin.terrain.generation;
/**@author EnzoFAVRET*/
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
		Random random = new Random();
		double altitude= random.nextDouble(-1.0,1.0);
		double hydrometrie=random.nextDouble(0.0, 1.0);
		double temperature=random.nextDouble(0.0, 1.0);
		try {
            return new Terrain(altitude, hydrometrie, temperature);
        } catch (MauvaiseValeurException e) {
            e.printStackTrace();
            return null;
        }
	}
	
	
}
