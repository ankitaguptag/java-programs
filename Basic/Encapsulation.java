public class Encapsulation
 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmpId(101);
        e.setName("Ankita");
        System.out.println("Employee ID: " + e.getEmpId());
        System.out.println("Employee Name: " + e.getName());
    }
}
