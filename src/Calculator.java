public class Calculator {
    public int comput(Integer number) {
        int result = 0;
        for (int i = number-1; i >= 2; i--) {
            if (i % 4 == 0||i % 5 == 0||i % 7 == 0||i % 9 == 0||i % 11 == 0) {
                result += i;
            }
        }
        return result;
    }
}
