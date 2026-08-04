import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = Arrays.stream(nums).boxed().toList();
        List<Integer> output = new ArrayList<>();

        for (int i = list.getFirst()+1; i < list.getLast(); i++) {
            if(!list.contains(i)){
                output.add(i);
            }
        }
        return output;
    }
}