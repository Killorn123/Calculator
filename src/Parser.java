public class Parser {
    public static boolean isRome = false;
    public static int[] parse(String[] parts) throws Exception{
        int num1;
        int num2;
        try {
            num1 = RomeNums.valueOf(parts[0]).getValue();
            num2 = RomeNums.valueOf(parts[2]).getValue();
            isRome = true;
        } catch (IllegalArgumentException e) {
            try {
                num1 = Integer.parseInt(parts[0]);
                num2 = Integer.parseInt(parts[2]);
            } catch (NumberFormatException e2) {
                throw new Exception("Wrong input data");
            }
        }
        if (num1 > 10 || num2 > 10 || num1 < 1 || num2 < 1){
            throw new Exception("Wrong input data");
        }
        return new int[]{num1, num2};
    }
}