public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98; // вес в кг;
        double growth = 1.87; // рост в метрах;
        int index = service.calculate(weight, growth);
        System.out.println("BMI индекс: " + index);
    }
}