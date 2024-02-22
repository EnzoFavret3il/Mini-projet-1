package fr.ecole3il.rodez2023.perlin.terrain.elements;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.awt.image.BufferedImage;
import org.junit.Test;

public class TypeTerrainTest {

	@Test
	//Méthode de test pour vérifier si les terrains ont une image
    public void testTerrainImageExiste() {
        TypeTerrain[] terrains = TypeTerrain.values();
        for (TypeTerrain terrain : terrains) {
            assertNotNull(terrain.getImage()); 
        }
    }
	@Test
	// Vérifie que le nom des terrains n'est pas nul
    public void testTerrainNames() {
        TypeTerrain[] terrains = TypeTerrain.values();
        for (TypeTerrain terrain : terrains) {
            assertNotNull(terrain.getNom()); 
        }
    }
	

    
}
