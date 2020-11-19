package conversors;

public class ConversorTemperatura implements Convertible {

    private double fahrenheit;

    @Override
    public double execute(double value) {
        return (value - 32) / 1.8;
    }
}
