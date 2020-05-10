class Android {
    String name = "Ahmet";
    String myState= "I am okey";
    String myDeviceType = "Android";
    public void set(String tempState) {
        this.myState=tempState;
    }
    String get(){
        String result = name +" 's state is  "+myState+" " +" Device Type : "+myDeviceType;
        return result;
    }
}
