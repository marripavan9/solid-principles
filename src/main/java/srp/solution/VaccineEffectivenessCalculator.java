package srp.solution;

public class VaccineEffectivenessCalculator {

    public double calculateEffectiveness(VaccineDose dose) {
        return dose.getDosage() * 1.10;
    }
}
