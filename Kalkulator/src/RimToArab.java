import java.util.InputMismatchException;

public class RimToArab {

    public static String ArabToRim(int arabNum) {
        String[] rim = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        return rim[arabNum];
    }

    public static int rimToArabMethod(String rimNum) {
        try {
            if ("I".equals(rimNum)) {
                return 1;
            } else if ("II".equals(rimNum)) {
                return 2;
            } else if ("III".equals(rimNum)) {
                return 3;
            } else if ("IV".equals(rimNum)) {
                return 4;
            } else if ("V".equals(rimNum)) {
                return 5;
            } else if ("VI".equals(rimNum)) {
                return 6;
            } else if ("VII".equals(rimNum)) {
                return 7;
            } else if ("VIII".equals(rimNum)) {
                return 8;
            } else if ("IX".equals(rimNum)) {
                return 9;
            } else if ("X".equals(rimNum)) {
                return 10;
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Неверный формат данных");
        }
        return -1;
    }
}
