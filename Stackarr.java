// Creation of stack using array
public  class Stackarr{
    int []arr;
    int top;
       // Create stack(we are using constructor)
    public Stackarr(int size){
        this.arr=new int[size];
        this.top=-1;
    }
 //to check whether the stack is empty or not?
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }else{
            return false;
        }
        
    }
     //to check whether the stack is empty or not?
    public boolean isFull(){
        if(top==arr.length-1){
            return true;
        }else{
            return false;
        }
        
    }

    //To push elements to the stack
public void push(int element){
    //check isFull
if(isFull()){
    System.out.println("Stack overflow");
    return;
}
else{
    arr[top+1]=element;
    top++;
    System.out.println("element pushed successfully");
}
}
//to pop elements
public void pop(){
    //check isFull
if(isEmpty()){
    System.out.println("Stack underflow");
    return;
}

   int element= arr[top];
    top--;
    System.out.println(element+" popped successfully");

}

//to display
public void peek(){
    System.out.println("the top element is "+arr[top]);
 
}
public void deleteStack(){
    arr=null;
    System.out.println("Stack is deleted succesfully");
}

}

// class Main{
//     public static void main(String[] args){
//     Stackarr stack=new Stackarr(5);
//     stack.push(10);
//      stack.push(20);
// stack.push(30);
// stack.push(40);
// stack.push(50);
// stack.peek();
// System.out.println();
// stack.pop();
// stack.peek();

// }
// }