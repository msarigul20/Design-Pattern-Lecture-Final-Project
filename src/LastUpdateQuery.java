public class LastUpdateQuery implements patientQuery {

    @Override
    public void applyQuery() {
        for (Patients p:HealthDepartment.getInstanceHealthDepartment().server.patientList
        ) {
            System.out.println("Last Update Time "+p.devicesLibrary.receive(3));
        }
    }
}
