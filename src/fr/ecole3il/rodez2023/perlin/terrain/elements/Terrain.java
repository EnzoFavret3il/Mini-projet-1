package fr.ecole3il.rodez2023.perlin.terrain.elements;
import fr.ecole3il.rodez2023.perlin.terrain.elements.TypeTerrain;


public class Terrain {
    private double hydrometrie;
    private double temperature;
    private double altitude;

    public Terrain(double hydrometrie, double temperature, double altitude) {
        setHydrometrie(hydrometrie);
        setTemperature(temperature);
        setAltitude(altitude);
    }

    public double getHydrometrie() {
        return hydrometrie;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setHydrometrie(double hydrometrie) {
        if (hydrometrie < 0 || hydrometrie > 1) {
            throw new MauvaiseValeurException("L'hydrométrie doit être comprise entre 0 et 1.");
        }
        this.hydrometrie = hydrometrie;
    }

    public void setTemperature(double temperature) {
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

    public TypeTerrain getTypeTerrain(DetermineurTerrain dt) {
        return dt.determineTypeTerrain(this);
    }
}
