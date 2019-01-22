package org.patientdatabase.tutorial;

public class Symptom {

	String symptomName;
	String disease;
	Patient patient;

	// I think this is creating a method?
	// Apparently he is creating a constructor here
	public Symptom(String passed_string) {
		this.symptomName = passed_string; // when Symptom("x") is called in SymptomTest.java, x becomes the passed_string that becomes Symptom.symptomName
		this.disease = "unknown disease";
	}
	
	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getSymptomName() {
		return symptomName;
	}
// test code below, please ignore
//	public Symptom() {
//		symptomName = "unknown symptom";
//		disease = "unknown disease";
//	}
	public void setPatient(Patient passedPatient) {
		// TODO Auto-generated method stub
		this.patient = passedPatient;
	}
	
	public Patient getPatient() {
		return this.patient;
	}

}
