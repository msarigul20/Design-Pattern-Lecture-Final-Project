public class ConditionInfoQuery implements patientQuery {
    @Override
    public void applyQuery() {
        for (Patients p:HealthDepartment.getInstanceHealthDepartment().server.patientList
        ) {
            System.out.println("Condition Info: "+p.devicesLibrary.receive(2));
        }
    }
}
