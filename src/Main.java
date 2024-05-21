import java.util.*;

public class Main {

    public static List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    public static List<String> strings = new ArrayList<>(List.of("один", "один", "два", "два", "два", "два", "три", "три", "три"));

    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Task 1");
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2() {
        System.out.println("Task 2");
        Collections.sort(nums);
        int prevNum = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num % 2 == 0 && num != prevNum) {
                prevNum = num;
                System.out.println(num);
            }
        }
    }

    public static void task3() {
        System.out.println("Task 3");
        Set<String> uniqueWords = new HashSet<>(strings);
        System.out.println(uniqueWords);
    }

    public static void task4() {
        System.out.println("Task 4");
        Map<String, Integer> duplicate =new HashMap<>();
        for (String string : strings) {
            if (!duplicate.containsKey(string)) {
                duplicate.put(string, 1);
            } else {
                duplicate.put(string, duplicate.get(string) + 1);
            }
        }
        System.out.println(duplicate.values());
    }
}
