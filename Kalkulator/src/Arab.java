public class Arab {
    public static void  arabNums(String term) throws Exception {
        String[] term_arab = term.split("[/+*-]");
        Exceptions.termLengthException(term_arab);

        int a = Integer.parseInt(term_arab[0]);
        int b = Integer.parseInt(term_arab[1]);
        if (a>10 || b>10) throw new Exception("Ошибка! Одно из введенных чисел больше 10!");
        if (a<1 || b<1) throw new Exception("Ошибка! Одно из введенных чисел меньше 1!");
        int result;
        String operator;
        if (term.contains("+")) {
            operator = "\\+";
            result = Calculate.calculated(a, b, operator);
            System.out.println(result);
        } else if (term.contains("-")) {
            operator = "-";
            result = Calculate.calculated(a, b, operator);
            System.out.println(result);
        } else if (term.contains("/")) {
            operator = "/";
            result = Calculate.calculated(a, b, operator);
            System.out.println(result);
        } else if (term.contains("*")) {
            operator = "\\*";
            result = Calculate.calculated(a, b, operator);
            System.out.println(result);
        }
    }
}

