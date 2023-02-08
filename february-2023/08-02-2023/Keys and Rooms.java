class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer>set=new HashSet<>();
        Queue<Integer>q=new LinkedList();
        q.add(0);
        while(!q.isEmpty()){
            int curr=q.poll();
            if(!set.contains(curr)){
                set.add(curr);
                for(int i:rooms.get(curr)){
                    if(!set.contains(i)){
                        q.add(i);
                    }
                }
            }
        }
        return set.size()==rooms.size();
    }
}
