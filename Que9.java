 class Que9 {
    public static void main(String[] args) {
        String str= "The quick brown fox jumps over the lazy dog";
        String s[]= str.split(" ");
        for(int i=0;i<s.length;i++)
        {
            if(s[i].equalsIgnoreCase("fox"))
            {
                s[i]="cat";
            }
             String newstr= "";
             newstr += newstr + s[i]+" ";

             System.out.print(newstr);

        }
    }
}
