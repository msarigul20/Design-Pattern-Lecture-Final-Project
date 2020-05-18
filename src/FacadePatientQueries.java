//Facade Design Pattern
//Facade of patient query for user.
public class FacadePatientQueries {
    private PatientQuery location;
    private PatientQuery condition;
    private PatientQuery lastUpdate;

    public FacadePatientQueries(){
        location = new LocationQuery();
        condition = new ConditionInfoQuery();
        lastUpdate = new LastUpdateQuery();
    }
    public void applyQueryForLocation(){
        location.applyQuery();
    }
    public void applyQueryForConditionInfo(){
        condition.applyQuery();
    }
    public void applyQueryForLastUpdateTime(){
        lastUpdate.applyQuery();
    }

}
