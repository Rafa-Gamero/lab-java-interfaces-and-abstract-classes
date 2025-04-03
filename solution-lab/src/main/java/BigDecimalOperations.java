import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {

    /**
     * Redondea un BigDecimal a la centésima más cercana
     * @param number Número a redondear
     * @return Valor redondeado como double
     */
    public static double roundToNearestHundredth(BigDecimal number) {
        return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    /**
     * Invierte el signo y redondea a la décima más cercana
     * @param number Número a procesar
     * @return Resultado invertido y redondeado
     */
    public static BigDecimal invertAndRoundToNearestTenth(BigDecimal number) {
        return number.negate().setScale(1, RoundingMode.HALF_UP);
    }

    public static void main(String[] args) {
        // Ejemplos de uso
        System.out.println(roundToNearestHundredth(new BigDecimal("4.2545"))); // 4.25
        System.out.println(invertAndRoundToNearestTenth(new BigDecimal("1.2345"))); // -1.2
        System.out.println(invertAndRoundToNearestTenth(new BigDecimal("-45.67"))); // 45.7
    }
}
