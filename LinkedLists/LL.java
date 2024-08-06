

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

}
