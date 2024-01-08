package isp.violation;

public class SomeVaccine implements Vaccine {
    private String vaccineType;

    public SomeVaccine() {
        this.vaccineType = "SomeVaccine";
    }

    @Override
    public void administerDose(int dosage) {
        System.out.println("Administering a dose of " + vaccineType + " vaccine with dosage " + dosage);
    }

    @Override
    public double calculateEffectiveness(int dosage) {
        return dosage * 1.05;
    }

    @Override
    public void saveVaccineDose() {
        System.out.println("Saving " + vaccineType + " vaccine dose to the database");
    }
}
