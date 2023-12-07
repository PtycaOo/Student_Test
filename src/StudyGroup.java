import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student> {
    private List<Student> studentList;

    public StudyGroup() {
        this.studentList = new ArrayList<>();
    }

    public boolean addStudent(Student student){
        studentList.add(student);
        return true;
    }

    public void sortByName(){
        Collections.sort(studentList);
    }

    public void sortByAge(){
        Collections.sort(studentList, new StudentComparatorByAge());
    }



    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(studentList);
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "studentList=" + studentList +
                '}';
    }


}
