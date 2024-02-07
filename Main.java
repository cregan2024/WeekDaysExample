import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("Original days of the week:");
        printArray(weekDays);

        weekDays = resizeArray(weekDays, 5); // Resizing to workdays only

        System.out.println("\nModified days of the week (excluding Saturday and Sunday):");
        printArray(weekDays);

        shuffleArray(weekDays); // Shuffling the array

        System.out.println("\nShuffled days of the week:");
        printArray(weekDays);
    }

    private static String[] resizeArray(String[] array, int newSize) {
        return Arrays.copyOfRange(array, 0, newSize);
    }

    private static void shuffleArray(String[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            String temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    private static void printArray(String[] array) {
        for (String element : array) {
            System.out.println(element);
        }
    }
}
