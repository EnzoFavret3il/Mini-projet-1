package fr.ecole3il.rodez2023.perlin.terrain.generation;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;

public class GenerateurAleatoireTest {

    @Test
    public void testGenerateTerrain() {
    	// graine fixe pour tests
        GenerateurAleatoire generateur = new GenerateurAleatoire(404); 
    //  carte de taille 10x10
        Terrain terrain = generateur.genererTerrain(0, 0, 10, 10); 
     // Verif terrain non nul
        assertNotNull(terrain); 
        //verif des valeurs du terrain 
        assertTrue(terrain.getAltitude() >= -1.0 && terrain.getAltitude() <= 1.0); 
        assertTrue(terrain.getHydrometrie() >= 0.0 && terrain.getHydrometrie() <= 1.0); 
        assertTrue(terrain.getTemperature() >= 0.0 && terrain.getTemperature() <= 1.0); 
    }
}
