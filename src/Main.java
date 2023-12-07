public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        service.addStudent("Никита",18);
        service.addStudent("Гоша",24);
        service.addStudent("Даша",21);
        service.addStudent("Маша",11);


        System.out.println(service.getAllStudentInfo());
        service.sortByName();

        System.out.println(service.getAllStudentInfo());
        service.sortByAge();

        System.out.println(service.getAllStudentInfo());
    }
}