//Health department of country.
//Managing the program with exactly one health department.
//Used Singleton Pattern to avoid more health department.
public class HealthDepartment {
    String name;
    Server server ;
    // Private constructor to apply Singleton Pattern
    private HealthDepartment(String name, Server server) {
        this.name = name;
        this.server= server;
    }
    //Also, Server class has a Singleton Pattern.
    //Get the unique server
    private static Server s1 = Server.getInstanceServer();
    //The Health Department used lazy instantiation.
    private static HealthDepartment uniqueHealthDepartment = new HealthDepartment("Health Department",s1);
    public static HealthDepartment getInstanceHealthDepartment(){
        return uniqueHealthDepartment;
    }
    public String getName() {
        return name;
    }

}
