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


    
}
