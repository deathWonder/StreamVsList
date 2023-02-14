import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> listResult = new ArrayList<>();

        int firstIndex = 0;

        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        Collections.sort(list);


        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) {
                firstIndex = i;
                break;
            }
        }

        list = list.subList(firstIndex, list.size());

        for (Integer integer : list) {
            if (integer % 2 == 0) {
                listResult.add(integer);
            }
        }

        System.out.println(listResult);


    }
}

