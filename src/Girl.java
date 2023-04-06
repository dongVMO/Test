public class Girl extends Person {
    protected String name;
    protected int age;
    protected String sex;

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
