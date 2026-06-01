class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.get(0).add(1);
        for (int i = 1; i < n; i++) {
            list.add(new ArrayList<>());
            list.get(i).add(1);
            long ans = 1;
            for (int j = 1; j <=i; j++) {
                ans = ans * (i - j + 1);
                ans = ans / j;
                list.get(i).add((int)ans);
            }
        }
        return list;
    }
}
