//Abstract aggregate class for Iterator Design Pattern.
interface AbstractAggregate {
    public AbstractIterator CreateIterator();
    public void add(Patients patients) ;
    public int getCount();
    public Patients get(int idx);
}
