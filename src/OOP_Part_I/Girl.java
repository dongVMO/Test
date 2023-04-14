package OOP_Part_I;

public class Girl extends Person {
    protected String name;
    protected int age;

    @Override
    public String name() {
        return name;
    }

    @Override
    public int age() {
        return age;
    }

    public String Sex() {
        return "Nữ";
    }
}
