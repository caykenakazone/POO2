
public class CircularList<T extends String>{
    private Node head;
    private Node tail;
    private int size;

    public CircularList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(T t) {
        Node newNode = new Node(t);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.setNext(head);  // ajusta a referência do último elemento para apontar para o primeiro
        } else {
            tail.setNext(newNode); // ajusta a referência do último elemento para apontar para o novo elemento
            tail = newNode;
            tail.setNext(head); // ajusta a referência do último elemento para apontar para o primeiro
        }
        size++;
    }

    //Métodos
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            head = head.getNext();
            size--;
            return;
        }
        Node previous = null;
        Node current = head;
        int i = 0;
        while (i < index) {
            previous = current;
            current = current.getNext();
            i++;
        }
        previous.setNext(current.getNext());
        size--;
    }

    public void print(){
        Node current = head;
        if (head == null) {
            System.out.println("Lista vazia");
            return;
        }
        do {
            System.out.print(current.getDado() + " ");
            current = current.getNext();
        } while (current != head);
        System.out.println();
    }
}
