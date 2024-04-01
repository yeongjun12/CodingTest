import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (containsOnly05(i)) {
                result.add(i);
            }
        }

        if (result.isEmpty()) {
            return new int[]{-1};
        } else {
            return result.stream().mapToInt(Integer::intValue).toArray();
        }
    }

    private boolean containsOnly05(int num) {
        String numStr = Integer.toString(num);
        return numStr.matches("[05]+");
    }
}
