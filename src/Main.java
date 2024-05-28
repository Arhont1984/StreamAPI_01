import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        intList.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);

        //запрос в другой метод
        StreamMain.streamline(intList);

    }

    public static class StreamMain {

        public static void streamline(List<Integer> intList) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int num : intList) {
                if (num > 0 && num % 2 == 0) {
                    list.add(num);
                }
            }
            Collections.sort(list);

            for (int num : list) {
                System.out.println(num);
            }
        }

    }


}

