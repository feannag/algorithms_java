package searching;

import java.util.logging.Logger;

public class BinarySearch {
    public static final Logger logger = Logger.getLogger("Main");

    public static int binarySearch(int item, int[] list) {
        int result = -1;
        int index = list.length / 2;

        if(list[0] == item){
            return 0;
        }

        if(list[list.length-1] == item) {
            return list.length-1;
        }

        for(;index != 0 && index != list.length-1;) {
            if(list[index] == item) {
                result = index;
                break;
            } else if(item < list[index]) {
                index = index / 2;
            } else {
                index = (index + list.length) / 2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] list = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int item = 10;

        int result = binarySearch(item, list);
        if(result != -1) {
            logger.info("element found at index: " + result);
        } else {
            logger.info("item not found");
        }
    }
}
