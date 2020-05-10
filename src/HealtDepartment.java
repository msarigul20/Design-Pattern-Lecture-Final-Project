public class HealtDepartment {
    String name;
    Server _server;

    public HealtDepartment(String name, Server _server) {
        this.name = name;
        this._server = _server;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
