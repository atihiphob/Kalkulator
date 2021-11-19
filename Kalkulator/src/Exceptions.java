public class Exceptions {
    public static void exceptionArabAndRim (String term_rim) throws Exception {
        switch (term_rim) {
            case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" ->  throw new Exception("Неверный формат: используются одновременно разные системы счисления!");}
    }

    public static void termLengthException (String[] term) throws Exception {
        if (term.length > 2) {
            throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");}
        else if (term.length < 2) {
        throw new Exception("Введенная строка не является математической операцией");}
    }
}

