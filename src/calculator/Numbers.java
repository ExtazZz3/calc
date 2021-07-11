package calculator;

public class Numbers {
    private int a;
    private int b;
    private boolean arabic;
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public boolean isArabic() {
        return arabic;
    }
    public static Numbers numsDefinition(String str) {
        Numbers result = new Numbers();
        String [] numbers = str.replaceAll("\\s", "").split("[+-/*]");
        if (numbers.length > 3 || numbers.length == 1) {
            System.out.println("Неправильный ввод.");
            System.exit(0);
        }
        try {
            result.a = Integer.parseInt(numbers[0]);
            result.b = Integer.parseInt(numbers[1]);
            result.arabic = true;
        } catch (NumberFormatException e) {
            if (RomanNums.isRoman(numbers[0]) && RomanNums.isRoman(numbers[1])) {
                result.a = RomanNums.convert(numbers[0]);
                result.b = RomanNums.convert(numbers[1]);
                result.arabic = false;
            }
            else if (RomanNums.isRoman(numbers[0]) ^ RomanNums.isRoman(numbers[1])) {
                System.out.println("Разные форматы чисел.");
                System.exit(0);
            }
            else {
                System.out.println("Неподходящие введённые данные.");
                System.exit(0);
            }
        }
        if (result.a > 10 || result.a < 1 || result.b > 10 || result.b < 1) {
            System.out.println("Слишком большие/маленькие числа");
            System.exit(0);
        }
        return (result);
    }
}
