import java.io.Serializable;

public class Student extends Person implements Serializable {
    // static и transient поля не сериализуются
    public static String student = "STUDENT";

    private String faculty;
    private String login;
    private transient String password;

    public Student() {
        super("", 1);
        this.faculty = "math";
        this.login = "masha";
        this.password = "qwerty";

        System.out.println("constructor student");
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return super.toString() + Student.student + " Student{" +
                "faculty='" + faculty + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
