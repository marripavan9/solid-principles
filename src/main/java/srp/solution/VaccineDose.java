package srp.solution;

public class VaccineDose {

    private String vaccineType;
    private int dosage;

    public VaccineDose(String vaccineType, int dosage) {
        this.vaccineType = vaccineType;
        this.dosage = dosage;
    }

    public String getVaccineType() {
        return vaccineType;
    }

    public void setVaccineType(String vaccineType) {
        this.vaccineType = vaccineType;
    }

    public int getDosage() {
        return dosage;
    }

    public void setDosage(int dosage) {
        this.dosage = dosage;
    }
}
