import java.util.List;

public class Student {
    String surname;
    String name;
    String patronymic;
    int age;
    List<Integer> evaluations;
    int course;
    int groupNumber;

    public Student(
            String surname,
            String name,
            String patronymic,
            int age, int course,
            int groupNumber,
            List<Integer> evaluations
    ){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.age = age;
        this.course = course;
        this.groupNumber = groupNumber;
        this.evaluations = evaluations;
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname + " " + this.patronymic + " " + this.age + " " + String.valueOf(this.course) + " " + this.groupNumber;
    }
}
