import java.util.*;

public class duplicatnumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        boolean hasDuplicate = false;

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    hasDuplicate = true;
                    break;
                }
            }
        }

        if (hasDuplicate) {
            System.out.println("The array contains duplicate numbers.");
        } else {
            System.out.println("The array does not contain duplicate numbers.");
        }
    }
}
