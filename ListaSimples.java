public class ListaSimples {
    private Node head;

    public ListaSimples() {
        this.head = null;
    }

    /** Insere 'item' no INICIO da lista (O(1)). */
    public void insertFirst(Object item) {
        // TODO: crie um novo Node cujo 'next' aponta para o head atual
        Node novo = new Node(item, head); 
        
        // TODO: atualize head para apontar para o novo Node
        head = novo; 
    }

    /** Retorna a referencia do primeiro no que contem 'item', ou null se nao encontrar. */
    public Node find(Object item) {
        Node atual = head;
        // TODO: percorra a lista comparando atual.item com 'item'
        while (atual != null) {
            // Use equals() para comparar objetos!
            if (atual.item.equals(item)) {
                return atual; // Retorne 'atual' quando encontrar.
            }
            atual = atual.next;
        }
        // Se chegar ao fim (null), retorne null.
        return null;
    }

    /** Insere um novo no com 'item' APOS o no 'x'. */
    public void insertAfter(Node x, Object item) {
        if (x == null) return;
        
        // TODO 1: crie um novo Node com 'item'
        Node novo = new Node(item);
        
        // TODO 2: faca novo.next = x.next
        novo.next = x.next;
        
        // TODO 3: faca x.next = novo
        x.next = novo;
    }

    /** Percorre a lista e imprime todos os elementos. */
    public void imprimir() {
        Node atual = head;
        while (atual != null) {
            System.out.print(atual.item + " -> ");
            atual = atual.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        lista.insertFirst("C");
        lista.insertFirst("B");
        lista.insertFirst("A");
        lista.imprimir(); // A -> B -> C -> null
        
        Node noB = lista.find("B");
        if (noB != null) {
            lista.insertAfter(noB, "B2");
        }
        lista.imprimir(); // A -> B -> B2 -> C -> null
        
        Node noZ = lista.find("Z");
        System.out.println("Busca por Z: " + noZ); // null
    }
}