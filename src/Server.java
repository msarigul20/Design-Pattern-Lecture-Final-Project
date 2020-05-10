import java.util.ArrayList;

public class Server {
    int ServerID;

    ArrayList<Patients> patientsList = new ArrayList<>();

    public void addPatient(String name, String State){
        Patients p = new Patients(name, State);
        patientsList.add(p);
    }
    public void printPatients(){
       for(int i = 0;i<patientsList.size();i++){
           System.out.println("Patient Name : "+patientsList.get(i).name);
           System.out.println("Patient State : "+patientsList.get(i).state);
       }
    }

    public Server(int serverID) {
        ServerID = serverID;
    }

    public int getServerID() {
        return ServerID;
    }

    public void setServerID(int serverID) {
        ServerID = serverID;
    }


}
