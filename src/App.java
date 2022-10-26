public class App {
    public static void main(String[] args) {
        int[] numbers = new int[]{-2, 3, -1, 4, -5, 6, -7};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
