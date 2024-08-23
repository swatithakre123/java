class staticKey {
    static String institute = "info beans";
    int id ;
    String name;
    staticKey (String name,int id)
    {
        this.name = name;
        this.id = id;
    }
    void show()
    {
        System.out.println(name);
        System.out.println(id);
        System.out.println(institute);
    }
    public static void main(String[] args) {
        staticKey s = new staticKey("swati", 1230);
        
        staticKey.institute = "info beans Foundation";
        s.show();
    }
    
}
