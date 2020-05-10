public class IOS {
    String name = "Mehmet";
    String myState= "I am okey";
    String myDeviceType = "IOS";
    public void write(String tempState) {
        System.out.println(
                "Set from IOS");
        this.myState=tempState;
    }
    String read(){
        String result = name +" 's state is  "+myState+" "+" Device Type : "+myDeviceType;
        return result;
    }
}
