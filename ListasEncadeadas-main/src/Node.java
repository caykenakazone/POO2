public class Node <T extends String>{
    private T dado;
    private Node next;

    public Node(T dado) {
        this.dado = dado;
        this.next = null;
    }


    //Getters e Setters


    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
