class Result {
    public static int birthday(List<Integer> s, int d, int m) {
    // Write your code here
    int cc= 0;
    for(int i = 0; i+m <= s.size(); i++){
        int sum= 0;
        for(int j = 0; j < m; j++){
            sum+= s.get(i+j);
        }
        if(sum == d){
            cc++;
        }
        // c = 0;
    }
    return cc;
      }

}
