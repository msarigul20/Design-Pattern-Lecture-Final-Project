
public class Test {
    public static void main(String[] args) {
        Server s1 = new Server(12345);
        Server s2 = new Server(1);
        HealthDepartment healthDepartment = HealthDepartment.getInstanceHealthDepartment();

        System.out.println(healthDepartment.toString());
        HealthDepartment healthDepartment1 = HealthDepartment.getInstanceHealthDepartment();
        System.out.println(healthDepartment1.toString());
        System.out.println(healthDepartment1._name);


        System.out.println(s1.receive());
        System.out.println("/*/*/*/*/*/*/*/*/*/*/");
        s1.send("Ahmet", "I have a fewer");
        System.out.println(s1.receive());
        System.out.println("/*/*/*/*/*/*/*/*/*/*/");
    }
}