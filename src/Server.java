import java.util.ArrayList;

public class Server {
    int ServerID;
    protected DevicesLibrary adapter;

    protected DevicesLibrary adapter1 = new AdapterLibraryToIOS();
    ArrayList<Patients> patientList = new ArrayList<Patients>();
//    Patients p1 = new Patients("MUSTAFA", 15, "9 eylül", adapter = new AdapterLibraryToAndroid(
//                "5434085002","in Izmir", "I have a little fewer.", "Android"));
//    Patients p2 = new Patients("Ismail", 31, "Manisa merkez", adapter = new AdapterLibraryToAndroid(
//            "1231223","in Manisa", "I have a FEWER.", "Android"));

    private Server(int serverID) {
        ServerID = serverID;
    }

    public static Server uniqueServer = new Server(1996);

    public static Server getInstanceServer(){
        return uniqueServer;
    }

    public int getServerID() {
        return ServerID;
    }
    public void setServerID(int serverID) {
        ServerID = serverID;
    }

    public void addPatient(String name, int age, String address,String phoneNumber, String location, String conditionInfo,String myDeviceType){
        Patients p = new Patients(name, age, address,
                new AdapterLibraryToAndroid(phoneNumber, location, conditionInfo, myDeviceType));
                //TODO android VE IOS kısmını ayırt etmek gerekiyor
        patientList.add(p);
    }
    public void printPatientList(){
        for (int i =0;i<patientList.size();i++){
            patientList.get(i).getPatientInfo();
        }
    }


}