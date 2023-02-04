void decode(String s, Node root) {
         String s1="";
        Node temp=root;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                root=root.right;
                if(root.right==null && root.left==null){
                s1+=root.data;
                    root=temp;
                }
     
            }
                else if(s.charAt(i)=='0'){
                    root=root.left;
                    if(root.right==null && root.left==null){
                    s1+=root.data;
                        root=temp;
                    }
           
                }
    }
                System.out.println(s1);

    }
