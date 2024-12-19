public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
    private int name;
    private int age;
    private int address;
    public App(int name, int age, int address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }

    public int getAddress() {
        return address;
    }

    public void setName(int name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + name + " Age: " + age + " Address: " + address);
    }

    public static void d(String[] args) {
        App obj = new App(1, 20, 123);
        obj.display();
    }
    
}
