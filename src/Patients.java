public class Patients {
    String name;
    int age;
    String address;
    DevicesLibrary devicesLibrary;


    public Patients(String name, int age, String address, DevicesLibrary devicesLibrary) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.devicesLibrary = devicesLibrary;

    }
    public void getPatientInfo(){
        System.out.println(
                "Patient Name: "+name+"\n"+
                        "Patient Age: "+age+"\n"+
                        "Patient Address: "+address+"\n"+
                        "Patient Devices Information: "+devicesLibrary.receive(0)


                );
    }

}
