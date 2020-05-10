import javax.xml.ws.Holder;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Test Data
        Patients testPatient1 = new Patients("İsmail", 23, "Manisa Merkez Arka Sokak No 25 Daire 5",
                HealthDepartment.getInstanceHealthDepartment().server.adapter=new
                        AdapterLibraryToAndroid("5074951858", "in Home",
                        "I am fine.", "Android"));
        Patients testPatient2 = new Patients("Mustafa", 25, "9 Eylül Caddesi No:126 Daire: 12",
                HealthDepartment.getInstanceHealthDepartment().server.adapter=new
                        AdapterLibraryToAndroid("55434085002", "in Shop",
                        "I am OK now.", "Android"));
        Patients testPatient3 = new Patients("Emir", 31, "Balçova Sakarya Caddesi No:2 Daire: 4",
                HealthDepartment.getInstanceHealthDepartment().server.adapter=new
                        AdapterLibraryToAndroid("5498001005", "in Factory",
                        "I have a little fewer.", "Android"));
        HealthDepartment.getInstanceHealthDepartment().server.patientList.add(testPatient1);
        HealthDepartment.getInstanceHealthDepartment().server.patientList.add(testPatient2);
        HealthDepartment.getInstanceHealthDepartment().server.patientList.add(testPatient3);


       for (;;){
           System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
           System.out.println("Hello Welcome Virus Tracking App");
           System.out.println("Press 1 to display all patients: ");
           System.out.println("Press 2 to add new patient into patient list: ");
           System.out.println("Press 3 to learn count of patients: ");
           System.out.println("Press 4 to update your condition and location info: ");
           System.out.println("Press 99 to quit the program: ");
           System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
           int input = scan.nextInt();
           switch (input){
               case 1:
                   HealthDepartment.getInstanceHealthDepartment().server.printPatientList();
                   if(HealthDepartment.getInstanceHealthDepartment().server.patientList.size()==0){
                       System.out.println("There is no patient in server.");
                   }
                   break;
               case 2:
                   System.out.println("Please enter name of patient: ");
                   String tempName = scan.next();
                   System.out.println("Please enter age of patient: ");
                   int tempAge = scan.nextInt();
                   scan.nextLine();
                   System.out.println("Please enter address of patient: ");
                   String tempAddress = scan.nextLine();
                   System.out.println("Please enter phone number of patient: ");
                   String tempPhoneNumber = scan.nextLine();
                   System.out.println("Please enter location of patient: ");
                   String tempLocation = scan.nextLine();
                   System.out.println("Please enter condition info of patient: ");
                   String tempCondition = scan.nextLine();
                   System.out.println("Please enter device type of phone: ");
                   String tempMyDeviceType = scan.nextLine();
                   Patients tempPatient = new Patients(tempName, tempAge, tempAddress,
                           HealthDepartment.getInstanceHealthDepartment().server.adapter=new
                                   AdapterLibraryToAndroid(tempPhoneNumber, tempLocation,
                                   tempCondition, tempMyDeviceType));
                   HealthDepartment.getInstanceHealthDepartment().server.patientList.add(tempPatient);
                   System.out.println("SUCCESSFUL! Your patient added patient list.");

               case 3:
                   System.out.println("Patient Count: "+HealthDepartment.getInstanceHealthDepartment().server.patientList.size());
                   break;
               case 4:
                   scan.nextLine();
                   System.out.println("Please enter your phone number to chane state: ");
                   String checkPhoneNumber= scan.nextLine();
                   for (int i = 0;i<HealthDepartment.getInstanceHealthDepartment().server.patientList.size();i++){
                       if (HealthDepartment.getInstanceHealthDepartment().server.patientList.
                               get(i).devicesLibrary.receive().contains(checkPhoneNumber)){
                           System.out.println("Welcome "+HealthDepartment.getInstanceHealthDepartment()
                                   .server.patientList.get(i).name);
                           System.out.println("Please enter your condition info: ");
                           String tempConditionInfo = scan.nextLine();
                           System.out.println("Please enter your location info: ");
                           String tempLocationInfo = scan.nextLine();
                           HealthDepartment.getInstanceHealthDepartment().server.patientList.get(i).devicesLibrary.
                                   send(tempLocationInfo, tempConditionInfo);
                           System.out.println("Dear, "+HealthDepartment.getInstanceHealthDepartment().
                                   server.patientList.get(i).name+" your condition and location info updated");
                       }
                   }
                   break;

               case 99:
                   System.exit(0);
               default:
                   System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                   System.out.println("You entered bad choice for menu selection!");
                   System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

           }
       }



      /*
       HealthDepartment healthDepartment = HealthDepartment.getInstanceHealthDepartment();
        System.out.println(healthDepartment.server.ServerID);
        System.out.println("*********************************************");
        healthDepartment.server.p1.getPatientInfo();
        healthDepartment.server.p2.getPatientInfo();
        System.out.println("*********************************************");
        healthDepartment.server.p1.devicesLibrary.send("EVE GELDIM", "TAS GIBIYIM");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        healthDepartment.server.p1.getPatientInfo();
//        String input;
//        input=scan.nextLine();
//        if (healthDepartment.server.p2.devicesLibrary.receive().contains(input)){
//            healthDepartment.server.p2.devicesLibrary.send("gezıom oluuum", "coronayım");}
//        else{
//            System.out.println("You entered wrong phone number.");
//        }
        System.out.println("-----------------------------------------------------------------------------");
        healthDepartment.server.p2.getPatientInfo();
        System.out.println("?????????????????????????????????????????????????????????????????????????????????????");
        healthDepartment.server.addPatient("emir", 35, "yeni evde", "1234567", "Balçova", "Sağ ayağı uyuştu", "Android");
        System.out.println(HealthDepartment.getInstanceHealthDepartment().server.patientList.size());
        */
    }
}