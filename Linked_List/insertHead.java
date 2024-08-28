// package Linked_List;
// /**
//  * Linkedlistclass
//  */

// class SLL{
//     public Node head;
//     public Node tail;

//     void addTail(int data){
//         Node temp=new Node(data);
//         if(head==null && tail ==null)
//             head=tail=temp;
        
//         else{
//             tail.next=temp;
//             tail=temp;
//         }
//     }
//     public void print(){
//         Node t=head;
//         while (t !=null) {
//             System.out.println(t.data);
//             t=t.next; 
//         }
//     }
// }


// public class insertHead {

//     public static void main(String[] args) {
//         SLL list=new SLL();
//         list.addTail(10);
//         list.addTail(22);
//         list.addTail(33);
//         list.addTail(44);
//         list.addTail(55);
//         list.addTail(66);

//         list.print();

//     }
// }