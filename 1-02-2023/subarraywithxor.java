import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		// Write your code here.
		 HashMap<Integer,Integer>map=new HashMap<>();
        int c=0;
        int v=0;
        // map.put(0,1);
        for(int i=0;i<arr.size();i++){
            v=v^arr.get(i);
            if(map.containsKey(v^x)){
                c+=map.get(v^x);
            }
            if(v==x){
				c++;
			}
			if(map.containsKey(v)){
				map.put(v,map.get(v)+1);
			}
			else{
				map.put(v,1);
			}
        }
        return c;
    }
		
}
