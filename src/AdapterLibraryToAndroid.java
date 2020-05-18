//Adapter class ServerLibrary to Android.
//Create connection between ServerLibrary and Android.
//Used Class Adapter
public class AdapterLibraryToAndroid extends Android implements ServerLibrary {

    public AdapterLibraryToAndroid(String phoneNumber, String location, String conditionInfo,
                                   String myDeviceType,String lastUpdateTime) {
        super(phoneNumber, location, conditionInfo, myDeviceType,lastUpdateTime);
    }
    //Created connection by overriding ServerLibrary and called Android methods.
    @Override
    public void send(String location,String condition,String lastUpdateTime) {
        set(location, condition,lastUpdateTime);
    }
    //Created connection by overriding ServerLibrary and called Android methods.
    @Override
    public String receive(int choice) {
        //Also Adaptors categorized taking information with choice parameter.
        String state = null;
        if(choice==0){
            //Get all data from Android class.
            state = get();
        }
        else if(choice==1){
            state= "Location: "+this.location;
        }
        else if (choice==2){
            state= "Condition Info: "+this.conditionInfo;
        }
        else if (choice==3){
            state= "Last Update Time: "+this.lastUpdateTime;
        }
        return state;
    }
}
