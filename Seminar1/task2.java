public class task2 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 3, 3, 1, 5, 3, 3 };
        print2dArray(arr);
        System.out.println();
        moveElementToEndOfArray(3, arr);
        print2dArray(arr);
    }


    public static void print2dArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (i != 0)
                System.out.print(" ");
            System.out.print(arr[i]);
        }
    }


    public static void moveElementToEndOfArray(int element, int[] array) {
        // for (int i = 0; i < array.length; i++) {
        //     if (array[i] == element) {
        //         boolean done = false;
        //         for (int j = i + 1; (j < array.length) && (done == false); j++) {
        //             if (array[j] != element) {
        //                 array[i] = array[j];
        //                 array[j] = element;
        //                 done = true;
        //             }
        //         }
        //     }
        // }
        // офигенное решение :)
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != element) {
                array[counter++] = array[i];
            }
        }
        for (int i = counter; i < array.length; i++) {
            array[i] = element;
        }
    }


}
