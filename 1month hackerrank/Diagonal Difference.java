class Result {
    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int l=0;
    int r=0;
    for(int i=0;i<arr.get(0).size();i++){
        l+=arr.get(i).get(i);
    }
    int j=arr.get(0).size()-1;
    for(int i=0;i<arr.get(0).size();i++){
        r+=arr.get(i).get(j);
        j--;
    }
    return Math.abs(l-r);
    }

}
