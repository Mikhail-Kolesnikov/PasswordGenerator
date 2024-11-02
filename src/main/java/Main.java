import java.util.Random;
import java.util.Scanner;

public class Main {
    //1. Генерация пароля
    //а.Выбор длины и сложности
    //Генерация одного символа

    public static void main(String[] args) {
        System.out.println("Введите желаемую длину пароля");
        Scanner scanner = new Scanner(System.in);
        int lengthOfPassword = scanner.nextInt();

        //System.out.println(question);
        String string = "";
        for (int i = 0; i < lengthOfPassword; i++) {

            char resultOfGenerate = generateSymbol();
            string += resultOfGenerate;
        }
        System.out.println(string);
    }

    public static char generateSymbol() {
        int start;
        int finish;

        Random random = new Random();
        int resultOfType = random.nextInt(0, 4);

        if (resultOfType == 0) {
            start = 'A';
            finish = 'Z' + 1;
        } else if (resultOfType == 1) {
            start = '!';
            finish = '/' + 1;
        } else if (resultOfType == 2) {
            start = 'a';
            finish = 'z' + 1;
        } else {
            start = '0';
            finish = '9' + 1;
        }

        int number = random.nextInt(start, finish);
        char symbol = (char) number;

        return symbol;


    }


}
