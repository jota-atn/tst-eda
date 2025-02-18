# Anotações --- Pilhas

> LIFO -> Last In First Out, ou seja, toda adição e remoção são feitas no topo da pilha. (push e pop, respectivamente);

> Aplicações -> Ctrl + Z, Voltar em Browsers

## Implementação de uma classe Pilha:


> Atributo Topo -> Variável que controla o elemento (o índice) que está no topo da pilha, sendo assim, a pilha varia entre
os índices 0 e topo. A pilha inicia-se com topo em -1.

> Operações: 
	>> Push(<T> elemento): adicionar um elemento ao topo;
	>> Pop(<T> elemento: remover o elemento do topo);
	>> Peek(): retornar o elemento do topo;
	>> isEmpty(): retorna um boolean que diz se a pilha está vazia ou não;
	>> isFull(): retorna um boolean que diz se a pilha está cheia ou não.
