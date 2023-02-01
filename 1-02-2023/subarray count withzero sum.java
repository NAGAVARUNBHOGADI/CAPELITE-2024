public class Solution {

	public static int countSubarrays(int n, int[] arr) {
		// Write your code here.
		HashMap<Integer,Integer>map=new HashMap<>();
		map.put(0,1);
		int c=0;
		int pre=0;
		for(int i=0;i<n;i++){
			pre+=arr[i];
			if(!map.containsKey(pre)){
				map.put(pre,1);
			}
			else{
				c+=map.get(pre);
				map.put(pre,map.get(pre)+1);
			}
		}
		return c;
	}

}
