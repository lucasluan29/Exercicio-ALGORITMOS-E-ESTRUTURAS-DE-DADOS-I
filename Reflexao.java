/*
a) Custo da inserção no meio.
O custo de inserção no meio de um Array Dinâmico é O(n). Isso ocorre porque, como a estrutura utiliza memória contígua, é necessário deslocar todos os elementos à direita da posição desejada para abrir espaço para o novo valor. Na Lista Encadeada, se já tivermos a referência do nó alvo, o custo da inserção no meio é O(1), pois basta criar o novo nó e redirecionar os ponteiros, não sendo necessário reorganizar o restante dos elementos da estrutura.

b) Custo de acesso por índice.
Para acesso por índice, o Array Dinâmico é bem mais rápido (custo O(1)). Por ser um bloco contíguo na memória, o computador calcula o endereço exato do k-ésimo elemento matematicamente. Já a Lista Encadeada não possui memória contígua e requer custo O(n) para esse acesso, pois o algoritmo é forçado a percorrer a estrutura linearmente desde o início (head) visitando nó por nó até alcançar a k-ésima posição.

c) Circularidade.
Sim, é possível resolver o Problema de Josephus usando um array, controlando a circularidade com o operador de módulo (%). No entanto, a remoção seria significativamente menos eficiente. Para eliminar alguém, o array precisaria de um deslocamento contínuo O(n) a cada remoção para preencher o vazio deixado, ou precisaria implementar uma marcação lógica (ex: valor zero, null, bool), o que prejudicaria bastante a performance da contagem nas iterações seguintes. A lista circular se provou muito superior e mais eficiente nesse cenário, pois elimina nós com simples manipulações de ponteiros O(1).
*/