public class BmiService {
    public int calculate(double m, int kg) {
        int result;
        result = (int) (kg / (m * m));
        return result;
    }
}

