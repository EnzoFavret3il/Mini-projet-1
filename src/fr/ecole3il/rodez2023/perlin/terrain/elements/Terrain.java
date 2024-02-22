package fr.ecole3il.rodez2023.perlin.terrain.elements;
import fr.ecole3il.rodez2023.perlin.terrain.elements.TypeTerrain;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.DetermineurTerrain;
/**@author EnzoFAVRET*/
/**@param hydrometrie,temperature,altitude --> données définissant un terrain de type double pour plus de précision*/
public class Terrain {
    private double hydrometrie;
    private double temperature;
    private double altitude;
/**@Constructeur --> constructeur pour le terrain
 * Gestion des valeurs par setters pour gérer erreurs mauvaise valeur*/
    public Terrain(double altitude,double hydrometrie, double temperature ) {
    	setAltitude(altitude);
        setHydrometrie(hydrometrie);
        setTemperature(temperature);
        
    }
    /**@getters --> getter pour les valeurs du terrain*/
    public double getHydrometrie() {
        return hydrometrie;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getAltitude() {
        return altitude;
    }
    /**@setters --> setters pour les données du terrain */
    public void setHydrometrie(double hydrometrie) {
    	hydrometrie = Math.abs(hydrometrie);

    	
        if (hydrometrie < 0 || hydrometrie > 1) {
            throw new MauvaiseValeurException("L'hydrométrie doit être comprise entre 0 et 1.");
        }
        this.hydrometrie = hydrometrie;
    }

    public void setTemperature(double temperature) {
    	temperature = Math.abs(temperature);
        if (temperature < 0 || temperature > 1) {
            throw new MauvaiseValeurException("La température doit être comprise entre 0 et 1.");
        }
        this.temperature = temperature;
    }

    public void setAltitude(double altitude) {
        if (altitude < -1 || altitude > 1) {
            throw new MauvaiseValeurException("L'altitude doit être comprise entre -1 et 1.");
        }
        this.altitude = altitude;
    }
   /** @getter renvoie les valeurs du terrain*/
    public TypeTerrain getTypeTerrain(DetermineurTerrain dt) {
        return dt.determinerTerrain(altitude, hydrometrie, temperature);
    }

}
