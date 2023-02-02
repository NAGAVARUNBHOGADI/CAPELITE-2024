class Result {
    public static String pangrams(String s) {
    // Write your code here
    String s1=s.toUpperCase();
    s1=s1.replaceAll("\\s","");
    char[] ch=s1.toCharArray(); 
    HashSet<Character>hs=new HashSet<>();
    for(char i:ch){
        hs.add(i);
    }
    if(hs.size()==26){
        return "pangram";
    }
    return "not pangram";
    
    }

}
