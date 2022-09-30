import java.util.ArrayList;
import java.util.List;

public class Group {
    String name;
    ArrayList<Student> students;
    public Group(String name, ArrayList<Student> students){
        this.name = name;
        this.students = students;
    }

    public String toString() {
        System.out.println("Номер группы:" + this.name);
        for(Student st:students){
            System.out.println(st.toString());
        }
        return null;
    }

    private Float getAverageForStudent(List<Integer> evaluations){
        int summ = 0;
        for (int el : evaluations){
            summ += el;
        }
        return (float) summ / evaluations.size();
    }

    public void getAverageEvaluation(){
        int[] arr = {0, 0, 0, 0, 0};
        int studentsCount = 0;
        for (Student st : students){
            studentsCount += 1;
            for (int i = 0; i < st.evaluations.size(); i++){
                arr[i] += st.evaluations.get(i);
            }
        }

        System.out.println("Результат группы " + this.name);
        for (int i = 0; i < arr.length; i++){
            System.out.println("Предмет #" + String.valueOf(i + 1) + " = " + String.valueOf((float)arr[i]/(float)studentsCount));
        }
    }

    public Student getBestStudent(){
        Student currentBestStudent = students.get(0);
        for (Student st : students){
            if(getAverageForStudent(st.evaluations) > getAverageForStudent(currentBestStudent.evaluations))
                currentBestStudent = st;
        }
        return currentBestStudent;
    }


}
