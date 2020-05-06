package caesars.cipher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarsCipherTest {
	
	private CaesarsCipher caesarsCipherTest = new CaesarsCipher();

	@Test
	void testCipheredMessageWithOffsetOf12() {
		assertEquals("tai mdq kag pauzs fapmk", caesarsCipherTest.cipher("how are you doing today", 12));
	}
	
	@Test
	void testEmptyString() {
		assertEquals("", caesarsCipherTest.cipher("", 12));
	}
	
	/**
	 * Example of a failing test
	 */
//	@Test
//	void testCipheredMessageWithOffsetOf11() {
//		assertEquals("tai mdq kag pauzs fapmk", caesarsCipherTest.cipher("how are you doing", 11));
//	}
	
}
