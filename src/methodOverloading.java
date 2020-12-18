public class methodOverloading {
    public static void main(String[] args) {


        sayHello();
        sayHello("iqbal");
        sayHello("iqbal", "firmansyah");
    }

    static void sayHello(){
        System.out.println("ini tanpa parameter");

    }

    static void sayHello(String name){
        System.out.println("Hello " + name);

    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
