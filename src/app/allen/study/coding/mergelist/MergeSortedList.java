package app.allen.study.coding.mergelist;

import java.util.Scanner;

public class MergeSortedList{
    Node head;
    public void addToTheLast(Node node){
        if(head == null){
            head = node;
        }else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.println("Node.data: "+temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            MergeSortedList list1 = new MergeSortedList();
            MergeSortedList list2 = new MergeSortedList();
            int a1 = sc.nextInt();
            Node node1 = new Node(a1);
            list1.addToTheLast(node1);
            for(int i =1;i<n1;i++){
                int a = sc.nextInt();
                list1.addToTheLast(new Node(a));
            }
            int b1 = sc.nextInt();
            Node node2 = new Node(b1);
            list2.addToTheLast(node2);
            for(int j =1;j<n2;j++){
                int a = sc.nextInt();
                list2.addToTheLast(new Node(a));
            }
            list1.head = new LinkedList().sortedMerge(list1.head, list2.head);
            list1.printList();
            t--;
        }
    }
}