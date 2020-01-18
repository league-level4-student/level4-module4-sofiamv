package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<>();
	ArrayList<Patient> patients = new ArrayList<>();
	public void addDoctor(Doctor a) {
		doctors.add(a);
		}
	public ArrayList<Doctor> getDoctors(){
		return doctors;
		
	}
	public void addPatient(Patient patient) {
		patients.add(patient);
		
	}
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	public void assignPatientsToDoctors() {
		int b = 0;
		for(int a = 0; a < doctors.size(); a++) {
			for(;b < patients.size(); b++) {				
				try {
					doctors.get(a).assignPatient(patients.get(b));
				} catch (Exception e) {
					break;
				}
				
			}
		}
		
	}
	}
