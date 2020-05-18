//Facade Design Pattern
//Concrete class implementing the interface(PatientQuery) in facade
// for taking condition information.
public class ConditionInfoQuery implements PatientQuery {
    @Override
    public void applyQuery() {
        for(HealthDepartment.getInstanceHealthDepartment().server.iterator.First();
            !HealthDepartment.getInstanceHealthDepartment().server.iterator.IsDone();
            HealthDepartment.getInstanceHealthDepartment().server.iterator.Next()) {

            //Just last condition information coming with receive method and its choice parameter.
            System.out.println("Condition Info: "+ HealthDepartment.getInstanceHealthDepartment().
                    server.iterator.CurrentItem().serverLibrary.receive(2));
        }
    }
}
