public class SLL{
   public  Node head;
   public Node tail;
   public int size;

   public Node createSll(int value){
    Node node=new Node();
    head= new Node();
    node.next=null;
    node.data=value;
    head=node;
    tail=node;
    size=1;
    return head;

   }

    public void insertion(int value,int location){
        Node node=new Node();
        node.data=value;
        if(head==null){
            createSll(value);
            return;
        }
        else if (location==0){
        node.next=head;
        head=node;
        size++;
    }
    else if(location>=size){
        node.next=null;
        tail.next=node;
        tail=node;
        size++;

    }
    else{
        Node tempNode=head;
        int i=0;
        while(i<location-1){
            tempNode=tempNode.next;
            i++;
        }
        Node nextNode= tempNode.next;
        tempNode.next=node;
        node.next=nextNode;
        size++;
        }

}

public boolean searchNode(int value){
    if(head!=null){
        Node tempNode=head;
        int i=0;
        while(i<size){
            if(tempNode.data==value){
                   System.out.println("Found!!!");
                return true;
            }
            tempNode=tempNode.next;
            i++;
        }

    }
    System.out.println("not found");
    return false;

}
public void traversal(){
    Node tempNode=head;
    if(head==null){
        System.out.println("Empty");
        return;
    }
    for(int i=0;i<size;i++){
        System.out.println(tempNode.data);
        if(i!=size-1){
            System.out.print("->");
        }
        tempNode=tempNode.next;
    }
}

public void deletion(int location){
     if(head==null){
        System.out.println("Empty");
        return;
    }
    else if(location==0){
    
        head=head.next;
        size--;
        if(size==0){
            tail=null;

        }
    }
    else if(location>=size){
       Node tempNode=head;
       int i=0;
       while(i<size-2){
        tempNode=tempNode.next;
        i++;
       }
      
        
       if(tempNode==head){
        head=tail=null;
        size--;
        return;
       }
       tempNode.next=null;
       tail=tempNode;
       size--;
    }
    else{
        Node tempNode=head;
        int i=0;
        while(i<location-1){
            tempNode=tempNode.next;
            i++;

        }
        tempNode.next=tempNode.next.next;
        size--;
    }
}
public void deleteALL(){
    head=null;
    tail=null;
    size=0;
}
}