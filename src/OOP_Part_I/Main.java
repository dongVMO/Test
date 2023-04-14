package OOP_Part_I;

public class Main {
    public static void main(String[] args) {
        Anna anna = new Anna();
        System.out.println("Anna: " + anna.name + ", " + anna.age + ", " + anna.Sex());
        Emma emma = new Emma();
        System.out.println("Emma: " + emma.name + ", " + emma.age + ", " + emma.Sex());
        Jack jack = new Jack();
        System.out.println("Jack: " + jack.name + ", " + jack.age + ", " + jack.Sex());
        Duo duo = new Duo();
        System.out.println("Duo: " + duo.name + ", " + duo.age + ", " + duo.Sex());
    }
}