package ocp.solution;

public interface Vaccine {
    void administerDose(int dosage);
    double calculateEffectiveness(int dosage);
    void saveVaccineDose();
}
