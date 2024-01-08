package isp.solution;

public class PfizerVaccine implements AdministerDose, CalculateEffectiveness, SaveVaccineDose {
    private String vaccineType;

    public PfizerVaccine() {
        this.vaccineType = "Pfizer";
    }

    @Override
    public void administerDose(int dosage) {
        System.out.println("Administering a dose of " + vaccineType + " vaccine with dosage " + dosage);
    }

    @Override
    public double calculateEffectiveness(int dosage) {
        return dosage * 1.10;
    }

    @Override
    public void saveVaccineDose() {
        System.out.println("Saving " + vaccineType + " vaccine dose to the database");
    }
}
