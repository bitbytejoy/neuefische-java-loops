public class App {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 3, 1};

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println(sum);
    }
}
