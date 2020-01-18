package _04_hospital;

public class Patient extends Hospital{
boolean iscaredfor = false;
public void checkPulse() {
	 iscaredfor = true;
}
public boolean feelsCaredFor() {
	return iscaredfor;
}
}
