//Concrete collection consists of Patients.
public class Patients {
    String name;
    int age;
    String address;
    ServerLibrary serverLibrary;

    public Patients(String name, int age, String address, ServerLibrary serverLibrary) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.serverLibrary = serverLibrary;

    }
    //Print Patient Information with device information.
    public void getPatientInfo(){
        System.out.println(
                "Patient Full Name: "+name+"\n"+
                        "Patient Age: "+age+"\n"+
                        "Patient Address: "+address+"\n"+
                        "Patient Devices Information: "+ serverLibrary.receive(0)
        );
    }
}
