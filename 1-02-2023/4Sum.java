class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer> > list=new ArrayList<>();
        // if(nums.length<4){
        //     return list;
        // }
        // if(nums.length==4){
        //     if(nums[0]+nums[1]+nums[2]+nums[3]!=target){
        //         return list;
        //     }
        //     else{
        //         List<Integer>ok=new ArrayList<Integer>();
        //         ok.add(nums[0]);
        //         ok.add(nums[1]);
        //         ok.add(nums[2]);
        //         ok.add(nums[3]);
        //         list.add(ok);
        //     }
        // }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                long t1=(long)target-(long)(nums[i]+nums[j]);
                int low=j+1;
                int high=nums.length-1;
                while(low<high){
                    if(nums[low]+nums[high]==t1){
                        List<Integer>ll=new ArrayList<Integer>();
                        ll.add(nums[i]);
                        ll.add(nums[j]);
                        ll.add(nums[low]);
                        ll.add(nums[high]);
                        list.add(ll);
                        // low++;
                        // high--;
                        while (low < high && nums[low] == ll.get(2)) low++;
                        while (low < high && nums[high] == ll.get(3)) high--;


                    }
                    else if(nums[low]+nums[high]>t1){
                        high--;
                    }
                    else{
                        low++;
                    }
                }
            while(j + 1 < nums.length && nums[j + 1] == nums[j]) j++;

            }
            while (i + 1 < nums.length && nums[i + 1] == nums[i]) i++;
        }
        return list;
    }
}
