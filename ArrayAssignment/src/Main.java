import java.util.Arrays;

public class Main {

    public static int[] addInt(int[] array, int add) {
        // Add value to end of array
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = add;
        return array;
    }

    public static int[] popInt(int[] array) {
        // Delete value from end of array
        return Arrays.copyOf(array, array.length - 1);
    }

    public static int[] insertInt(int[] array, int value, int index) {
        // Copy array data to new array (arrayInt) with 1 more index position
        int[] arrayIn = Arrays.copyOf(array, array.length + 1);
        for (int i = 0; i < arrayIn.length; i++) {
            if (i == index) {
                for (int a = arrayIn.length - 2, b = 1; a >= i; a--, b++) {
                    arrayIn[arrayIn.length - b] = arrayIn[a];
                }
                arrayIn[i] = value;
                break;
            }
        }
        return arrayIn;
    }

    public static void main(String[] args) {

        int[] array = {2, 3, 5};

        // Add
        System.out.println(Arrays.toString(addInt(array, 6)));

        // Delete
        System.out.println(Arrays.toString(popInt(array)));

        // Insert 4 into position 2
        System.out.println(Arrays.toString(insertInt(array, 4, 2)));
    }
}