public class AdapterLibraryToIOS extends IOS implements DevicesLibrary {
    public AdapterLibraryToIOS(String phoneNumber, String location, String conditionInfo, String myDeviceType,String lastUpdateTime) {
        super(phoneNumber, location, conditionInfo, myDeviceType,lastUpdateTime);
    }

    @Override
    public void send(String location,String condition,String lastUpdateTime) {

        write(location, condition,lastUpdateTime);
    }

    @Override
    public String receive() {
        String state = read();
        return state;
    }
}
