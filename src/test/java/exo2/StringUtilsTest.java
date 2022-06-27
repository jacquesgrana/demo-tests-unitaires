package exo2;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void testStringUtilsNormal() {
		int value = StringUtils.levenshteinDistance("chat", "chut");
		assertEquals(1, value);
	}
	
	@Test (expected = NullPointerException.class)
	public void testStringUtilsNull1() {
		int value = StringUtils.levenshteinDistance(null, "chut");
		assertEquals(0, value);
	}
	
	@Test (expected = NullPointerException.class)
	public void testStringUtilsNull2() {
		int value = StringUtils.levenshteinDistance("chut", null);
		assertEquals(0, value);
	}

}
