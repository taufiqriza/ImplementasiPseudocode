public class linklist {

    public static void main(String[] args) {
        linklist ll = new linklist();
        
        ll.insert(0, 3);
        ll.insert(0, 2);
        System.out.println(ll.find(1));

        ll.insert(0, 1);
        ll.insert(0, 0);
        System.out.println(ll.txt());
        System.out.println(ll.head.getnext().getdata());
    }

    private node head;
    public linklist(){
        head = null;
    }

    public int find(int n){
        node current = head;
        int count = 0;
        while (count < n) {
            current = current.getnext();
            if (current == null) {
                throw new IndexOutOfBoundsException("cann't find");
            }
            count++;
        }
        return current.getdata();
    }

    public void insert(int pos, int val){
        node  = new node(val, null);

        if (pos == 0) {
            newnode.setnext(head);
            head = newnode;
            return;
        }

        node current = head;
        int count = 0;
        while (count < pos-1) {
            current = current.getnext();
            if (current == null) {
                throw new IndexOutOfBoundsException("can't find");
            }
            count++;
        }

        newnode.setnext(current.getnext());
        current.setnext(newnode);
    }

    public void delete(int pos){
        if (pos == 0 ) {
            head = head.getnext();
            return;
        }

        node current = head;
        int count = 0;
        while (count < pos-1) {
            current = current.getnext();
            if (current==null) {
                throw new IndexOutOfBoundsException("can't find");
            }
            count++;
        }

        if (current.getnext()==null) {
            throw new IndexOutOfBoundsException("can't find");
        }

        current.setnext(current.getnext().getnext());
    }

    public String txt(){
        String output ="";
        linklast current = head;
        while (current!=null) {
            output += current.getdata()+",";
            current = current.getnext();
        }

        return output;
    }
}