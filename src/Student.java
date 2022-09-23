import java.util.List;

public class Student {
    String surname;
    String name;
    String patronymic;
    int age;
    List<Integer> evaluations;

    public Student(String surname, String name, String patronymic, int age, List<Integer> evaluations){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.age = age;
        this.evaluations = evaluations;
    }
}
