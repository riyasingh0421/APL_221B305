public class Juet {
    private String name;
    private int age;
    public Juet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Juet() {}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 0) { // Ensuring age is non-negative
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    public static void main(String[] args) {
        Juet person = new Juet();
        person.setName("riya");
        person.setAge(20);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
