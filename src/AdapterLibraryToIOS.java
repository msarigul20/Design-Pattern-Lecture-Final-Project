

public class AdapterLibraryToIOS extends IOS implements DevicesLibrary {
    public AdapterLibraryToIOS(String phoneNumber, String location, String conditionInfo, String myDeviceType,String lastUpdateTime) {
        super(phoneNumber, location, conditionInfo, myDeviceType,lastUpdateTime);
    }
    @Override
    public void send(String location,String condition,String lastUpdateTime) {

        write(location, condition,lastUpdateTime);
    }

    @Override
    public String receive(int choice) {

       String state = null;
        if(choice==0){
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

//    @Override
//    public String receive() {
//        String state = read();
//        System.out.println(this.location);
//        return state;
//    }


}
