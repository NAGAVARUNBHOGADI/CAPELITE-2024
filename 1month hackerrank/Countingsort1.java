class Result {
    public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here
    List<Integer>list=new ArrayList<>();
    for(int i=0;i<100;i++){
        list.add(0);
    }
    for(Integer i:arr){
        list.set(i,list.get(i)+1);
    }
    return list;
    }

}
