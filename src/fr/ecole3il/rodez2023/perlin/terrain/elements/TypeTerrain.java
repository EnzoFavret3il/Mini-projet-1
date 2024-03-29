package fr.ecole3il.rodez2023.perlin.terrain.elements;
import org.junit.Test;
import java.awt.image.BufferedImage;
/**@author EnzoFAVRET*/
/**@enum Enumeration de types de terrain avec le nom et le fichier png */
public enum TypeTerrain {
    COLLINES("Collines", "hills.png"),
    DESERT("Désert", "desert.png"),
    FORET_CONIFERES("Forêt de conifères", "coniferous_forest.png"),
    FORET_FEUILLUS("Forêt de feuillus", "deciduous_forest.png"),
    MARAIS("Marais", "marsh.png"),
    MONTAGNE("Montagne", "mountain.png"),
    OCEAN("Océan", "ocean.png"),
    PLAINE("Plaine", "plain.png"),
    TOUNDRA("Toundra", "tundra.png");

	/**@param nom --> nom du biome
	 * @param nomImage --> nom de l'image correpondant au biome
	 * @param image --> type permettant de charger l'image
	 * */
    private final String nom;
    private final String nomImage;
    private BufferedImage image;
    /**@Constructor construteur d'un type de terrain*/
    TypeTerrain(String nom, String nomImage) {
        this.nom = nom;
        this.nomImage = nomImage;
        this.image = fr.ecole3il.rodez2023.perlin.Utils.chargerTuile(nomImage);
    }
    /**@Getter getImage --> permet de récupérer l'image
     * @Getter getNom --> permet de récupérer le nom du terrain
     * @Override toString--> réécriture de la méthode toString pour l'adapter à la demande*/
    public BufferedImage getImage() {
        return image;
    }
    public String getNom() {
    	return nom;
    }
    @Override
    public String toString() {
        return "Voici le nom français du terrain: "+nom+" et voici son image associé: "+ nomImage;
    }
}
