
class Result {
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
    // Write your code here
    Collections.sort(A);
     Collections.sort(B, Collections.reverseOrder());
     int f=0;
     for(int i=0;i<A.size();i++){
         if(A.get(i)+B.get(i)<k){
             return "NO";
         }
         else{
             f++;
         }
     }
     if(f==A.size()){
         return "YES";
     }
     return "NO";
    }

}
