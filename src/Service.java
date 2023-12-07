public class Service {
    private StudyGroup group;
    private StudentBuilder builder;

    public Service() {
        group = new StudyGroup();
        builder = new StudentBuilder();
    }

    public void addStudent(String name, int age){
        Student student = builder.build(name,age);
        group.addStudent(student);
    }

    public String getAllStudentInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Данные группы:\n");
        for (Student student: group) {
            stringBuilder.append(student);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void sortByName(){
        group.sortByName();
    }

    public void sortByAge(){
        group.sortByAge();
    }
}
