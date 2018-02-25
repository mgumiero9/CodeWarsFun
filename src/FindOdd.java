import java.util.HashMap;
import java.util.Map;

public class FindOdd {
    private static int tempValue;
    private static Map<Integer, Integer> map;

    public static int findIt(int[] A) {
        tempValue = 0;
        map = new HashMap<>();

        return checkOcurrences(A);
    }



    private static int getOddNumber() {
        final int[] odd = {0};
        map.forEach((key, value) -> {
            if (value % 2 != 0) {
                odd[0] = key;
            }
        });
        return odd[0];
    }

    private static int checkOcurrences(int[] A) {
        for (int x : A) {
            if (map.containsKey(x)) {
                tempValue = map.get(x);
                map.put(x, tempValue + 1);
            } else {
                map.put(x, 1);
            }
        }
        return getOddNumber();
    }
}
