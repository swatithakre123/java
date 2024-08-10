package String_1;

class MostReprateChar {
    public static void main(String[] args) {
        String str = " java is a language";
        int l= str.length();
        int i,j;

        int count = 0;
        for( i=0;i<l;i++)
        {
            char ch = str.charAt(i);

            for( j=i+1;j<l;j++)
            {
                char ch1 = str.charAt(j);

                if()
                {
                  count++;

                }
            }
        }
        System.out.println("the repeating word is "+" the repeatation no.is " +count);
    }
}
