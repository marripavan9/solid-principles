package dip.solution;

public class PfizerVaccine implements Vaccine {
    @Override
    public void administerDose() {
        System.out.println("Administering a dose of Pfizer vaccine");
    }
}
