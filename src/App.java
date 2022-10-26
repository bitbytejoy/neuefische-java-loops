public class App {
    public static void main(String[] args) {
        String word = "anna";
        char[] characters = word.toCharArray();

        boolean isAnagram = true;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != characters[characters.length - 1 - i]) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("Ja");
        } else {
            System.out.println("Nein");
        }
    }
}
