package A;

 class ExepExe2 {
    public static void main(String[] args) {
      try{
        String name = null;
        System.out.println(name.length());
      }catch(NullPointerException e){
        e.printStackTrace();
      }
    }
}
