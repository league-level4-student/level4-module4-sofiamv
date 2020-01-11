package _04_hospital;

import java.util.ArrayList;

public class Doctor extends Hospital{
	ArrayList<Patient> patients = new ArrayList<>();
	Patient a = new Patient();
		public boolean performsSurgery() {
			return false;
		}
		public boolean makesHouseCalls() {
			return false;
		}
		public void assignPatient(Patient b) {
			patients.add(b);
		}
		public ArrayList<Patient> getPatients(){
			return patients;
		}
		public void doMedicine() {
			a.a = true;
		}

}
