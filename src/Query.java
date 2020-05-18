//Template Design Pattern Model
//Abstract Class
public abstract class Query {
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


