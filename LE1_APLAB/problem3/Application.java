public class Application {
    public static void main(String[] args) {
        Mother mother = new Mother();
        mother.show();

        Child child = new Child();
        child.show(); 

        Mother m1 = new Child();
        m1.show(); 
    }
}