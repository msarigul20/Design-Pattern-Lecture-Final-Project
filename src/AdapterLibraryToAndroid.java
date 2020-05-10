public class AdapterLibraryToAndroid extends Android implements DevicesLibrary {
    @Override
    public void send(String name,String tempState2) {
        set(tempState2);
    }

    @Override
    public String receive() {
        String state = get();
        return state;
    }
}
