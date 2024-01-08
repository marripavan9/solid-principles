package lsp.violation;

public class Vaccine {
    private String vaccineType;

    public Vaccine(String vaccineType) {
        this.vaccineType = vaccineType;
    }

    public void administerDose(int dosage) {
        System.out.println("Administering a dose of " + vaccineType + " vaccine with dosage " + dosage);
    }
}
