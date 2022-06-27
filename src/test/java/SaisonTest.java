import static org.junit.Assert.*;

import org.junit.Test;

public class SaisonTest {

	@Test
	public void testGetSaisonByNomNormal() {
		Saison saison = Saison.ETE;
		assertEquals(saison, Saison.getSaisonByNom("Eté"));
	}
	
	@Test
	public void testGetSaisonByNomWithBadName() {
		Saison saison = Saison.ETE;
		assertEquals(null, Saison.getSaisonByNom("Toto"));
	}
	
	@Test
	public void testGetSaisonByNomWithNullName() {
		Saison saison = Saison.ETE;
		assertEquals(null, Saison.getSaisonByNom(null));
	}

}
