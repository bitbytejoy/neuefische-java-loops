public class App {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 3, 1};

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 1;
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
