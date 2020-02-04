package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class QuickSort {
    public static Logger logger = Logger.getLogger("Logger");

    public static void quickSort(List<Integer> list, int s, int t) {
        if(s < t) {
            int m =  partition(list, s, t);
            quickSort(list, s, m - 1);
            quickSort(list, m + 1, t);
        }
    }

    public static int partition(List<Integer> list, int s, int t) {
        int pivot = list.get(t);
        int i = -1;
        int temp = 0;
        for (int j = 0; j < t; j++) {
            if(list.get(j) <= pivot) {
                i++;

                temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }
        temp = list.get(i + 1);
        list.set(i + 1, list.get(t));
        list.set(t, temp);

        return i + 1;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(40);
        list.add(5);
        list.add(18);
        list.add(29);
        list.add(10);
        list.add(2);
        list.add(50);
        list.add(50);

        logger.info("unsorted list: " + list.toString());
        quickSort(list, 0, list.size() - 1);
        logger.info("sorted list: " + list.toString());
    }
}
