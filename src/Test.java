
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Test Data
         Patients testPatient1 = new Patients("İsmail", 24, "Manisa Merkez Arka Sokak No 25 Daire 5",
                HealthDepartment.getInstanceHealthDepartment().server.adapterAndroid =new
                        AdapterLibraryToAndroid("5074951858", "in Home",
                        "I am fine.", "Android",HealthDepartment.getInstanceHealthDepartment().server.getTime()));
        Patients testPatient2 = new Patients("Mustafa", 25, "9 Eylül Caddesi No:126 Daire: 12",
                HealthDepartment.getInstanceHealthDepartment().server.adapterAndroid =new
                        AdapterLibraryToAndroid("55434085002", "in Shop",
                        "I am OK now.", "Android",HealthDepartment.getInstanceHealthDepartment().server.getTime()));
        Patients testPatient3 = new Patients("Emir", 61, "Balçova Sakarya Caddesi No:2 Daire: 4",
                HealthDepartment.getInstanceHealthDepartment().server.adapterIos =new
                        AdapterLibraryToIOS("5498001005", "in Factory",
                        "I have a little fewer.", "Ios",HealthDepartment.getInstanceHealthDepartment().server.getTime()));
        HealthDepartment.getInstanceHealthDepartment().server.patientList.add(testPatient1);
        HealthDepartment.getInstanceHealthDepartment().server.patientList.add(testPatient2);
        HealthDepartment.getInstanceHealthDepartment().server.patientList.add(testPatient3);

       try{
            for (;;){
                System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
                System.out.println("Hello Welcome Virus Tracking App");
                System.out.println("Press 1 to display all patients: ");
                System.out.println("Press 2 to add new patient into patient list: ");
                System.out.println("Press 3 to learn count of patients: ");
                System.out.println("Press 4 to update your condition and location info: ");
                System.out.println("Press 5 to server query age(25-60) - addresses - count: ");
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
                        scan.nextLine();
                        String tempName = scan.nextLine();
                        System.out.println("Please enter age of patient: ");
                        int tempAge = scan.nextInt();
                        scan.nextLine(); // to fixed common scanner problem about empty line.
                        System.out.println("Please enter address of patient: ");
                        String tempAddress = scan.nextLine();
                        System.out.println("Please enter phone number of patient: ");
                        String tempPhoneNumber = scan.nextLine();
                        System.out.println("Please enter location of patient: ");
                        String tempLocation = scan.nextLine();
                        System.out.println("Please enter condition info of patient: ");
                        String tempCondition = scan.nextLine();
                        System.out.println("Select your device type 'Android' or 'Ios'");
                        System.out.println("Enter '1' to select 'Android'");
                        System.out.println("Enter '2' to select 'Ios'");
                        int tempMyDeviceType = scan.nextInt();
                        switch (tempMyDeviceType){
                            case 1:
                                Patients tempPatient = new Patients(tempName, tempAge, tempAddress,
                                        HealthDepartment.getInstanceHealthDepartment().server.adapterAndroid=new
                                                AdapterLibraryToAndroid(tempPhoneNumber, tempLocation,
                                                tempCondition, "Android",HealthDepartment.getInstanceHealthDepartment().server.getTime()));
                                HealthDepartment.getInstanceHealthDepartment().server.patientList.add(tempPatient);
                                System.out.println("SUCCESSFUL! Your patient added patient list.");
                                break;
                            case 2:
                                Patients tempPatient1 = new Patients(tempName, tempAge, tempAddress,
                                        HealthDepartment.getInstanceHealthDepartment().server.adapterIos=new
                                                AdapterLibraryToAndroid(tempPhoneNumber, tempLocation,
                                                tempCondition, "Ios",HealthDepartment.getInstanceHealthDepartment().server.getTime()));
                                HealthDepartment.getInstanceHealthDepartment().server.patientList.add(tempPatient1);
                                System.out.println("SUCCESSFUL! Your patient added patient list.");
                                break;
                            default:
                                System.err.println("You entered wrong device type !");
                                System.out.println("Try again by entering '0' or ");
                                System.out.println("cancel the adding patient by entering '99'.");
                                System.out.println("What is your choice: ");
                                int inputDevice = scan.nextInt();
                                if (inputDevice==0){
                                    System.out.println("Select your device type 'Android' or 'Ios'");
                                    System.out.println("Enter '1' to select 'Android'");
                                    System.out.println("Enter '2' to select 'Ios'");
                                    int tempMyDeviceTypeAgain = scan.nextInt();
                                    switch (tempMyDeviceTypeAgain){
                                        case 1:
                                            Patients tempPatient3 = new Patients(tempName, tempAge, tempAddress,
                                                    HealthDepartment.getInstanceHealthDepartment().server.adapterAndroid=new
                                                            AdapterLibraryToAndroid(tempPhoneNumber, tempLocation,
                                                            tempCondition, "Android",HealthDepartment.getInstanceHealthDepartment().server.getTime()));
                                            HealthDepartment.getInstanceHealthDepartment().server.patientList.add(tempPatient3);
                                            System.out.println("SUCCESSFUL! Your patient added patient list.");
                                        case 2:
                                            Patients tempPatient4 = new Patients(tempName, tempAge, tempAddress,
                                                    HealthDepartment.getInstanceHealthDepartment().server.adapterIos=new
                                                            AdapterLibraryToAndroid(tempPhoneNumber, tempLocation,
                                                            tempCondition, "Ios",HealthDepartment.getInstanceHealthDepartment().server.getTime()));
                                            HealthDepartment.getInstanceHealthDepartment().server.patientList.add(tempPatient4);
                                            System.out.println("SUCCESSFUL! Your patient added patient list.");
                                        default:
                                            System.err.println("You entered again wrongly. The program returned main menu by canceling addition operation!");
                                            break;
                                    }
                                }else{
                                    System.out.println("You directed the main menu!");
                                    break;
                                }
                        }
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
                                        send(tempLocationInfo, tempConditionInfo,HealthDepartment.getInstanceHealthDepartment().server.getTime());
                                System.out.println("Dear, "+HealthDepartment.getInstanceHealthDepartment().
                                        server.patientList.get(i).name+" your condition and location info updated");
                            }
                        }
                        break;
                    case 5:
                        Query query = new serverQuery();
                        query.doQuery();
                    case 99:
                        System.exit(0);
                    default:
                        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                        System.out.println("You entered bad choice for menu selection!");
                        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

                }
            }
        }catch (InputMismatchException e){
            System.err.println("Wrong input! Use only whole numbers to select from menu! ");
        }finally {
            System.err.println("You will return the main menu to select again.");
            main(args);
        }




    }
}