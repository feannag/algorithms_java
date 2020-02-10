package sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
	public List<Integer> mergeLists(List<Integer> listA, List<Integer> listB) {
		int listASize = listA.size();
		int listBSize = listB.size();
		int indexI = 0;
		int indexJ = 0;

		List<Integer> auxiliaryList = new ArrayList<>();

		while(indexI < listASize && indexJ < listBSize) {
			if(listA.get(indexI) <= listB.get(indexJ)) {
				auxiliaryList.add(listA.get(indexI));
				indexI++;
			}

			else if(listB.get(indexJ) < listA.get(indexI)) {
				auxiliaryList.add(listB.get(indexJ));
				indexJ++;
			}
		}

		if(indexI == listASize) {
			auxiliaryList.addAll(listB.subList(indexJ, listB.size()));
		}
		else if(indexJ == listBSize) {
			auxiliaryList.addAll(listA.subList(indexI, listA.size()));
		}

		return auxiliaryList;
	}

    public List<Integer> partition(List<Integer> numbers_list) {
        int listSize = numbers_list.size();
        int m = listSize / 2;

        if(listSize == 1) {
            return numbers_list;
        }

        List<Integer> listA = partition(numbers_list.subList(0, m));
        List<Integer> listB = partition(numbers_list.subList(m, listSize));

        List<Integer> auxiliaryList = mergeLists(listA, listB);
        return auxiliaryList;
    }

    public static void main(String[] args) {
        List<Integer> numbers_list = new ArrayList<>();
        numbers_list.add(15);
		numbers_list.add(1);
		numbers_list.add(5);
		numbers_list.add(8);
		numbers_list.add(9);
		numbers_list.add(10);
		numbers_list.add(2);
		numbers_list.add(50);
		numbers_list.add(40);
		numbers_list.add(3);
		numbers_list.add(2);
		numbers_list.add(9);
		numbers_list.add(10);
		numbers_list.add(7);
		numbers_list.add(33);
		numbers_list.add(34);
		System.out.println(numbers_list.toString());

        MergeSort ms = new MergeSort();
        List<Integer> sortedList = ms.partition(numbers_list);
		System.out.println(sortedList.toString());
    }
}
