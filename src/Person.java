public class Person {
    public static String person = "PERSON";

    private String name;
    private int age;

    // в несериализуемом классе обязательно должен быть публичный конструктор без параметров!
    // (можно его не писать, если нет других конструкторов, так как он присутствует неявно)
    public Person() {
        this.age = 5;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
