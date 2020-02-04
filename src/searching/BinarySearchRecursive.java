package searching;

import java.util.logging.Logger;

public class BinarySearchRecursive {
    public static final Logger logger = Logger.getLogger("Main");

    public static int binarySearchRecursive(int item, int[] list, int left, int right) {
        if(left > right) {
            return -1;
        }

        else {
            int middle = (left + right) / 2;

            if(list[middle] == item) {
                return middle;
            }
            else if(list[middle] < item) {
                left = middle + 1;
                return binarySearchRecursive(item, list, left, right);
            }
            else {
                right = middle - 1;
                return binarySearchRecursive(item, list, left, right);
            }
        }
    }

    public static void main(String[] args) {
        int[] list = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int item = -1;

        int left = 0;
        int right = list.length - 1;
        int result = binarySearchRecursive(item, list, left, right);
        if(result != -1) {
            logger.info("element found at index: " + result);
        } else {
            logger.info("item not found");
        }
    }
}
