//Concrete Aggregate class.
import java.util.ArrayList;

class Collection implements AbstractAggregate {
    private ArrayList<Patients> _patients = new ArrayList<Patients>();
    public	CollectionIterator CreateIterator() {
        return new CollectionIterator(this);
    }
    public int getCount () {return _patients.size(); }
    public void add(Patients p) {_patients.add(p);};
    public Patients get(int index) { return _patients.get(index);};
};