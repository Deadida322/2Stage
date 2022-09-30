import java.util.Comparator;

public class StudentGroupComparator implements Comparator<Student> {
    public int compare(Student a, Student b){
        if(a.groupNumber> b.groupNumber)
            return 1;
        else if(a.groupNumber < b.groupNumber)
            return -1;
        else
            return 0;
    }
}
