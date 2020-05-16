public class IOS {
    String phoneNumber;
    String location;
    String conditionInfo;
    String myDeviceType ;
    String lastUpdateTime ;
    public void write(String location,String conditionInfo,String lastUpdateTime) {
        this.location=location;
        this.conditionInfo=conditionInfo;
        this.lastUpdateTime=lastUpdateTime;
    }
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
    public IOS(String phoneNumber, String location, String conditionInfo, String myDeviceType,String lastUpdateTime) {

        this.phoneNumber = phoneNumber;
        this.location = location;
        this.conditionInfo = conditionInfo;
        this.myDeviceType = myDeviceType;
        this.lastUpdateTime=lastUpdateTime;
    }

    public void  getLocation() {
        System.out.println(this.location);
    }
}
