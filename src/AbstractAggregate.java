import java.util.ArrayList;
//ITERATOR DESIGN PATTERN
//Abstract aggregate class for Iterator Design Pattern.
interface AbstractAggregate {
    public AbstractIterator CreateIterator();
    public void add(Patients patients) ;
    public int getCount();
    public Patients get(int idx);
}

//Abstract Iterator class.
interface  AbstractIterator {
    void First();
    void Next();
    Boolean IsDone () ;
    Patients CurrentItem() ;
}

//Concrete Aggregate class.
class Collection implements AbstractAggregate {
    private ArrayList<Patients> _patients = new ArrayList<Patients>();
    public	CollectionIterator CreateIterator() {
        return new CollectionIterator(this);
    }
    public int getCount () {return _patients.size(); }
    public void add(Patients p) {_patients.add(p);}
    public Patients get(int index) { return _patients.get(index);}
}

//Concrete Iterator class for collection
class CollectionIterator implements AbstractIterator {
    public void First() {_current = 0;}
    public void Next()  {_current++; }
    public Patients CurrentItem() { return (IsDone()?null:_collection.get(_current)); }
    public Boolean IsDone() {	return _current >= _collection.getCount(); }
    public CollectionIterator(Collection collection) {
        _collection = collection;
        _current = 0;
    }
    private Collection _collection;
    private int _current;
}

//Concrete collection consists of Patients.
class Patients {
    String name;
    int age;
    String address;
    AdapterPatternServerLibrary adapterPatternServerLibrary;

    public Patients(String name, int age, String address, AdapterPatternServerLibrary adapterPatternServerLibrary) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.adapterPatternServerLibrary = adapterPatternServerLibrary;

    }
    //Print Patient Information with device information.
    public void getPatientInfo(){
        System.out.println(
                "Patient Full Name: "+name+"\n"+
                        "Patient Age: "+age+"\n"+
                        "Patient Address: "+address+"\n"+
                        "Patient Devices Information: "+ adapterPatternServerLibrary.receive(0)
        );
    }
}
