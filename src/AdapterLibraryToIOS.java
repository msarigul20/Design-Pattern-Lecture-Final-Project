//Adapter class ServerLibrary to IOS.
//Create connection between ServerLibrary and IOS.
public class AdapterLibraryToIOS extends IOS implements ServerLibrary {

    public AdapterLibraryToIOS(String phoneNumber, String location, String conditionInfo,
                               String myDeviceType,String lastUpdateTime) {
        super(phoneNumber, location, conditionInfo, myDeviceType,lastUpdateTime);
    }
    //Created connection by overriding ServerLibrary and called IOS methods.
    @Override
    public void send(String location,String condition,String lastUpdateTime) {
        write(location, condition,lastUpdateTime);
    }
    //Created connection by overriding ServerLibrary and called IOS methods.
    @Override
    public String receive(int choice) {
       //Also Adaptors categorized taking information with choice parameter.
       String state = null;
        if(choice==0){
            //Read all data from IOS class.
           state = read();
       }
       if (choice==1){
           state= "Location: "+this.location;
       }
        if (choice==2){
            state= "Condition Info: "+this.conditionInfo;
        }
        if (choice==3){
            state= "Last Update Time: "+this.lastUpdateTime;
        }
        return state;
    }
}
