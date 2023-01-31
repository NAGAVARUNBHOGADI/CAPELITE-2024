class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet();
         for(Integer i:nums){
             set.add(i);
         }
         int max=0;
         for(Integer j:set){
             if(!set.contains(j-1)){
                 int curnum=j;
                 int c=1;
                 while(set.contains(curnum+1)){
                     curnum+=1;
                     c=c+1;
                 }
                 max=Math.max(max,c);
             }
         }
         return max;
    }
}
