import java.util.*;

public class CollectionBlockTask {
    ArrayList<Group> groupList = new ArrayList<Group>();
    ArrayList<Student> studentList = new ArrayList<Student>(List.of(
            new Student(
                    "Алиев",
                    "Давид",
                    "Мурадович",
                    20,
                    3,
                    2,
                    new ArrayList<Integer>(List.of(5, 4, 5, 5, 5))
            ),
            new Student(
                    "Изис",
                    "Александр",
                    "Валерьевич",
                    21,
                    3,
                    1,
                    new ArrayList<Integer>(List.of(2, 4, 5, 4, 3))
            ),
            new Student(
                    "Макушкин",
                    "Андрей",
                    "Сергеевич",
                    21,
                    3,
                    1,
                    new ArrayList<Integer>(List.of(3, 4, 4, 4, 3))
            ),
            new Student(
                    "Семёнов",
                    "Виктор",
                    "Павлович",
                    16,
                    4,
                    5,
                    new ArrayList<Integer>(List.of(3, 4, 4, 4, 4))
            ),
            new Student(
                    "Богатов",
                    "Ярослав",
                    "Ильич",
                    22,
                    3,
                    5,
                    new ArrayList<Integer>(List.of(5, 4, 5, 4, 5))
            ),
            new Student(
                    "Ильин",
                    "Ярослав",
                    "Ильич",
                    22,
                    2,
                    5,
                    new ArrayList<Integer>(List.of(5, 4, 5, 4, 5))
            ),
            new Student(
                    "Семёнов",
                    "Николай",
                    "Дмитриевич",
                    22,
                    2,
                    5,
                    new ArrayList<Integer>(List.of(5, 5, 5, 5, 5))
            ),
            new Student(
                    "Ильин",
                    "Владислав",
                    "Дмитриевич",
                    20,
                    2,
                    3,
                    new ArrayList<Integer>(List.of(2, 5, 5, 4, 5))
            )
        )
    );

    public void printList(){
        for(Student el: this.studentList){
            System.out.println(el.toString());
        }
    }
    public void sortUsers(){
        Comparator<Student> cmprtr = new StudentAgeComparator().thenComparing(new StudentNameComporator());
        this.studentList.sort(cmprtr);
    }

    public void getAverageScore(){
        Comparator<Student> cmprtr = new StudentCourseComparator().thenComparing(new StudentGroupComparator());
        this.studentList.sort(cmprtr);
        Student firstStudent = studentList.get(0);
        String currentGroup = String.valueOf(firstStudent.course) + String.valueOf(firstStudent.groupNumber);
        ArrayList<Student> currentStudents = new ArrayList<Student>();

        for (Student st : studentList){
            String group = String.valueOf(st.course) + String.valueOf(st.groupNumber);
            if (group.equals(currentGroup)){
                currentStudents.add(st);
            } else{
                groupList.add(new Group(currentGroup, currentStudents));
                currentGroup = group;
                currentStudents = new ArrayList<Student>(List.of(st));
            }
        }

        for (Group gr: groupList){
            gr.getAverageEvaluation();
        }
    }

    public void printGroups() {
        for (Group gr: groupList){
            gr.toString();
        }
    }

    public void printOldest() {
        Student oldest = studentList.get(0);
        for (Student st : studentList){
            if (st.age > oldest.age){
                oldest = st;
            }
        }
        System.out.println("Самый немолодой студент");
        System.out.println(oldest.toString());
    }
    public void printYoungest() {
        Student youngest = studentList.get(0);
        for (Student st : studentList){
            if (st.age < youngest.age){
                youngest = st;
            }
        }
        System.out.println("Самый молодой студент");
        System.out.println(youngest.toString());
    }

    public void printBest() {
        for (Group gr : groupList){
            System.out.println("Лучший в группе " + gr.name + gr.getBestStudent().toString());
        }
    }
}
