package A;

@FunctionalInterface
Interface Fn{
   void Data();
   public void Document(){
    System.out.println(" The document were Checked");

}

 class FnInteface implements Fn {
    Fn imp =()-> System.out.println(" We are child");
    imp.Data();

}
