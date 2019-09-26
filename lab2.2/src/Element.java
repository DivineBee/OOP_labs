public class Element{
    public Object object; //object - for any data we want to insert
    public Element next;  //connection with the next point.
    Element(Object object)
    {
        this.object=object;
        this.next=null;  //null because the last point in the queue is undefined
    }
}

