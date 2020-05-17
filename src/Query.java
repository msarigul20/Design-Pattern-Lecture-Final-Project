public abstract class Query {
abstract void ageQuery();
abstract void addressQuery();
abstract void countQuery();
public final void doQuery(){
    ageQuery();
    addressQuery();
    countQuery();
}
}


