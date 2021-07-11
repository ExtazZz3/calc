package calculator;
import java.util.Map;
import java.util.HashMap;

public class RomanNums {
    HashMap<Integer, String> numbers = new HashMap<>();

    protected RomanNums() {
        numbers.put(1, "I");
        numbers.put(2, "II");
        numbers.put(3, "III");
        numbers.put(4, "IV");
        numbers.put(5, "V");
        numbers.put(6, "VI");
        numbers.put(7, "VII");
        numbers.put(8, "VIII");
        numbers.put(9, "IX");
        numbers.put(10, "X");
        numbers.put(20, "XX");
        numbers.put(30, "XXX");
        numbers.put(40, "XL");
        numbers.put(50, "L");
        numbers.put(60, "LX");
        numbers.put(70, "LXX");
        numbers.put(80, "LXXX");
        numbers.put(90, "XC");
        numbers.put(100, "C");
    }
    public static String convert(int i) {
        RomanNums rn = new RomanNums();
        if (i < 11) {
            return rn.numbers.get(i);
        }
        else if (i % 10 == 0) {
            return rn.numbers.get(i);
        }
        else {
            return (rn.numbers.get(i / 10 * 10) + rn.numbers.get(i % 10));
        }
    }
    public static int convert(String str) {
        RomanNums rn = new RomanNums();
        int result = 0;
        for (Map.Entry<Integer, String> entry :
                rn.numbers.entrySet()) {
            if (entry.getValue().equals(str)) {
                result = entry.getKey();
            }
        }
        return result;
    }
    public static boolean isRoman(String str) {
        RomanNums rn = new RomanNums();
        return rn.numbers.containsValue(str);
    }
}
