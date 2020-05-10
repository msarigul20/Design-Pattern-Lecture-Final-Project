import com.sun.org.apache.xpath.internal.operations.And;

public class Patients {
    String name;
    String state;


    public Patients(String name, String state) {
        this.name = name;
        this.state = state;
    }

    public String getPatient() {
        String infoPatient = "Patient Name : "+name+". Patient State is "+state;
        return infoPatient;
    }

    public void setPatient(String name,String state) {
        this.name = name;
        this.state=state;
    }

}
