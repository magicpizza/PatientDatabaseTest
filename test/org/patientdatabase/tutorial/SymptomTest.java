package org.patientdatabase.tutorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SymptomTest {

	@Test
	public void testSymptom() {
		// we are using the title right in the constructor ()
		// unlike before where we getName
		Symptom s1 = new Symptom("Tachycardia");
		s1.setDisease("Myocardial infarction");
			assertEquals("Tachycardia", s1.symptomName);
			assertEquals("Myocardial infarction", s1.disease);
	}
	@Test
	public void testGetPatient() {
		Symptom s2 = new Symptom("Jaundice");
		s2.setDisease("Hepatic cirrhosis");
		Patient p2 = new Patient();
		p2.setName("Michael");
		// Hepatic cirrhosis is assigned as a symptom for Michael
		s2.setPatient(p2);
		
		// getting the name of the patient who has Hepatic cirrhosis
//		Patient testPatient = s2.getPatient();
//		String testName = testPatient.getName();
		String testName = s2.getPatient().getName();
		
		assertEquals("Michael", testName);
	}
// test code below, please ignore
//	public void pub() {
//		Symptom s1 = new Symptom();
//		assertEquals("unknown symptom", s1.symptomName);
//		assertEquals("unknown disease", s1.disease);
//	}
}
