package exercise1;

public class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.add(new Doctor("Jan","Kowalski", 8000, 3500));
        hospital.add(new Nurse("Krystyna", "Nowak", 3000, 1500));
        hospital.add(new Nurse("Ewa", "Lewandowska", 2200, 300));

        hospital.getInfo();
    }
}
