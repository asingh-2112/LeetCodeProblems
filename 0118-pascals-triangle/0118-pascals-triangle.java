class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> al=new ArrayList<>();
        al.add(new ArrayList<>());
        al.get(0).add(1);
        if(numRows==1) return al;
        al.add(new ArrayList<>());
        al.get(1).add(1);
        al.get(1).add(1);
        if(numRows==2) return al;
        for(int i=3;i<=numRows;i++){
            al.add(new ArrayList<>());
            al.get(i-1).add(1);
            for(int j=2;j<=i-1;j++){
                al.get(i-1).add(al.get(i-2).get(j-1)+al.get(i-2).get(j-2));
            }
            al.get(i-1).add(1);
        }
        return al;
    }
}