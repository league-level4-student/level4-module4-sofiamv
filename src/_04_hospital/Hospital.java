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
	}
