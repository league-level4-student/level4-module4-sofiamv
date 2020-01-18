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
		public void assignPatient(Patient b) throws Exception{
			if(patients.size() >= 3) {
				throw new Exception();
			}else {
				patients.add(b);
			}
		}
		public ArrayList<Patient> getPatients(){
			return patients;
		}
		public boolean doMedicine(Patient v) {
			v.iscaredfor = true;
			return v.iscaredfor;
		}

}
