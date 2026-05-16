public class Queuearr{
    int arr[];
    int front;
    int rear;
    //Creation
   public  Queuearr(int size){
    arr= new int[size];
    front=rear=-1;
   }
   //isFull
   public boolean isFull(){
    if(front==arr.length-1){
        return true;
    }
    else{
        return false;
    }
   }
   //isEmpty
   public boolean isEmpty(){
    if(rear==-1||rear==arr.length){
        return true;
    }
    else{
        return false;
    }
   }
   //enque(insert)
   public void enque(int value){
    if(isFull()){
        
        System.out.println("FULL!");
    }
    else if(isEmpty()){
        front=0;
        rear++;
        arr[rear]=value;
        System.out.println("Inserted successfully");
    }
    else{
          rear++;
        arr[rear]=value;
        System.out.println("Inserted successfully"); 
    }
   }
   public void deque(){
     if(isEmpty()){
       
        System.out.println("Empty!!");
    }
    else{
        int result=arr[front];
        front++;
        System.out.println("Deleted "+result+" successfully");
    }

}
public void peek(){
     System.out.println("the front value is"+arr[front]);
}
public void deleteAll(){
    arr=null;
}
}
//MAIN 
//    Queuearr queue=new Queuearr(5);
//     queue.enque(10);
//     queue.enque(20);
//     queue.enque(30);
//     queue.enque(40);
//     queue.enque(50);
//     System.out.println();
//     queue.peek();
//     queue.deque();
//     System.out.println();
//     queue.peek();
