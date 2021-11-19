public class Rim {
    public static void rimNums(String term) throws Exception {
        String[] term_rim = term.split("[-+/*]");
        Exceptions.termLengthException(term_rim);
        String rim_a = term_rim[0];
        String rim_b = term_rim[1];
        Exceptions.exceptionArabAndRim(term_rim[0]);
        Exceptions.exceptionArabAndRim(term_rim[1]);
        int a = RimToArab.rimToArabMethod(rim_a);
        int b = RimToArab.rimToArabMethod(rim_b);
        String operator;
        int result;
        if (a<=10 && b<=10 ) {
            if (term.contains("+")) {
                operator = "\\+";
                result = Calculate.calculated(a, b, operator);
                System.out.println(RimToArab.ArabToRim(result));}
            else if (term.contains("-")) {
                operator = "-";
                result = Calculate.calculated(a, b, operator);
                if (result<0){
                    throw new Exception("Ошибка: в римской системе счисления нет отрицательных чисел!");}
                else if (result==0) {
                    throw new Exception("Ошибка: Результатом работы калькулятора с римскими числами могут быть только положительные числа!");}
                else System.out.println(RimToArab.ArabToRim(result));}
            else if (term.contains("*")) {
                operator = "\\*";
                result = Calculate.calculated(a, b, operator);
                System.out.println(RimToArab.ArabToRim(result));}
            else if (term.contains("/")) {
                operator = "/";
                result = Calculate.calculated(a, b, operator);
                System.out.println(RimToArab.ArabToRim(result));}
        }
        else {
            System.out.println("Одно из введенных чисел больше X! \n Попробуйте снова.");}
    }
}