public class Main{
    public static void main( String[] args ) {
        Queue queue1 = new Queue (5);
        queue1.push( 1 );
        queue1.push( 10 );
        queue1.push(  11);
        queue1.push( 100 );
        queue1.push( 101 );
        System.out.println("Is the queue empty? "+queue1.isEmpty()+
                ". Is it full? "+queue1.isFull());
        System.out.println("The removed element:"+queue1.pop()+" After removing. Is the queue empty? " +
                ""+queue1.isEmpty()+ ". Is it full? "+queue1.isFull());
//CREATING OF THE SECOND QUEUE
        Queue queue2 = new Queue (); //without limits of size (empty constructor)
        queue2.push( "I" );
        queue2.push( "II" );
        queue2.push( "III" );
        System.out.println("The removed element: "+queue2.pop());
        System.out.println("After removing. Is the queue is empty? "+queue2.isEmpty()+
                ". But is it full? "+queue2.isFull());
        // not empty and never full because we don't have a limit of size here
    }
}
