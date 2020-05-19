//Template Design Pattern Model
//Abstract Class
public abstract class TemplateServerQuery {
abstract void ageQuery();
abstract void addressQuery();
abstract void countQuery();
//Template Method
public final void doQuery(){
    //Primitive operations which will be overridden by the subclasses.
    //When call the template method,the method will work one by one with order.
    ageQuery();
    addressQuery();
    countQuery();
}
}

//Concrete Query Class which implements the primitive operations.
class ServerQueries extends TemplateServerQuery {

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



