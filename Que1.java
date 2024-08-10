
class Que2{
    public static void main(String[] args) {
        String str=" This is Exercise 1";
        String str1 = " This is Exercise 2";
        int s = str.compareTo(str1);

        if(s==1)
        {
            System.out.println(" String "+str + "is greater than " + str1);
        
        }

        else {
         if(s==0)

            System.out.println("Strings are equal");
            else{
                System.out.println(" String "+ str + " is less than "+str1);
            }
        }
    }
}

