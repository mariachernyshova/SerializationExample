import java.io.*;

public class SerializeExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student();
        System.out.println("до сериализации: " + student);

        FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);

        fileOutputStream.close();
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("test.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student studentAfterSerialize = (Student) objectInputStream.readObject();
        System.out.println("после десериализации: " + studentAfterSerialize);
    }
}
