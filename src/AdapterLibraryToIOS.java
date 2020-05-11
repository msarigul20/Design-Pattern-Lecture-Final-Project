public class AdapterLibraryToIOS extends IOS implements DevicesLibrary {
    @Override
    public void send(String name,String state,String lastUpdateTime) {
        write(state);
    }

    @Override
    public String receive() {
        String state = read();
        return state;
    }
}
