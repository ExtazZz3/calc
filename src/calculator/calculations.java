package calculator;
import java.util.Scanner;

public class calculations {
    private static String calculation(String str) {
        Numbers num = Numbers.numsDefinition(str);
        int result = 0;
        if (str.contains("+")) {
            result = num.getA() + num.getB();
        }
        else if (str.contains("-")) {
            result = num.getA() - num.getB();
        }
        else if (str.contains("*")) {
            result = num.getA() * num.getB();
        }
        else if (str.contains("/")) {
            result = num.getA() / num.getB();
        }
        else {
            System.exit(0);
        }
        return num.isArabic() ? (result + "") : RomanNums.convert(result);
    }

    public static void text() {
        System.out.println("Консольный калькулятор.");
        System.out.println("Данные вводятся в формате: a + b, a - b, a / b, a * b");
        System.out.println("Чтобы закончить вычисления введите \"exit\" ");
        System.out.println("Введите пример: ");

        Scanner input = new Scanner(System.in);
        while (true) {
            String str = input.nextLine();
            if (str.equals("exit")) {
                System.exit(0);
                return;
            }
            System.out.println("Результат: " + calculations.calculation(str));
            System.out.println("Следующий пример: ");
        }
    }
}
