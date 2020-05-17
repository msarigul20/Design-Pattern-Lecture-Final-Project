public class serverQuery extends Query{

    @Override
    void ageQuery() {
        System.out.println("Patient Name - Age");
        for (Patients p: HealthDepartment.getInstanceHealthDepartment().server.patientList
             ) {
            if(p.age>=25 && p.age<=60){
                System.out.println(p.name+"  ---   "+p.age);
            }
        }
        System.out.println("---------------------------------------------------");
    }

    @Override
    void addressQuery() {
        System.out.println("Patient Name - Address");
        for (Patients p: HealthDepartment.getInstanceHealthDepartment().server.patientList
        ) {
            System.out.println(p.name+"  ---   "+p.address);
        }
        System.out.println("---------------------------------------------------");

    }

    @Override
    void countQuery() {
        System.out.println("Patient List Count: "+HealthDepartment.getInstanceHealthDepartment().server.patientList.size());
        System.out.println("---------------------------------------------------");

    }


}
