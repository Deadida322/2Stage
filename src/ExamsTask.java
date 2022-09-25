import java.util.ArrayList;

public class ExamsTask {
    static class Enrollee {
        private String name;
        private String surname;

        private ArrayList<Integer> marks;

        Enrollee(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public void registerForFaculty(Faculty faculty){
            faculty.addEnrollee(this);
        }

        public void addMark(int mark){
            marks.add(mark);
        }
        public void registrationToExam(Exam exam) {
            exam.addStudents(this);
        }

        public float getAverageMark(){
            int sum = 0;
            for (int el : marks){
                sum += el;
            }
            return (float) sum / marks.size();
        }
    }

    static class Faculty {
        private String name;
        private ArrayList <Enrollee> enrolleeList;
        private ArrayList <Enrollee> studentList;

        Faculty(String name) {
            this.name = name;
        }

        public void addEnrollee(Enrollee enrollee) {
           enrolleeList.add(enrollee);
        }

        public void addStudent(Enrollee enrollee) {
            studentList.add(enrollee);
        }
    }

    static class Teacher {
        private String name;
        private String patronymic;


        Teacher(String name, String patronymic) {
            this.name = name;
            this.patronymic = patronymic;
        }

        public void giveMark(Enrollee enrollee, int grade){
            enrollee.addMark(grade);
        }
    }

    static class Exam {
        String subjectName;
        ArrayList<Enrollee> enrolleeList;

        public Exam(String subjectName) {
            this.subjectName = subjectName;
        }

        public void addStudents(Enrollee enrollee) {
            enrolleeList.add(enrollee);
        }


    }
    public static boolean admissionToTheUniversity(Enrollee enrollee, Faculty faculty) {
        if (enrollee.getAverageMark() > 3) {
            faculty.addStudent(enrollee);
            return true;
        }
        else return false;
    }

    public static void main(){
        Faculty Fist = new Faculty("FIST");

        Enrollee David = new Enrollee("David", "Aliev");
        Enrollee Sasha = new Enrollee("Saha", "Izis");
        Enrollee Maxim = new Enrollee("Maxim", "Washhand");
        Enrollee Andrew = new Enrollee("Andrew", "Synthensizer");

        Teacher Lylova = new Teacher("Anna", "Vyacheslavovna");

        Exam Math = new Exam("Math");
        Exam English = new Exam("English");

        David.registerForFaculty(Fist);
        David.registrationToExam(Math);
        David.registrationToExam(English);

        Lylova.giveMark(David, 3);
        Lylova.giveMark(David, 3);

        admissionToTheUniversity(David, Fist);

    }
}
