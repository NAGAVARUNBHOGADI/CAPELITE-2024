class Result {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    // Write your code here
    List<Integer>list=new ArrayList<Integer>();
    HashMap<String,Integer>map=new HashMap<>();
    for(String i:strings){
        if(map.containsKey(i)){
            map.put(i,map.get(i)+1);
        }
        else{
            map.put(i,1);
        }
    }
    for(String k:queries){
        if(map.containsKey(k)){
            list.add(map.get(k));
        }
        else{
            list.add(0);
        }
    }
    return list;
    }

}
