package org.patientdatabase.tutorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PatientTest {

	@Test
	// corresponds to the constructor
	public void testPatient() {
		Patient p1 = new Patient();
		// static method assertEquals derived from test case class
		// can use PatientTest.assertEquals
		// but already in PatientTest class so it is unnecessary
		assertEquals("unknown name", p1.getName());
		assertEquals(0, p1.getAge());
		assertEquals(0, p1.getSex());
	}

	@Test
	// corresponds to Person.
	void testSetName() {
		Patient p2 = new Patient();
		p2.setName("Fred");
		assertEquals("Fred", p2.getName());
	}

	@Test
	void testSetAge() {
		Patient p3 = new Patient();
		p3.setAge(19);
		assertEquals(19, p3.getAge());
	}

	@Test
	void testSetSex() {
		Patient p4 = new Patient();
		p4.setSex(1);
		assertEquals(1, p4.getSex());
	}
	@Test
	void testToString() {
		Patient p5 = new Patient();
		p5.setName("Fanny Flintstone");
		p5.setAge(18);
		String testString = "Fanny Flintstone (18yo)";
		assertEquals(testString, p5.toString());
	}
}
