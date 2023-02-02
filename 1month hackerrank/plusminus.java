class Result {
ction accepts INTEGER_ARRAY arr as parameter.
    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int plus=0;
    int minus=0;
    int zero=0;
    for(int i=0;i<arr.size();i++){
        int n=arr.get(i);
        if(n<0){
            minus++;
        }
        else if(n==0){
            zero++;
        }
        else{
            plus++;
        }
    }
    System.out.println((float)plus/arr.size());
    System.out.println((float)minus/arr.size());
    System.out.println((float)zero/arr.size());
    }

}
