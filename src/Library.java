public interface Library {
    void send(String state); //setter
    String receive(); //getter
}
class Android {
    String name = "Ahmet";
    String myState= "I am okey";
    public void set(String tempState) {
        System.out.println(
                "Set from Android");
        this.myState=tempState;
    }
    String get(){
        String result = name +" 's state is  "+myState;
        return result;
    }
}
class IOS {
    String name = "Mehmet";
    String myState= "I am okey";
    public void write(String tempState) {
        System.out.println(
                "Set from IOS");
        this.myState=tempState;
    }
    String read(){
        String result = name +" 's state is  "+myState;
        return result;
    }
}
//This is the "Adapter" class. ConnectorAdapterNAtoEUR.
//We need a connector so our device works.

class OSAdapterLibraryToIOS extends IOS implements Library {

    @Override
    public void send(String tempState1) {
        write(tempState1);
    }

    @Override
    public String receive() {
        String state = read();
        return state;
    }
}
class OSAdapterLibraryToAndroid extends Android implements Library {
    @Override
    public void send(String tempState2) {
        set(tempState2);
    }

    @Override
    public String receive() {
        String state = get();
        return state;
    }
}

