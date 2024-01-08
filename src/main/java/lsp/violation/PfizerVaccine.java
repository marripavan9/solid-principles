package lsp.violation;

public class PfizerVaccine extends Vaccine {
    public PfizerVaccine() {
        super("Pfizer");
    }

    @Override
    public void administerDose(int dosage) {
        System.out.println("Administering a dose of Pfizer vaccine with dosage " + dosage + " - Special process for Pfizer");
    }
}
