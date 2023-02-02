class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    System.out.println(s.substring(8,9));
    System.out.println(s.substring(0,2));
    if(s.substring(8,9).equals("P")){
        if(s.substring(0,2).equals("12")){
            return s.substring(0,8);
        }
        else{
        String s1="";
        int n=Integer.parseInt(s.substring(0,2));
        n=n+12;
        s=n+s.substring(2,8);
        return s;
        }
    }
    if(s.substring(8,9).equals("A")){
        if(s.substring(0,2).equals("12")){
            return "00"+s.substring(2,8);
        }
    }
    return s.substring(0,8);
    }

}
