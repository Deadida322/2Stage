import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {
    public int compare(Student a, Student b){
        if(a.age> b.age)
            return 1;
        else if(a.age< b.age)
            return -1;
        else
            return 0;
    }
}

