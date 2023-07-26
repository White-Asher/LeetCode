class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        list.add(l1);
        
        if(numRows >= 2) {
            l1 = new ArrayList<>();
            l1.add(1);
            l1.add(1);
            list.add(l1);
        }
        
        for(int i = 2; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            List<Integer> t1 = list.get(i - 1);
            temp.add(1);
            for(int j = 0; j < i - 1; j++) {
                int i1 = t1.get(j);
                int i2 = t1.get(j+1);
                temp.add(i1+i2);
            }
            temp.add(1);
            list.add(temp);
        }
        
        return list;
    }
}