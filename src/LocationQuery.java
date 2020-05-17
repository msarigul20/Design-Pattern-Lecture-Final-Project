public class LocationQuery implements patientQuery {
    @Override
    public void applyQuery() {
        for (Patients p:HealthDepartment.getInstanceHealthDepartment().server.patientList
             ) {
            System.out.println("Location"+p.devicesLibrary.receive(1));
        }
    }
}
