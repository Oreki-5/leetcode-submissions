import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public boolean isValid(String s) {

        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put('(', ')');
        bracketMap.put('[', ']');
        bracketMap.put('{', '}');

        List<Character> validList = new ArrayList<>();
        validList.add('(');
        validList.add('[');
        validList.add('{');

        List<Character> stack = new ArrayList<>();

        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                if (!validList.contains(c)) {
                    return false;
                }
                stack.addLast(c);

            } else {

                if (c == bracketMap.get(stack.getLast())) {
                    stack.removeLast();
                } else {
                    if (!validList.contains(c)) {
                        return false;
                    }
                    else{
                        stack.addLast(c);
                    }
                }

            }
        }


        return stack.isEmpty();
    }
}