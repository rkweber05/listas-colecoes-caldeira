# Trabalhando com listas e coleções de dados:

**A propriedade var chegou a partir do Java 10  =** é uma variável que realiza um inferência do tipo declarado (sem precisar dizer o tipo), tornando o código mais limpo e mais legível.

**Arrays em Java,** armazenam uma coleção de elementos do mesmo tipo, para sua declaração se defini o seu **tipo**  e **tamanho.**

**Por exemplo,** array de inteiros com tamanho 5. **`int**[] numeros = **new** **int**[5];`

**Problemas:** tem valores fixos e não pode ser alterado depois de sua criação. Ausência de métodos, ou seja não permite inserir, remover ou pesquisar elementos de forma eficiente, por isso para representar coleções e 

**ArrayList** = é uma lista que tem atrás dela uma lista primitiva.f

**Estrutura =** ArrayList<Filme> listaDeFilme = new ArrayList();

Dentro dos <Classe> passa a classe na qual queremos obter a lista, ou seja, criamos uma classe filme, com seus atributos e métodos, e queremos saber quantos filmes foram criados e quais as informações que são guardadas dentro dele.

Depois de setar o filme e colocar as informações, nos passamos o nome da nossa lista, por exemplo **listaDeFilme**, e para adicionar o filme na qual passamos, é necessário passar outro método chamado **.add();**, onde dentro dos () passamos o que foi instanciado anteriormente.

Para saber o tamanho da minhas lista, usamos outro método chamado **.sizes();**

Para pegar o primeiro elemento da minha lista, chamamos outro método **get(0).getNome();** e como sabemos sempre se inicia o primeiro array com valor 0. 

**Documentação ArrayList:** [https://docs.oracle.com/search/?q=arraylist&lang=en&category=java&product=en%2Fjava](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html)

**OBS:** Todas as classes do JAVA são filhas de Object, então quando é criada uma classe e ela não extends de outra, ela automaticamente esta extend da Classe Object, ou seja, uma Super classe de todas as outras classes. Então todos tem métodos também toString

# Construindo objetos com valores:

**Construtor:** método que tem como função a criação de um objeto em memória. Caso não seja criado, o Java cria uma contsrutor padrão.

**OBS:** não tem herança de construtores.

# Tipos diferentes de objetos na lista

Para colocar mais de um tipo de lista, cria uma classe pai, onde as subclasses herdam da classe pai, ou seja, quando eu quiser colocar ambas classes na lista, eu não preciso criar duas lista, apenas coloco para que a lista seja feita através da classe pai !

```csharp
ArrayList<String> nomes =new ArrayList<>();
nomes.add("Jacqueline");
nomes.add("Paulo");
nomes.add("Suellen");
nomes.add("Emily");

for (String nome : nomes) {
    System.out.println(nome);
}
```

Pode ser reescrito o código da seguinte forma:
`nomes.forEach(nome -> System.**out**.println(nome));`

Outra forma mais reduzida, usando o **Method Reference:**
`nomes.forEach(System.out::println);`

# Identificando o objeto

Dentro do meu foreach, utilizar uma verificação chamada **instanceof: "se ele é”**.

Toda variável de objeto é na verdade uma referência a esse objeto que foi alocado na memória.

**Exemplo p2 = p1;** Ou seja, ambos se comunicam e fazem referência a um objeto, se o p1 tiver valor, mas o p2 faz referência com ele, e é alterado, então o resultado será o valor setado no p2.

# Ordenação de listas

A lista vem na forma em que instancioamos.

**Collections.sort(); =** é uma classe que esta no java.util.Collections, é um método estático. Ordena por ordem alfabética. Precisamos sempre passar um critério clara para fazer a comparação.

Usamos tambem o compareTo, que faz a comparação entre dois tipos;

Para utilizar o **compareTo**, é necessário implementar na classe um Comparable<Tipo>, e implementando o metodo compareTo;

Exemplo: 

`@Overridepublic int compareTo(Produto p) { return this.getNome().compareTo(p.getNome());}`

**OBS: Documentação Comparable (é um comparador)** https://www.alura.com.br/artigos/ordenando-colecoes-com-comparable-e-comparator

# Outros critérios de ordenação.

Usar método **sort.(Comparator.comparing(** o que deseja comparar**)),** ou seja, usar método sort, dentro dele colocar o que deve ser comparado.

**Exemplo:** 
`produtos.sort(Comparator.comparing(Produto::getPreco));`

# Java Caldeira

# Trabalhando com listas e coleções de dados:

**A propriedade var chegou a partir do Java 10  =** é uma variável que realiza um inferência do tipo declarado (sem precisar dizer o tipo), tornando o código mais limpo e mais legível.

**Arrays em Java,** armazenam uma coleção de elementos do mesmo tipo, para sua declaração se defini o seu **tipo**  e **tamanho.**

**Por exemplo,** array de inteiros com tamanho 5. **`int**[] numeros = **new** **int**[5];`

**Problemas:** tem valores fixos e não pode ser alterado depois de sua criação. Ausência de métodos, ou seja não permite inserir, remover ou pesquisar elementos de forma eficiente, por isso para representar coleções e 

**ArrayList** = é uma lista que tem atrás dela uma lista primitiva.

**Estrutura =** ArrayList<Filme> listaDeFilme = new ArrayList();

Dentro dos <Classe> passa a classe na qual queremos obter a lista, ou seja, criamos uma classe filme, com seus atributos e métodos, e queremos saber quantos filmes foram criados e quais as informações que são guardadas dentro dele.

Depois de setar o filme e colocar as informações, nos passamos o nome da nossa lista, por exemplo **listaDeFilme**, e para adicionar o filme na qual passamos, é necessário passar outro método chamado **.add();**, onde dentro dos () passamos o que foi instanciado anteriormente.

Para saber o tamanho da minhas lista, usamos outro método chamado **.sizes();**

Para pegar o primeiro elemento da minha lista, chamamos outro método **get(0).getNome();** e como sabemos sempre se inicia o primeiro array com valor 0. 

**Documentação ArrayList:** [https://docs.oracle.com/search/?q=arraylist&lang=en&category=java&product=en%2Fjava](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html)

**OBS:** Todas as classes do JAVA são filhas de Object, então quando é criada uma classe e ela não extends de outra, ela automaticamente esta extend da Classe Object, ou seja, uma Super classe de todas as outras classes. Então todos tem métodos também toString

# Construindo objetos com valores:

**Construtor:** método que tem como função a criação de um objeto em memória. Caso não seja criado, o Java cria uma construtor padrão.

**OBS:** não tem herança de construtores.

# Tipos diferentes de objetos na lista

Para colocar mais de um tipo de lista, cria uma classe pai, onde as subclasses herdam da classe pai, ou seja, quando eu quiser colocar ambas classes na lista, eu não preciso criar duas lista, apenas coloco para que a lista seja feita através da classe pai !

```csharp
ArrayList<String> nomes =new ArrayList<>();
nomes.add("Jacqueline");
nomes.add("Paulo");
nomes.add("Suellen");
nomes.add("Emily");

for (String nome : nomes) {
    System.out.println(nome);
}
```

Pode ser reescrito o código da seguinte forma:
`nomes.forEach(nome -> System.**out**.println(nome));`

Outra forma mais reduzida, usando o **Method Reference:**
`nomes.forEach(System.out::println);`

# Identificando o objeto

Dentro do meu foreach, utilizar uma verificação chamada **instanceof: "se ele é”**.

Toda variável de objeto é na verdade uma referência a esse objeto que foi alocado na memória.

**Exemplo p2 = p1;** Ou seja, ambos se comunicam e fazem referência a um objeto, se o p1 tiver valor, mas o p2 faz referência com ele, e é alterado, então o resultado será o valor setado no p2.

# Ordenação de listas

A lista vem na forma em que instancioamos.

**Collections.sort(); =** é uma classe que esta no java.util.Collections, é um método estático. Ordena por ordem alfabética. Precisamos sempre passar um critério clara para fazer a comparação.

Usamos tambem o compareTo, que faz a comparação entre dois tipos;

Para utilizar o **compareTo**, é necessário implementar na classe um Comparable<Tipo>, e implementando o metodo compareTo;

Exemplo: 

`@Override public int compareTo(Produto p) { return this.getNome().compareTo(p.getNome());}`

**OBS: Documentação Comparable (é um comparador)** https://www.alura.com.br/artigos/ordenando-colecoes-com-comparable-e-comparator

# Outros critérios de ordenação.

Usar método **sort.(Comparator.comparing(** o que deseja comparar**)),** ou seja, usar método sort, dentro dele colocar o que deve ser comparado.

**Exemplo:** 
`produtos.sort(Comparator.comparing(Produto::getPreco));`

# Utilizando a interface List

**Documentação List:** https://docs.oracle.com/javase/8/docs/api/java/util/List.html;  import no java.util.List

Usando agora então:

```jsx
List<String> nomes =new LinkedList<>();6
```

Agora temos uma lista que instância uma nova “lista ligada”, onde O ***trabalho voltado à interface*** é um dos grandes princípios de Orientação a Objetos
O **List** obriga que ambas tenham os mesmos métodos, mas a maneira de implementá-los é discordada entre cada tipo de lista

**LinkedList** é baseado em uma lista encadeada, significa que é um objeto que contém uma referência para o próximo elementos, boa escolha quando a inserção e remoção é frequente e não precisa acessar o elemento de forma aleatória.

Como a list é uma interface não pode ter um new nela, não podemos instanciar !

**HashSet** = contém elementos na coleção especificado (https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html)

**HashMap** = conhecido por sua eficiência em termos de tempo de execução,  o desempenho do HashMap não depende do tamanho da coleção de dados!. (https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html)

**OBS: é um bom hábito, Collection** é a mãe de quase todas as coleções
