class Result {
    public static int lonelyinteger(List<Integer> a) {
    // Write your code here
    HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
    for(Integer i:a){
        if(map.containsKey(i)){
            map.put(i,map.get(i)+1);
        }
        else{
            map.put(i,1);
        }
    }
    for(Map.Entry<Integer,Integer> m : map.entrySet()){    
        if(m.getValue()==1){
            return m.getKey();
        }
    }
    return -1;
}
}
