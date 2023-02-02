
    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    Collections.sort(arr);
    long min=0;
    long max=0;
    for(int i=0;i<arr.size()-1;i++){
        min+=arr.get(i);
        max+=arr.get(i+1);
    }
    // Collections.sort(arr);
    System.out.println(min+" "+max);

    }

}
