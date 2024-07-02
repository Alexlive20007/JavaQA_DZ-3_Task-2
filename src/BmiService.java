public class BmiService {
    public int calculate(double weight, double growth) {
        double index = weight / (growth * growth);
        return (int) index;
    }
}
