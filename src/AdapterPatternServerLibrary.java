//ADAPTER DESIGN PATTERN
//Server Library to make a connection with Android and IOS devices.
//Adapters(LibraryToAndroid and LibraryToIOS) are using this interface.
//Same target class for Android and IOS adaptors.
interface AdapterPatternServerLibrary {
    void send(String location,String condition,String lastUpdateTime); //setter
    String receive(int choice); //getter

}

//Adapter class ServerLibrary to Android.
//Create connection between ServerLibrary and Android.
//Used Class Adapter
class AdapterLibraryToAndroid extends Android implements AdapterPatternServerLibrary {

    public AdapterLibraryToAndroid(String phoneNumber, String location, String conditionInfo,
                                   String myDeviceType, String lastUpdateTime) {
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

//Adapter class ServerLibrary to IOS.
//Create connection between ServerLibrary and IOS.
class AdapterLibraryToIOS extends IOS implements AdapterPatternServerLibrary {

    public AdapterLibraryToIOS(String phoneNumber, String location, String conditionInfo,
                               String myDeviceType, String lastUpdateTime) {
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

//Symbolised IOS devices and their information.
//IOS subclassed by AdapterLibraryToIOS.
//Adaptee class for AdapterLibraryToIOS
class IOS {
    String phoneNumber;
    String location;
    String conditionInfo;
    String myDeviceType ;
    String lastUpdateTime ;
    //IOS devices has own communication method to write data to the ServerLibrary.
    public void write(String location,String conditionInfo,String lastUpdateTime) {
        this.location=location;
        this.conditionInfo=conditionInfo;
        this.lastUpdateTime=lastUpdateTime;
    }
    //IOS devices has own communication method to read data from the ServerLibrary.
    String read(){
        String result =
                "\n"+
                        " > Patient Phone Number: "+phoneNumber+"\n"+
                        " > Patient Location: "+location+"\n"+
                        " > Patient Condition Info: "+conditionInfo+"\n"+
                        " > Patient Device Type: "+myDeviceType+"\n"+
                        " > Patient Last Update Time: "+lastUpdateTime+"\n"
                ;
        return result;
    }
    public IOS(String phoneNumber, String location, String conditionInfo,
               String myDeviceType,String lastUpdateTime) {

        this.phoneNumber = phoneNumber;
        this.location = location;
        this.conditionInfo = conditionInfo;
        this.myDeviceType = myDeviceType;
        this.lastUpdateTime=lastUpdateTime;
    }
}

//Symbolised Android devices and their information.
//Android subclassed by AdapterLibraryToAndroid.
//Adaptee class for AdapterLibraryToAndroid
class Android  {
    String phoneNumber;
    String location;
    String conditionInfo;
    String myDeviceType ;
    String lastUpdateTime ;
    //Android devices has own communication method to set data to the ServerLibrary.
    public void set(String location,String conditionInfo,String lastUpdateTime) {
        this.location=location;
        this.conditionInfo=conditionInfo;
        this.lastUpdateTime=lastUpdateTime;
    }
    //Android devices has own communication method to get data to the ServerLibrary.
    String get(){
        String result =
                "\n"+
                        " > Patient Phone Number: "+phoneNumber+"\n"+
                        " > Patient Location: "+location+"\n"+
                        " > Patient Condition Info: "+conditionInfo+"\n"+
                        " > Patient Device Type: "+myDeviceType+"\n"+
                        " > Patient Last Update Time: "+lastUpdateTime+"\n"
                ;
        return result;
    }

    public Android(String phoneNumber, String location, String conditionInfo,
                   String myDeviceType,String lastUpdateTime) {

        this.phoneNumber = phoneNumber;
        this.location = location;
        this.conditionInfo = conditionInfo;
        this.myDeviceType = myDeviceType;
        this.lastUpdateTime=lastUpdateTime;
    }
}





