public class DivisionException{
    public static double divide(double numerator, double denominator) throws CustomDivisionException {
        if (denominator == 0) {
            throw new CustomDivisionException("Деление на ноль невозможно.");
        }
        return numerator / denominator;
    }
}