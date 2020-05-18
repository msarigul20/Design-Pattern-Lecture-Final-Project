//Server Library to make a connection with Android and IOS devices.
//Adapters(LibraryToAndroid and LibraryToIOS) are using this interface.
//Same target class for Android and IOS adaptors.
interface ServerLibrary {
    void send(String location,String condition,String lastUpdateTime); //setter
    String receive(int choice); //getter


}
