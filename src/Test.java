
public class Test {
    public static void main(String[] args) {
        //getting unique healthDepartment object
        HealthDepartment healthDepartment = HealthDepartment.getInstanceHealthDepartment();
        //addresses of healthDepartment object
        System.out.println(healthDepartment.toString());
        //user creating new object from our method
        HealthDepartment healthDepartment1 = HealthDepartment.getInstanceHealthDepartment();
        //addresses is not changing because of singleton pattern
        System.out.println(healthDepartment1.toString());
        //we can access the name of healthDepartment
        System.out.println(healthDepartment1.name);
        //we can access the serverID from getInstanceHealthDepartment by passing the server class
        System.out.println(healthDepartment.server.ServerID);
        //we can access and receive data from the Android and IOS classes using adapter pattern
        System.out.println("*********************************************");
        System.out.println(healthDepartment.server.receive());
        //we can access and send data from the Android and IOS classes using adapter pattern
        healthDepartment.server.send("Ahmet", "I have a fewer.");
        //After changing, again receiving data of devices IOS and Android.
        System.out.println("###############################################");
        System.out.println(healthDepartment.server.receive());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}