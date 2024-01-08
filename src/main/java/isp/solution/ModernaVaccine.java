package isp.solution;

public class ModernaVaccine implements AdministerDose, CalculateEffectiveness {
    private String vaccineType;

    public ModernaVaccine() {
        this.vaccineType = "Moderna";
    }

    @Override
    public void administerDose(int dosage) {
        System.out.println("Administering a dose of " + vaccineType + " vaccine with dosage " + dosage);
    }

    @Override
    public double calculateEffectiveness(int dosage) {
        return dosage * 1.15;
    }
}
