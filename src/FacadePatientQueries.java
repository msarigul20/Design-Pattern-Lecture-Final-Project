public class FacadePatientQueries {
    private patientQuery location;
    private patientQuery condition;
    private patientQuery lastUpdate;

    public FacadePatientQueries(){
        location = new LocationQuery();
        condition = new ConditionInfoQuery();
        lastUpdate = new LastUpdateQuery();
    }
    public void queryLocation(){
        location.applyQuery();
    }
    public void queryConditionInfo(){
        condition.applyQuery();
    }
    public void queryLastUpdateTime(){
        lastUpdate.applyQuery();
    }

}
