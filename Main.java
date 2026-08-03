public class Main{
    public static void main(String [] args){
   BinaryNode n1=new BinaryNode();
   BinaryNode n2=new BinaryNode();
   BinaryNode n3=new BinaryNode();
  BinaryNode n4=new BinaryNode();
   BinaryNode n5=new BinaryNode();
   BinaryNode n6=new BinaryNode();
   BinaryNode n7=new BinaryNode();
   BinaryNode n8=new BinaryNode();
   BinaryNode n9=new BinaryNode();

   n1.value="N1";
    n2.value="N2";
     n3.value="N3";
      n4.value="N4";
       n5.value="N5";
        n6.value="N6";
         n7.value="N7";
          n8.value="N8";
           n9.value="N9";
           n1.left=n2;
           n1.right=n3;
           n2.left=n4;
           n2.right=n5;
           n3.left=n6;
           n3.right=n7;
           n4.left=n8;
           n4.right=n9;
           BinaryLL binaryTree=new BinaryLL();
          binaryTree.root=n1;
           binaryTree.PostOrder(binaryTree.root);
           


    }
}