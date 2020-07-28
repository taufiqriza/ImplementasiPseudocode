public class node{
    
    public node head = null;
    public node tail = null;

    private int data;
    private node next;

    public node(int d){
        this.data = d;
        this.next = null;
    }

    public node(int d,node nx){
        data = d;
        next = nx;
    }

    public void setAddAtLast(int d){
        node newnode = new node(d);

        if (head==null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    public void setAddAtFirst(int d){
        node newnode = new node(d);
        if (head==null) {
            head = newnode;
            tail = newnode;
        } else {
            node temp = head;

            head = newnode;

            head.next = temp;
        }
    }

    public int getdata(){ return data; }
    public node getnext(){ return next; }
    public void setdata(int d){ data = d;}
    public void setnext(node n ) {next = n;}
}

// public class node<T>{

//     private T data;
//     private node next;

//     public node(T d, node nx){
//         data = d;
//         next = nx;
//     }

//     public T getdata(){ return data; }
//     public node getnext(){ return next; }
//     public void setdata(T d){ data = d;}
//     public void setnext(node n ) {next = n;}    
// }

/*import java.util.*;

public class node<T>{

    private T data;
    private ArrayList<node> baru;

    public node(T d){
        data = d;
        baru = new ArrayList<node>();
    }

    public T getdata(){return data;}
    public void setdata(T d){data = d;}

    public node[] getbaru(){
        return baru.toArray(new node[0]);
    }

    public void setbaru(node[] d){
        for (int i; i < d; i++){
            baru.add(d[i]);
        }
    }
}*/