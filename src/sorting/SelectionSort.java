package sorting;

import java.util.Arrays;
import java.util.logging.Logger;

public class SelectionSort {
    public static final Logger logger = Logger.getLogger("SelectionSort");

    public static void selectionSort(int[] list) {
        for(int i=0; i<list.length - 1; i++) {
            int min = list[i];
            int index = 0;
            boolean swap_flag = false;

            for(int j=i+1; j<list.length; j++) {
                if(list[j] < min) {
                    min = list[j];
                    index = j;
                    swap_flag = true;
                }
            }
            if(swap_flag == true) {
                int temp = list[i];
                list[i] = min;
                list[index] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] list = {5, 4, 3, 2, 1};

        logger.info("list before sorting: " + Arrays.toString(list));
        selectionSort(list);
        logger.info("list after sorting: " + Arrays.toString(list));
    }
}
