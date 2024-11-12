import java.util.Scanner;

public class Main {
    //1. Генерация пароля
    //а.Выбор длины и сложности
    //Генерация одного символа

    public static void main(String[] args) {
        System.out.println("Введите желаемую длину пароля");
        Scanner scanner = new Scanner(System.in);
        int lengthOfPassword = scanner.nextInt();

        StringGeneration stringGenerator = new StringGeneratorImpl();
        PasswordHistory passwordHistory = new PasswordHistory();
        String resultOfPassword = stringGenerator.generateString(lengthOfPassword);
        System.out.println(resultOfPassword);
        passwordHistory.addPassword(resultOfPassword);

        StringGeneration stringGeneratorTwo = new FakePassword();
        String resultOfFake = stringGeneratorTwo.generateString(lengthOfPassword);
        System.out.println(resultOfFake);
        passwordHistory.addPassword(resultOfFake);

        passwordHistory.printHistory();




    }
}
