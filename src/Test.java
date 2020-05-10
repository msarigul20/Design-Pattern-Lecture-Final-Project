public class Test {
    static public void main(String[]args){
        System.out.println("heloo");
        Server s1 = new Server(123);
        HealtDepartment H1 = new HealtDepartment("Turkey",s1);
        s1.addPatient("Mustafa", "Its Okey");
        s1.printPatients();
        Library adapter =new OSAdapterLibraryToAndroid();
        System.out.println(adapter.receive());
    }
}
