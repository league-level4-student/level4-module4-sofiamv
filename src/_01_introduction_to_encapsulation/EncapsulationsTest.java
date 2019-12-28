package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class EncapsulationsTest {

EncapsulateTheData a = new EncapsulateTheData(); 
	@Test
	public void ItemTest() {
		a.setItem(-1);
		assertEquals(0, a.getItem());
	}
}
