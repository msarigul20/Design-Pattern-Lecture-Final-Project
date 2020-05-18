//Template Design Pattern Model
//Concrete Query Class which implements the primitive operations.
public class serverQuery extends Query{

    @Override
    void ageQuery() {
        System.out.println("Patient Name - Age");
        for(HealthDepartment.getInstanceHealthDepartment().server.iterator.First();
            !HealthDepartment.getInstanceHealthDepartment().server.iterator.IsDone();
            HealthDepartment.getInstanceHealthDepartment().server.iterator.Next()) {

            if(HealthDepartment.getInstanceHealthDepartment().server.iterator.CurrentItem().age>=25
                    && HealthDepartment.getInstanceHealthDepartment().server.iterator.CurrentItem().age<=60){

                   System.out.println(HealthDepartment.getInstanceHealthDepartment().
                           server.iterator.CurrentItem().name+"  ---   " +
                           HealthDepartment.getInstanceHealthDepartment().server.iterator.CurrentItem().age);
            }
        }
      System.out.println("---------------------------------------------------");
    }

    @Override
    void addressQuery() {
        System.out.println("Patient Name - Address");
        for(HealthDepartment.getInstanceHealthDepartment().server.iterator.First();
            !HealthDepartment.getInstanceHealthDepartment().server.iterator.IsDone();
            HealthDepartment.getInstanceHealthDepartment().server.iterator.Next()) {

            System.out.println(HealthDepartment.getInstanceHealthDepartment().
                    server.iterator.CurrentItem().name+"  ---   "
                    +HealthDepartment.getInstanceHealthDepartment().server.iterator.CurrentItem().address);
        }
        System.out.println("---------------------------------------------------");
    }

    @Override
    void countQuery() {
        System.out.println("Count of patient list: "+HealthDepartment.getInstanceHealthDepartment().
                server.aggregate.getCount());
        System.out.println("---------------------------------------------------");
    }
}
