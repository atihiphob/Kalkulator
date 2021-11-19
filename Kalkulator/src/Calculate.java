public class Calculate {
    public static int calculated (int a, int b, String operator) throws Exception{
        int result;
        switch (operator) {
            case "\\+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "\\*":
                result = a * b;
                break;
            case "/":
                if (b==0){
                    throw new Exception("Ошибка: деление на ноль невозможно!");}
                else
                    result = a / b;
                break;
            default:
                throw new Exception("Ошибка: неверный знак операции!");
        }
        return result;
    }
}
