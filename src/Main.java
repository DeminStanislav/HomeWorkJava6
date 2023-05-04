
public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();

        double m = 1.92;
        int kg = 81;
        int bmi = service.calculate(m, kg);

        System.out.println("Индекс массы тела: " + bmi);
    }

}