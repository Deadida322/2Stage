import java.util.Comparator;

public class StudentCourseComparator implements Comparator<Student> {
    public int compare(Student a, Student b){
        if(a.course> b.course)
            return 1;
        else if(a.course < b.course)
            return -1;
        else
            return 0;
    }
}
