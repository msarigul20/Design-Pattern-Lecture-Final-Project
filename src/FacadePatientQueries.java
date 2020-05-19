//Facade Design Pattern
//Interface for the facade to use.
interface PatientQuery {
    void applyQuery();
}

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

//Facade Design Pattern
//Concrete class implementing the interface(PatientQuery) in facade
// for taking location information.
class LocationQuery implements PatientQuery {
    @Override
    public void applyQuery() {
        for(HealthDepartment.getInstanceHealthDepartment().server.iterator.First();
            !HealthDepartment.getInstanceHealthDepartment().server.iterator.IsDone();
            HealthDepartment.getInstanceHealthDepartment().server.iterator.Next()) {

            //Just location information coming with receive method and its choice parameter.
            System.out.println("Location"+ HealthDepartment.getInstanceHealthDepartment().
                    server.iterator.CurrentItem().adapterPatternServerLibrary.receive(1));
        }

    }
}

//Facade Design Pattern
//Concrete class implementing the interface(PatientQuery) in facade
// for taking condition information.
class ConditionInfoQuery implements PatientQuery {
    @Override
    public void applyQuery() {
        for(HealthDepartment.getInstanceHealthDepartment().server.iterator.First();
            !HealthDepartment.getInstanceHealthDepartment().server.iterator.IsDone();
            HealthDepartment.getInstanceHealthDepartment().server.iterator.Next()) {

            //Just last condition information coming with receive method and its choice parameter.
            System.out.println("Condition Info: "+ HealthDepartment.getInstanceHealthDepartment().
                    server.iterator.CurrentItem().adapterPatternServerLibrary.receive(2));
        }
    }
}

//Facade Design Pattern
//Concrete class implementing the interface(PatientQuery) in facade
// for taking last update time information.
class LastUpdateQuery implements PatientQuery {
    @Override
    public void applyQuery() {
        for(HealthDepartment.getInstanceHealthDepartment().server.iterator.First();
            !HealthDepartment.getInstanceHealthDepartment().server.iterator.IsDone();
            HealthDepartment.getInstanceHealthDepartment().server.iterator.Next()) {

            //Just last update time information coming with receive method and its choice parameter.
            System.out.println("Last Update Time: "+ HealthDepartment.getInstanceHealthDepartment().
                    server.iterator.CurrentItem().adapterPatternServerLibrary.receive(3));
        }
    }
}
