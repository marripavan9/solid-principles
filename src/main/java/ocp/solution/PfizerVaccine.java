package ocp.solution;

public class PfizerVaccine implements Vaccine {

    private int dosage;

    public PfizerVaccine(int dosage) {
        this.dosage = dosage;
    }

    @Override
    public void administerDose(int dosage) {
        System.out.println("Administering a dose of Pfizer vaccine with dosage " + dosage);
    }

    @Override
    public double calculateEffectiveness(int dosage) {
        return dosage * 1.10;
    }

    @Override
    public void saveVaccineDose() {
        System.out.println("Saving Pfizer vaccine dose to the database");
    }
}
