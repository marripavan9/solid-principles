package dip.solution;

public class VaccinationService {
    private Vaccine vaccine;

    public VaccinationService(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public void vaccinate() {
        vaccine.administerDose();
    }
}
