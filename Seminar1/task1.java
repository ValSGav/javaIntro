public class task1 {
    public static void main(String[] args) {

        int[] arr = { 1, 1, 0, 1, 1, 1 };
        System.out.println(getMaxCountConsecutinveUnit(arr));

    }

    public static int getMaxCountConsecutinveUnit(int[] arr) {
        int currCounter = 0;
        int maxCount = 0;

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == 1) {
                currCounter++;

            } else {
                if (currCounter > maxCount) {
                    maxCount = currCounter;
                }
                currCounter = 0;
            }
        }
        ;
        if (currCounter > maxCount) {
            maxCount = currCounter;
        }
        ;
        return maxCount;

    };

}
