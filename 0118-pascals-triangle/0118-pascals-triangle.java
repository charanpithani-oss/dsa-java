
class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for(int row = 0; row < numRows; row++) {

            List<Integer> list = new ArrayList<>();

            int ans = 1;

            for(int i = 0; i <= row; i++) {

                list.add(ans);

                ans = ans * (row - i);
                ans = ans / (i + 1);
            }

            result.add(list);
        }

        return result;
    }
}
