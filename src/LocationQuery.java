//Facade Design Pattern
//Concrete class implementing the interface(PatientQuery) in facade
// for taking location information.
public class LocationQuery implements PatientQuery {
    @Override
    public void applyQuery() {
        for(HealthDepartment.getInstanceHealthDepartment().server.iterator.First();
            !HealthDepartment.getInstanceHealthDepartment().server.iterator.IsDone();
            HealthDepartment.getInstanceHealthDepartment().server.iterator.Next()) {

            //Just location information coming with receive method and its choice parameter.
            System.out.println("Location"+ HealthDepartment.getInstanceHealthDepartment().
                    server.iterator.CurrentItem().serverLibrary.receive(1));
        }

    }
}
