import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        int output = 0;

        Map<String, Integer> base = new HashMap<>();
        base.put("I", 1);
        base.put("V", 5);
        base.put("X", 10);
        base.put("L", 50);
        base.put("C", 100);
        base.put("D", 500);
        base.put("M", 1000);

        Map<String, Integer> exceptions = new HashMap<>();
        exceptions.put("IV", 4);
        exceptions.put("IX", 9);
        exceptions.put("XL", 40);
        exceptions.put("XC", 90);
        exceptions.put("CD", 400);
        exceptions.put("CM", 900);

        List<String> stack = new LinkedList<>();

        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.addLast(String.valueOf(c));
            } else {
                if (exceptions.containsKey((stack.getLast() + c))) {
                    output += exceptions.get((stack.removeLast() + c));

                } else {

                    output += base.get(stack.removeLast());

                    stack.addLast(String.valueOf(c));

                }
            }
        }
        if (!stack.isEmpty())
            output += base.get(stack.removeLast());

        return output;

    }
}
