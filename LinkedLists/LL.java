import java.lang.classfile.components.ClassPrinter.ListNode;

public class LL {
  
    private Node head;
    private Node tail;
    private int size;
    
    public LL(){
        this.size = 0;
    }
    
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        
        if(tail == null){
            tail = head;
            
        }
        
        size += 1;
    }
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
            
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        
        size += 1;
    }
    
    public void insert(int val,int index){
        if(index == 0){
            insertFirst(val);
            return ;
        }
        if(index == size){
            insertLast(val);
            return ;
        }

        Node temp = head;
        int i = 1;
        while( i < index){
            temp = temp.next;
            i++;
            
        }
        Node newNode = new Node(val,temp.next);
        temp.next = newNode;

        size++;
        
    }

    // insert using recursion 
    public void insertRec(int val,int index){
        head = insertRec(val, index,head);
    }

    private Node insertRec(int val,int index,Node node){
        if (index == 0) {
            
            Node temp = new Node(val,node);
            size++;

            return temp;
        }

        node.next = insertRec(val, index--, node.next);

        return node;
    }

    public int deleteLast(){
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast  = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;

    }

    public int delete(int index){
        if (index == 0) {
            
            return deleteFirst();
        }

        if(index == size-1){
            return deleteLast();
        }

        Node prev = get(index - 1);

        int val = prev.next.value;
        prev.next = prev.next.next;

        size--;

        return val;
    }

    public Node find(int value){
        Node node = head;
        
        while(node != null){
            if (node.value == value) {
                return node;
            }

            node = node.next;
        }


        return null;
    }
    public Node get(int index){
        Node node = head;
        for(int i = 0;i<index;i++){
            node = node.next;
        }


        return node;
    }
    public int deleteFirst(){
        int deletedVal = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return deletedVal;
    


    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;


        }
        System.out.println("End");
    }



    private class Node {
        
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }

        
    }



    //questions


    public void duplicates(){
        Node node = head;

        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }
            else{
                node = node.next;
            }
        }

        tail = node;
        tail.next = null;
    }


    //merge
    public static LL merge(LL first, LL second){
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while(f != null && s != null){
            if(f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            }
            else{
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while( f != null){
            ans.insertLast(f.value);
            f = f.next;
        }

        while( s != null){
            ans.insertLast(s.value);
            s = s.next;
        }


        return ans;
    }

    // find length of the cycle

    // public int lengthCycle(){

    //    ListNode slow = head;
    //    ListNode fast = head;

    //     while(fast != null && fast.next != null){


    //         slow = slow.next;
    //         fast = fast.next.next;

    //         if(slow == fast){
    //             //calculate the length;

    //             ListNode temp = slow;
                
    //             int len = 0;

    //             do { 
    //                 temp = temp.next;
    //                 len++;
    //             } while (temp != slow);
    //             return len;

    //         }
    //     }

    //     return 0;

    // }

    
    public static void main(String[] args) {
        
        LL first = new LL();
        LL second = new LL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        LL ans = LL.merge(first, second);
        ans.display();

    }

}
