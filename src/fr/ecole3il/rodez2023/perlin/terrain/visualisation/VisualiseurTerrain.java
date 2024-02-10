package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

import fr.ecole3il.rodez2023.perlin.terrain.elements.Carte;

public class VisualiseurTerrain {
private DetermineurTerrain determineurTerrain;
private Carte carte;
    public VisualiseurTerrain(DetermineurTerrain determineurTerrain, Carte carte) {
        this.determineurTerrain = determineurTerrain;
        this.carte = carte;
    }
}
