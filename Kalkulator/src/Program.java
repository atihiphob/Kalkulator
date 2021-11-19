import java.util.Scanner;

public class Program {
    public static void main (String[]args) throws Exception {

        do {
            System.out.println("Введите выражение");
            Scanner sc = new Scanner(System.in);
            String term = sc.nextLine();
            selectClass(term);
            System.out.println("");
        }while (true);
    }
    public static void selectClass (String term) throws Exception {
        String[] s = new String[2];
        s = term.split("[-+/*]");
        switch (s[0]) {
            case "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X": Rim.rimNums(term);
                break;
            default:
                Arab.arabNums(term);
        }
    }
}

