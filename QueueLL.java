public class QueueLL{
    SLL queue;
     public QueueLL(){
        queue= new SLL();
     }
     //isEmpty
     public boolean isEmpty(){
        if(queue.head==null){
            return true;
        }
        else{
            return false;
        }
     }
     //Enque
     
   public void enque(int value){
    queue.insertion(value,queue.size);
   }
   public void deque(){
    if(isEmpty()){
        System.out.println("Empty!!");
    }
    else{
        queue.deletion(0);
    }
   }
   public void peek(){
    System.out.println("front element: "+ queue.head.data);
   }
   public void deleteAll(){
    queue.head=null;

   }

}
//Main
//  QueueLL queue =new QueueLL();
//     queue.enque(10);
//     queue.enque(20);
//     queue.enque(30);
//     queue.enque(40);
//     queue.enque(50);
//     System.out.println();
//     queue.peek();
//      System.out.println();
//     queue.deque();
//     queue.peek();