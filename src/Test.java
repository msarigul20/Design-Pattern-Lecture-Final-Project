import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
        //Test Patient Data
        Patients testPatient1 = new Patients("İsmail Sel", 24, "Manisa Merkez Arka Sokak No 25 Daire 5",
                HealthDepartment.getInstanceHealthDepartment().server.adapterAndroid =new
                        AdapterLibraryToAndroid("5074951858", "in Home",
                        "I am fine.", "Android",HealthDepartment.getInstanceHealthDepartment().server.getTime()));
        Patients testPatient2 = new Patients("Mustafa Sarıgül", 25, "9 Eylül Caddesi No:126 Daire: 12",
                HealthDepartment.getInstanceHealthDepartment().server.adapterAndroid =new
                        AdapterLibraryToAndroid("5434085002", "in Shopping Center",
                        "I am OK now.", "Android",HealthDepartment.getInstanceHealthDepartment().server.getTime()));
        Patients testPatient3 = new Patients("Mustafa Bozkurt", 61, "Balçova Sakarya Caddesi No:2 Daire: 4",
                HealthDepartment.getInstanceHealthDepartment().server.adapterIos =new
                        AdapterLibraryToIOS("5498001005", "in Factory",
                        "I have a little fewer.", "Ios",HealthDepartment.getInstanceHealthDepartment().server.getTime()));
        HealthDepartment.getInstanceHealthDepartment().server.aggregate.add(testPatient1);
        HealthDepartment.getInstanceHealthDepartment().server.aggregate.add(testPatient2);
        HealthDepartment.getInstanceHealthDepartment().server.aggregate.add(testPatient3);
        */
        //Call all program
        //Used recursive call to fix wrong input in main menu with out data lost.
        MainMenuProgram();

    }//Close brackets of main of test class.
    // All program code.
    public static void MainMenuProgram(){
        Scanner scan = new Scanner(System.in);
        try{
            for (;;){
                //Main Menu
                System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
                System.out.println("Hello Welcome Virus Tracking App");
                System.out.println("Press 1 to display all patients: ");
                System.out.println("Press 2 to add new patient into patient list: ");
                System.out.println("Press 3 to learn count of patients: ");
                System.out.println("Press 4 to update your condition and location info: ");
                System.out.println("Press 5 to server query age(25-60) - addresses - count: ");
                System.out.println("Press 6 to patient query location - condition info - last update time: ");
                System.out.println("Press 99 to quit the program: ");
                System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
                int input = scan.nextInt();
                switch (input){
                    case 1:
                        //Print all data
                        HealthDepartment.getInstanceHealthDepartment().server.printPatientList();
                        //If list is empty.
                        if(HealthDepartment.getInstanceHealthDepartment().server.aggregate.getCount()==0){
                            System.out.println("There is no patient in server.");
                        }
                        break;
                    case 2:
                        //Add new patient
                        System.out.println("Please enter full name of patient: ");
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
                        //Device type selection
                        switch (tempMyDeviceType){
                            case 1:
                                Patients tempPatient = new Patients(tempName, tempAge, tempAddress,
                                        HealthDepartment.getInstanceHealthDepartment().server.adapterAndroid=new
                                                AdapterLibraryToAndroid(tempPhoneNumber, tempLocation,
                                                tempCondition, "Android",
                                                HealthDepartment.getInstanceHealthDepartment().server.getTime()));
                                HealthDepartment.getInstanceHealthDepartment().server.aggregate.add(tempPatient);
                                System.out.println("SUCCESSFUL! Your patient added patient list.");
                                break;
                            case 2:
                                Patients tempPatient1 = new Patients(tempName, tempAge, tempAddress,
                                        HealthDepartment.getInstanceHealthDepartment().server.adapterIos=new
                                                AdapterLibraryToAndroid(tempPhoneNumber, tempLocation,
                                                tempCondition, "Ios",
                                                HealthDepartment.getInstanceHealthDepartment().server.getTime()));
                                HealthDepartment.getInstanceHealthDepartment().server.aggregate.add(tempPatient1);
                                System.out.println("SUCCESSFUL! Your patient added patient list.");
                                break;
                            default:
                                // Try Again chance for one times to select device type.
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
                                                    HealthDepartment.getInstanceHealthDepartment().server.adapterAndroid
                                                            =new AdapterLibraryToAndroid(tempPhoneNumber, tempLocation,
                                                            tempCondition, "Android",
                                                            HealthDepartment.getInstanceHealthDepartment().server.getTime()));

                                            HealthDepartment.getInstanceHealthDepartment().server.aggregate.add(tempPatient3);
                                            System.out.println("SUCCESSFUL! Your patient added patient list.");
                                        case 2:
                                            Patients tempPatient4 = new Patients(tempName, tempAge, tempAddress,
                                                    HealthDepartment.getInstanceHealthDepartment().server.adapterIos
                                                            =new AdapterLibraryToAndroid(tempPhoneNumber, tempLocation,
                                                            tempCondition, "Ios",
                                                            HealthDepartment.getInstanceHealthDepartment().server.getTime()));
                                            HealthDepartment.getInstanceHealthDepartment().server.aggregate.add(tempPatient4);
                                            System.out.println("SUCCESSFUL! Your patient added patient list.");
                                        default:
                                            //Lost last chance and directed main menu.
                                            System.err.println("You entered again wrongly. " +
                                                    "The program returned main menu by canceling addition operation!");
                                            break;
                                    }
                                }else{
                                    System.out.println("You directed the main menu!");
                                    break;
                                }
                        }
                    case 3:
                        //Print count of patients in patient list.
                        System.out.println("Patient Count: "+
                                HealthDepartment.getInstanceHealthDepartment().server.aggregate.getCount());
                        break;
                    case 4:
                        //Change the condition and location with current time(without user knowledge)
                        scan.nextLine();
                        System.out.println("Please enter your phone number to chane state: ");
                        String checkPhoneNumber= scan.nextLine();
                        //Flag is working for is there phone number in list.
                        boolean flagIsThere=true;
                        for (HealthDepartment.getInstanceHealthDepartment().server.iterator.First();
                             !HealthDepartment.getInstanceHealthDepartment().server.iterator.IsDone();
                             HealthDepartment.getInstanceHealthDepartment().server.iterator.Next()){

                            if (HealthDepartment.getInstanceHealthDepartment().server.iterator.CurrentItem().
                                    adapterPatternServerLibrary.receive(0).contains(checkPhoneNumber)){

                                System.out.println("Welcome "+HealthDepartment.getInstanceHealthDepartment()
                                        .server.iterator.CurrentItem().name);
                                System.out.println("Please enter your condition info: ");
                                String tempConditionInfo = scan.nextLine();
                                System.out.println("Please enter your location info: ");
                                String tempLocationInfo = scan.nextLine();
                                HealthDepartment.getInstanceHealthDepartment().server.iterator.CurrentItem().adapterPatternServerLibrary.
                                        send(tempLocationInfo, tempConditionInfo,
                                                HealthDepartment.getInstanceHealthDepartment().server.getTime());

                                System.out.println("Dear, "+HealthDepartment.getInstanceHealthDepartment().
                                        server.iterator.CurrentItem().name+" your condition and location info updated");
                                //If there is one patient, the flag will change
                                flagIsThere=false;
                            }
                        }
                        //Ignored the error message by changing flag.
                        if(flagIsThere){
                            System.err.println("Couldn't find patient who has the '"+checkPhoneNumber+
                                    "' phone number in patient list!");
                        }
                        break;
                    case 5:
                        //Query specific server queries without user selection chance.
                        //The serverQuery uses template pattern.
                        TemplateServerQuery templateServerQuery = new ServerQueries();
                        //Calling the template method.
                        templateServerQuery.doQuery();
                        break;
                    case 6:
                        //Query about patient and its disease by selecting from user.
                        //Queries are age(25-60), condition info and last update time.
                        //The patient query uses facade design pattern.
                        FacadePatientQueries facade = new FacadePatientQueries();
                        System.out.println("You can query patients location, condition info and last update time. ");
                        System.out.println("1 to query Location");
                        System.out.println("2 to query Condition Info");
                        System.out.println("3 to query Last Update Time");
                        System.out.println("Select your decision if you want,you can select multiple selection.");
                        System.out.println("For Example: '1' - '2' - '3' - '1,2' - '1,3' - '2,3' or '1,2,3' ");
                        System.out.println("Enter numbers of queries to apply query: ");
                        scan.nextLine();
                        String patientInput = scan.nextLine();
                        switch (patientInput){
                            //Selection of which you want to query location, condition or last update time.
                            //The Health Department Can select one or more with together.
                            case "1":
                                facade.applyQueryForLocation();
                                break;
                            case "2":
                                facade.applyQueryForConditionInfo();
                                break;
                            case "3":
                                facade.applyQueryForLastUpdateTime();
                                break;
                            case "1,2":
                                facade.applyQueryForLocation();
                                facade.applyQueryForConditionInfo();
                                break;
                            case "1,3":
                                facade.applyQueryForLocation();
                                facade.applyQueryForLastUpdateTime();
                                break;
                            case "2,3":
                                facade.applyQueryForConditionInfo();
                                facade.applyQueryForLastUpdateTime();
                                break;
                            case "1,2,3":
                                facade.applyQueryForLocation();
                                facade.applyQueryForConditionInfo();
                                facade.applyQueryForLastUpdateTime();
                                break;
                            //Default of patient query.
                            default:
                                System.err.println("You entered wrong selection.Please try again by looking example.");
                                break;
                        }
                        break;
                    case 99:
                        //To exit the program.
                        System.exit(0);
                    default:
                        //Default of main menu.
                        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                        System.out.println("You entered bad choice for menu selection!");
                        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                }
            }//Endless loop close brackets for main menu.
        }
        catch (InputMismatchException e){
            //Main menu catch block for wrong input such as string.
            System.err.println("Wrong input! Use only whole numbers to select from menu! ");
        }finally {
            //Directed the main menu.
            System.err.println("You will return the main menu to select again.");
            //Call again main menu recursively.
            MainMenuProgram();
        }
    }//Close bracket of MainMenuProgram
}//Close bracket of class Test
