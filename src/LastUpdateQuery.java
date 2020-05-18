//Facade Design Pattern
//Concrete class implementing the interface(PatientQuery) in facade
// for taking last update time information.
public class LastUpdateQuery implements PatientQuery {
    @Override
    public void applyQuery() {
        for(HealthDepartment.getInstanceHealthDepartment().server.iterator.First();
            !HealthDepartment.getInstanceHealthDepartment().server.iterator.IsDone();
            HealthDepartment.getInstanceHealthDepartment().server.iterator.Next()) {

            //Just last update time information coming with receive method and its choice parameter.
            System.out.println("Last Update Time: "+ HealthDepartment.getInstanceHealthDepartment().
                    server.iterator.CurrentItem().serverLibrary.receive(3));
        }
    }
}
