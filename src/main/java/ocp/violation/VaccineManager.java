package ocp.violation;

public class VaccineManager {

    public void administerVaccine(String vaccineType, int dosage) {
        System.out.println("Administering " + vaccineType + " vaccine with dosage " + dosage);
    }

    public double calculateEffectiveness(String vaccineType, int dosage) {
        return dosage * 1.10;
    }

    public void saveVaccineDose(String vaccineType, int dosage) {
        System.out.println("Saving vaccine dose to the database");
    }
}

