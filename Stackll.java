public class Stackll{
    SLL stack;
    Stackll(){
        stack= new SLL();
    }
    public void push(int value){
        stack.insertion(value,0);
        System.out.println();
         System.out.println("pushed "+value);
    }
    public void pop(){
        if(isEmpty()){
             System.out.println("empty"); 
        }
         System.out.println(stack.head.data);
        stack.deletion(0);
    
    }
    public boolean isEmpty(){
        if(stack.head==null){
            return true;
        }
else{
    return false;
}
    }
    public void deleteStack(){
        stack.head=null;
          System.out.println("done");
    }
     public void peek(){
        if(isEmpty()){
             System.out.println("empty"); 
        }
           System.out.println(stack.head.data);
     }
}
//    Stackll stack=new Stackll();
//    stack.push(10);
//     stack.push(20);
//      stack.push(30);
//      stack.peek();
//      stack.pop();
//       stack.peek();
//      stack.deleteStack();