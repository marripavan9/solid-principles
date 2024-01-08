package lsp.solution;

public class PfizerVaccine extends Vaccine {
    private PfizerVaccineActions pfizerActions;

    public PfizerVaccine() {
        super("Pfizer");
        pfizerActions = new PfizerVaccineActions();
    }

    @Override
    public void administerDose(int dosage) {
        super.administerDose(dosage);
        pfizerActions.performPfizerSpecificActions(dosage);
    }
}
