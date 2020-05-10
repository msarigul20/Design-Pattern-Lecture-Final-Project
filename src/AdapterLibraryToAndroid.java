public class AdapterLibraryToAndroid extends Android implements DevicesLibrary {
    public AdapterLibraryToAndroid(String phoneNumber, String location, String conditionInfo, String myDeviceType) {
        super(phoneNumber, location, conditionInfo, myDeviceType);
    }


    @Override
    public void send(String location,String condition) {

        set(location, condition);
    }

    @Override
    public String receive() {
        String state = get();
        return state;
    }
}
