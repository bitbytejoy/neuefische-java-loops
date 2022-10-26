public class App {
    public static void main(String[] args) {
        int[] numbers = new int[]{ 2, 3, 4, 5 };

        int position = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                position = i;
                break;
            }
        }

        System.out.println(position);
    }
}
