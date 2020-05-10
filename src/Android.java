class Android  {
    String phoneNumber;
    String location;
    String conditionInfo;
    String myDeviceType ;

    public void set(String location,String conditionInfo) {
        this.location=location;
        this.conditionInfo=conditionInfo;
    }
    String get(){
        String result =
                         "\n"+
                        " > Patient Phone Number: "+phoneNumber+"\n"+
                        " > Patient Location: "+location+"\n"+
                        " > Patient Condition Info: "+conditionInfo+"\n"+
                         " > Patient Device Type: "+myDeviceType+"\n"
                ;
        return result;
    }

//    public Android(String name, int age, String address, String phoneNumber, String location, String conditionInfo, String myDeviceType) {
//            super(name, age, address);
//
    public Android(String phoneNumber, String location, String conditionInfo, String myDeviceType) {

        this.phoneNumber = phoneNumber;
        this.location = location;
        this.conditionInfo = conditionInfo;
        this.myDeviceType = myDeviceType;
    }
}
