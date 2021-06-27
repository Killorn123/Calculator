import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        String[] parts = Input.read();
        int[] nums = Parser.parse(parts);
        char op = parts[1].charAt(0);
        int result = Calculator.calc(nums[0], nums[1], op);
        if (Parser.isRome) {
            System.out.println(Converter.convertArabianToRome(result));
        } else {
            System.out.println(result);
        }
    }
}
