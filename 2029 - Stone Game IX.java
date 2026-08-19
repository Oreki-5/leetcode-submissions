import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public boolean stoneGameIX(int[] stones) {


        if(stones.length == 1){
            return false;
        }

        if(stones.length == 2 && Arrays.stream(stones).sum()%3 == 0){
            if(stones[0]%3 == 0){
                return false;
            }
            return true;
        }
        List<Integer> list = new ArrayList<>();

        for (Integer i : stones) {
            list.add(i);
        }

        return check(list, 0, 1) == 1 ;

    }

    public int check(List<Integer> list, int sum, int turn) {
        
        // 1 for alice win | 2 for bob win
        if (list.isEmpty()) {
            return 2;
        }
        if (sum % 3 == 0) {
            if (turn == 1) {
                return 2;
            }
            return 1;
        }

        boolean flag = true;

        for (int i = 0; i < list.size(); i++) {
            if ((sum + list.get(i)) % 3 == 0) {
                flag = false;
                continue;
            }
            flag = true;
            List<Integer> newList = new ArrayList<>(list);
            newList.remove(i);
            return check(newList, (sum + list.get(i)), turn == 1 ? 2 : 1);
        }

        if (!flag) {
            return turn == 1 ? 2 : 1;
        }
        return turn;
    }
}