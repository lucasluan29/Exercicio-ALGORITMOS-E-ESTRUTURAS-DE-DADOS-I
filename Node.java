public class Node {
    public Object item; // dado armazenado (generico)
    public Node next;   // referencia ao proximo no

    // TODO: crie um construtor Node(Object item) que inicializa this.item e coloca next = null
    public Node(Object item) {
        this.item = item;
        this.next = null;
    }

    // TODO: crie um segundo construtor Node(Object item, Node next) que permite ja encadear na criacao
    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}