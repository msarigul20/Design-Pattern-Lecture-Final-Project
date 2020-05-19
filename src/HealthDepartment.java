//Health department of country.
//Managing the program with exactly one health department.
//Used Singleton Pattern to avoid more health department.
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HealthDepartment {
    private String name;
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
//Server of Health Department.
//Managing the program with exactly one server which belongs to one health department.
//Used Singleton Pattern to avoid more server.
///*/*/*/*/*/*/*/*/*/*/*///
//Can show little part of Iterator Design Pattern and Adapter Design Pattern in this class.
class Server {
    private int ServerID;
    //Adaptors of ServerLibrary.
    protected AdapterPatternServerLibrary adapterAndroid;
    protected AdapterPatternServerLibrary adapterIos ;
    //Created aggregate from Collection to benefit Iterator Design Pattern
    AbstractAggregate aggregate = new Collection();
    //Created iterator for Iterator Design Pattern
    AbstractIterator iterator = aggregate.CreateIterator();
    // Private constructor to apply Singleton Pattern
    private Server(int serverID) {
        ServerID = serverID;
    }
    //The Server used lazy instantiation.
    public static Server uniqueServer = new Server(2020);
    public static Server getInstanceServer(){
        return uniqueServer;
    }

    //to get currently time with milliseconds to check runtime.
    public String getTime(){
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.SSS");
        LocalDateTime myObj = LocalDateTime.now();
        //checking time is working when project finished,it can be delete.(For developers)
        //System.out.println(myObj.format(myFormatObj));
        return myObj.format(myFormatObj).toString();
    }
    public int getServerID() {
        return ServerID;
    }

    //Print Patients from aggregate with all their data.
    static void printAggregate(AbstractIterator i) {
        System.out.println("Iterating over patients collection:");
        //Using Iterator Class which belongs to Iterator Design Pattern.
        for(i.First();  !i.IsDone(); i.Next()) {
            i.CurrentItem().getPatientInfo();
        }
        System.out.println("********************************");
    }
    //Traverse the Aggregate
    public void printPatientList(){
        printAggregate(iterator);
    }
}
