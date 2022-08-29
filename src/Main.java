import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.findOddNumbers();
        System.out.println();
        main.findEvenNumbersIncreaseNotDuplicate();
        System.out.println();
        main.findUniqueString();
        System.out.println();
        main.counterDuplicate();
    }

    public void findOddNumbers() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if(num % 2 != 0) {
                System.out.println("num = " + num);
            }
        }

    }

    public void findEvenNumbersIncreaseNotDuplicate() {
        List<Integer> nums = new ArrayList<>(List.of(2,2,4,4,4, 1, 2,4,4, 3, 4, 4,4,4,4,4,4, 5, 5, 6,6,6,6,6,6,6, 7));
        Collections.sort(nums);
        for (int i = 0; i < nums.size() - 1; i++) {
            if(nums.get(i) % 2 == 0) {
                if(nums.get(i) == nums.get(i + 1)) {
                    continue;
                } else {
                    System.out.println("num = " + nums.get(i));
                }
            }
        }

    }

    public void findUniqueString() {
        List<String> strings = new ArrayList<>(List.of("a", "b", "a", "a", "b", "c", "c", "d"));
        List<String> uniqueElements = strings.stream().distinct().collect(Collectors.toList());
        System.out.println("uniqueElements = " +  uniqueElements);

    }

    public void counterDuplicate() {
        Map<Character, Integer> letters = new HashMap<Character, Integer>();

        ArrayList<Character> fakeArray = new ArrayList<Character>();
        fakeArray.add('a');
        fakeArray.add('a');
        fakeArray.add('a');
        fakeArray.add('b');
        fakeArray.add('b');
        fakeArray.add('c');
        fakeArray.add('c');
        fakeArray.add('c');
        fakeArray.add('w');
        fakeArray.add('w');
        fakeArray.add('w');
        fakeArray.add('w');
        fakeArray.add('g');

        for (int i = 0; i < fakeArray.size(); i++) {
            Character tempChar = fakeArray.get(i);

            if (!letters.containsKey(tempChar)) {
                letters.put(tempChar, 1);
            } else {
                letters.put(tempChar, letters.get(tempChar) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
            System.out.println("Буква = " + entry.getKey() + ", Повторений = " + entry.getValue());
        }

    }

}