public class Method_Parameter {
    public static void main(String[] args) {
    sayHello("Iqbal","Firmansyah");
    sayHello("Budi", "Nugraha");
    sayHello("Joko", "Widodo");
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
