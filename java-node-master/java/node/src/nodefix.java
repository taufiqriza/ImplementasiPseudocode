
public class nodefix {
    public nodefix head = null;
    public nodefix tail = null;

    public int data;
    public nodefix next;

    public nodefix
        (int d){
        this.data = d;
        this.next = null;
    }

    public void addfirst(int haris){
        nodefix newnode = new nodefix(haris);

        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            nodefix isisementara = head;

            head = newnode;

            head.next = isisementara;
        }
    }

    public void addlast(int rizki){
        nodefix newnode = new nodefix(rizki);

        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    public void delete(int pos){
        if (pos == 0) {
            head = head.getnext();
            return;
        }

        nodefix current = head;
        int count = 0;
        while (count < pos-1) {
            current = current.getnext();
            if (current == null){
                throw new IndexOutOfBoundsException("fixing");
            }
            count++;
        }
        if (current.getnext()==null) {
            throw new IndexOutOfBoundsException("fixing");  
        } 
        current.setnext(current.getnext().getnext());
    }

    public nodefix(){
        this.getClass();
    }

    public String txt(){
        String output ="";
        nodefix current = head;
        while (current != null) {
            output += current.getdata()+",";
            current = current.getnext();
        }

        return output;
    }

    public int getdata(){return data;}
    public nodefix getnext(){return next;}

    public void setdata(int d){data = d;}
    public void setnext(nodefix nx){next = nx;}
    
    public static void main(String[] args) {
        nodefix nb = new nodefix();
        nb.addfirst(6);
        nb.addfirst(1);
        nb.addfirst(5);
        nb.addfirst(3);
        nb.addlast(10);
        nb.addlast(15);

        System.out.println(nb.txt());

        nb.delete(3);
        System.out.println(nb.txt());
    }
}