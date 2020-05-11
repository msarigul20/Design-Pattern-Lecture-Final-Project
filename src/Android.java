class Android  {

    String phoneNumber;
    String location;
    String conditionInfo;
    String myDeviceType ;
    String lastUpdateTime ;

    public void set(String location,String conditionInfo,String lastUpdateTime) {
        this.location=location;
        this.conditionInfo=conditionInfo;
        this.lastUpdateTime=lastUpdateTime;
    }
    String get(){
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

//    public Android(String name, int age, String address, String phoneNumber, String location, String conditionInfo, String myDeviceType) {
//            super(name, age, address);
//
    public Android(String phoneNumber, String location, String conditionInfo, String myDeviceType,String lastUpdateTime) {

        this.phoneNumber = phoneNumber;
        this.location = location;
        this.conditionInfo = conditionInfo;
        this.myDeviceType = myDeviceType;
        this.lastUpdateTime=lastUpdateTime;
    }
}
