public class Server implements DevicesLibrary {
    int ServerID;
    protected DevicesLibrary adapter = new AdapterLibraryToAndroid();
    protected DevicesLibrary adapter1 = new AdapterLibraryToIOS();

    private Server(int serverID) {
        ServerID = serverID;
    }

    public static Server uniqueServer = new Server(1996);

    public static Server getInstanceServer(){
        return uniqueServer;
    }

    public int getServerID() {
        return ServerID;
    }
    public void setServerID(int serverID) {
        ServerID = serverID;
    }

    @Override
    public void send(String name,String state) {//android
        if(adapter.receive().contains(name)){
            adapter.send(name, state);
        }
        if(adapter1.receive().contains(name)){ //ıos part
            adapter1.send(name, state);
        }
    }

    @Override
    public String receive() {
        String info ;
        info = adapter.receive()+"\n"+adapter1.receive();
        return info;
    }
}