public class Queue {
    int count=0, maxsize=-1;  // nr of nodes in queue, if it will be 0 it will allways be full
    Element first, last;  // first and last node

    public Queue(int maxsize){
        this.maxsize=maxsize;  // sets the limit
        System.out.println("The maxsize was set to "+maxsize);
    }
    //constructor with no parameters
    public Queue(){    }

    public void push(Object o){
        //if its not full
        if (count<maxsize && maxsize!=-1)
        { insert(o);}
        else if (maxsize==-1){ insert(o);}
        else { System.out.println("Can't add element.");}
    }

    private void insert(Object o) {
        if(count==0) {    // if this is the first obj it will be initialized as beginning and end of the queue
            first =last= new Element(o); //assigns the result of the expression on the right to the variable on the left
            System.out.println("Element added: " + o);
            count++;
        }
        else {
            last.next = new Element(o);   // otherwise the obj will be linked to the previous one
            System.out.println("Element added: " + o);
            last=last.next;   // the added obj becomes the last
            count++;
        }
    }
    public Object pop(){
        if (count>0){  // if queue has at least 1 element
            Object forRemoving=this.first.object;  // stores the object
            first=first.next;  // assigning new begin point.
            count--;
            return forRemoving;
        }
        else{ return null;}  // if there is no element left.
    }
    public boolean isFull(){return count==maxsize && maxsize!=-1; } //boolean because it retuns
    public boolean isEmpty(){return count==0;}                      //only true and false outputs
}