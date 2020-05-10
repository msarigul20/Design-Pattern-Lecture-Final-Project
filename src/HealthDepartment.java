public class HealthDepartment {
    String _name;
    Server _server ;

    private HealthDepartment(String name, Server server) {
        this._name = name;
        this._server= server;
    }

    private static HealthDepartment uniqueHealthDepartment = new HealthDepartment("Health Department",new Server(12345));


    public static HealthDepartment getInstanceHealthDepartment(){
        return uniqueHealthDepartment;
    }
    public String getName() {
        return _name;
    }
    public void setName(String name) {
        this._name = name;
    }
}
