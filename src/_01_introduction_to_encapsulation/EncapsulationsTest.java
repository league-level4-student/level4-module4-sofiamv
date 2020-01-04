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
	@Test
	public void DegreesTest() {
		a.setDegrees(361);
		System.out.println(a.getDegrees());
		assertEquals(9000, a.getDegrees());
	}
	@Test
	public void StringTest() {
		a.setString("");
		assertEquals(" ", a.getString());
	}
	@Test
	public void ObjectTest() {
		a.setObject("object");
		assertEquals(new Object(), a.getObject());
	}
}
