public class AdapterLibraryToAndroid extends Android implements DevicesLibrary {

    public AdapterLibraryToAndroid(String phoneNumber, String location, String conditionInfo, String myDeviceType,String lastUpdateTime) {
        super(phoneNumber, location, conditionInfo, myDeviceType,lastUpdateTime);
    }
    @Override
    public void send(String location,String condition,String lastUpdateTime) {
        set(location, condition,lastUpdateTime);
    }

    @Override
    public String receive(int choice) {

        String state = null;
        if(choice==0){
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
