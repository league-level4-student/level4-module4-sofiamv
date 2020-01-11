package _04_hospital;

public class Patient extends Hospital{
boolean a= false;
public void checkPulse() {
	a = true;
}
public boolean feelsCaredFor() {
	return a;
}
}
