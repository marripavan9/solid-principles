package dip.violation;

public class VaccinationService {
    private PfizerVaccine pfizerVaccine;

    public VaccinationService(PfizerVaccine pfizerVaccine) {
        this.pfizerVaccine = pfizerVaccine;
    }

    public void vaccinate() {
        pfizerVaccine.administerDose();
    }
}
