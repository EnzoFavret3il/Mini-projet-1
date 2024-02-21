package fr.ecole3il.rodez2023.perlin.terrain.elements;

import java.util.Scanner;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.generation.GenerateurCarte;

public class Carte {
	/**@param nom, largeur, hauteur, terrains --> valeur définissant/utile à la cr&ation de la carte*/
    private String nom;
    private int largeur;
    private int hauteur;
    private Terrain[][] terrains;
    
    /**@Constructor --> Constructeur d'une carte/utilisation de la méthode genererCarte*/
    public Carte(String nom, int largeur, int hauteur, GenerateurCarte generateurCarte) {
        this.nom = nom;
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.terrains = generateurCarte.genererCarte(largeur, hauteur);

    }
    /**@Constructor --> second constructeur de carte
     * @param --> valeurs d'un terrain et valeurs de la carte
     *'/!\ complicado à faire tous ça...*/
    public Carte(String donneesCarte) {
        Scanner scanner = new Scanner(donneesCarte);
        //première ligne
        this.nom = scanner.nextLine();
        //seconde ligne
        this.largeur = scanner.nextInt();
        this.hauteur = scanner.nextInt();
        scanner.nextLine(); 

        this.terrains = new Terrain[largeur][hauteur]; 

        //troisième ligne
        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < largeur; j++) {
                double altitude = scanner.nextDouble();
                double hydrometrie = scanner.nextDouble();
                double temperature = scanner.nextDouble();
                terrains[j][i] = new Terrain(altitude, hydrometrie, temperature);
                scanner.nextLine(); // Passer à la ligne suivante pour finir la lecture
            }
        }

        scanner.close();
    }

    
    /**@getter --> getter demandés*/
    public String getNom() {
        return nom;
    }

    public int getLargeur() {
        return largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public Terrain getTerrain(int x, int y) throws TerrainInexistant {
        if (x < 0 || x >= largeur || y < 0 || y >= hauteur) {
            throw new TerrainInexistant("Terrain inexistant à cet endroit (" + x + ", " + y + ")");
        }
        return terrains[x][y];
    }
}