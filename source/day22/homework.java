package day22;

public class homework {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int length = array.length;
        int i = 0;
        while (i < length) {
            System.out.println(array[i] + " " + array[length - 1 - i]);
            i++;
            if (i > length - 1 - i) {
                break;
            }
        }

    }
}