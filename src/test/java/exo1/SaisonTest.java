package exo1;

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
		assertEquals(null, Saison.getSaisonByNom("Toto"));
	}
	
	@Test
	public void testGetSaisonByNomWithNullName() {
		assertEquals(null, Saison.getSaisonByNom(null));
	}

}
