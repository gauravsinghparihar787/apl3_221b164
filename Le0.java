public class Le0{
    int age;
    String name;
    void setName(String name){
        this.name=name;
    }
    void setAge(int age){
        this.age=age;
    }
    String getName()
    { return this.name;}
    
    int getAge(){
        return this.age;
    }
    public static void main(String[] args)
{
    Le0 m1= new Le0();
    m1.setName("Gaurav singh parihar");
    m1.setAge(20);
    System.out.println("my name is "+m1.getName() + " " + "i am "+m1.getAge() + "years old");
}
}

       