import java.util.Scanner;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.generation.GenerateurCarte;

public class Carte {
	/**@param nom, largeur, hauteur, terrains --> valeur définissant/utile à la cr&ation de la carte*/
    private String nom;
    private int largeur;
    private int hauteur;
    private Terrain[][] terrains;
}