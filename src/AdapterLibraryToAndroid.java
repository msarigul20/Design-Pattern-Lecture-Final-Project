public class AdapterLibraryToAndroid extends Android implements DevicesLibrary {
    public AdapterLibraryToAndroid(String phoneNumber, String location, String conditionInfo, String myDeviceType,String lastUpdateTime) {
        super(phoneNumber, location, conditionInfo, myDeviceType,lastUpdateTime);
    }


    @Override
    public void send(String location,String condition,String lastUpdateTime) {

        set(location, condition,lastUpdateTime);
    }

    @Override
    public String receive() {
        String state = get();
        return state;
    }
}
