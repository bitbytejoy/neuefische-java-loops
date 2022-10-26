public class App {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5};

        boolean has1 = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                has1 = true;
                break;
            }
        }

        if (has1) {
            System.out.println("Ja");
        } else {
            System.out.println("Nein");
        }
    }
}
