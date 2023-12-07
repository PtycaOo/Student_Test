public class StudentBuilder {
    int id;
    public Student build(String name,int age){
        return new Student(id++,name,age);
    }
}
