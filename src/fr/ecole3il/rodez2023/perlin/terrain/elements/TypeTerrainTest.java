import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.awt.image.BufferedImage;
import org.junit.Test;

public class TypeTerrainTest {

    @Test
    public void testEnumValues() {
        TypeTerrain[] terrains = TypeTerrain.values();
        assertEquals(9, terrains.length); // Vérifiez le nombre de terrains
    }

    
}
