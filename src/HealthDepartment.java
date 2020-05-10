public class HealthDepartment {
    String name;
    Server server ;

    private HealthDepartment(String name, Server server) {
        this.name = name;
        this.server= server;
    }
    private static Server s1 = Server.getInstanceServer();
    private static HealthDepartment uniqueHealthDepartment = new HealthDepartment("Health Department",s1);


    public static HealthDepartment getInstanceHealthDepartment(){
        return uniqueHealthDepartment;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
