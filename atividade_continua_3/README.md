### Atividade Continua 03 
#### a de Entrega: 20/04/2021 (23:59)
#### Grupos: máximo de 6 alunos
__________________________________________________________________________________________

 #### Descrição:

Os super-heróis são personagens fictícios dotados de poderes sobrehumanos. Criados pela imaginação do homem, eles estão sempre em alerta para proteger o mundo dos ataques de mentes cruéis que pretendem dominar o nosso planeta.
  
Cada super-herói tem uma origem interessante. Alguns, como o Incrível Hulk, o Capitão América e o Homem de Ferro, surgiram em laboratórios, e eram pessoas comuns antes de adquirirem seus superpoderes a partir de acidentes ou experiências com raios-gama, reações químicas e estudos científicos nos campos da física, engenharia e biologia. Outros, como o Super-Homem e o Lanterna-Verde, vieram de outros planetas. Existem ainda aqueles que se originaram das mitologias, como é o caso do Thor e a Mulher-Maravilha.
  
Os primeiros super-heróis apareceram entre 1930 e 1960, e o desenho em quadrinhos foi o principal veículo de divulgação em massa, antes da chegada da televisão. As principais empresas do ramo são a Hanna-Barbera, a DC Comics e a Marvel, criadoras de dezenas de personagens.
  
Em quase todas as histórias, o super-herói é chamado para resolver um problema ou enfrentar ameaças de um vilão com um plano maligno. O vilão também é munido de superpoderes mas dificilmente consegue vencer o super-herói, pois os poderes deste são mais fortes.

Na lista abaixo são citados alguns super-heróis e alguns vilões, dos quais provavelmente já ouvimos falar. A lista apresenta também o nome na vida real e os superpoderes de cada um. Os superpoderes foram categorizados de 1 a 5, sendo 5 o poder mais forte e 1 o poder mais fraco.

Tabela dos Super-Heróis:
Nome|Nome na vida real|Superpoderes|Categoria do Poder
----|-----------------|------------|------------------
Homem-Aranha|Peter Park|soltar teia<br />andar em paredes<br />sentido apurado|3<br />2<br />1
Super-Homem|Crark Kent|voar<br />força<br />visão de raio x<br />sopro congelante<br />|3<br />5<br />4<br />4<br />
Capitão América|Steven Rogers|supersoldado<br />escudo<br />|3<br />3<br />
Flash|Barry Allen|velocidade|5
Homem de Ferro|Tony Stark|armadura<br />dispositivos eletrônicos|4<br />2
Mulher-Maravilha|Diana|velocidade|forca<br />braceletes|3<br />3<br />1


Tabela dos Vilões:
Nome|Nome na vida real|Superpoderes|Categoria do Poder
----|-----------------|------------|------------------
Duende-Verde|Norman Osbourne|força|5
Lex Luthor|Lex Luthor|mente aguçada|5
Bizarro|Bizarro|voar<br />força<br />visão de raio x<br />sopro congelante|3<br />5<br />4<br />4
Octopus|Otto Octavius|tentáculos indestrutíveis<br />velocidade|5<br />1

 #### ATIVIDADE:
1. Construa uma classe SuperPoder, com a seguinte estrutura:<br />
  Atributos privados:<br />
    -nome: String<br />
    -categoria: int<br />
  Métodos públicos:<br />
    -getNome(): retorna o nome do poder<br />
    -getCategoria(): retorna a categoria do poder<br />
  Construtor:<br />
    -SuperPoder(String nome, int categoria): Recebe o nome e a categoria do poder e atribui ao objeto<br />

2. Construa uma classe Personagem, com a seguinte estrutura:<br />
  Atributos privados:<br />
    -nome: String<br />
    -nomeVidaReal: String<br />
    -poderes: vetor de 4 elementos do tipo SuperPoder<br />
  Métodos públicos:<br />
    -void adicionarSuperPoder(SuperPoder superpoder): recebe um superpoder como parâmetro e coloca-o no vetor ‘poderes’. Um super-herói ou vilão pode ter, no máximo, 4 poderes.<br />
    -double getPoderTotal(): retorna a soma de poderes do super-herói. O poder total é calculado percorrendo-se o vetor ‘poderes’ e somando a categoria de cada poder.<br />
  Construtor:<br />
    -Personagem (String nome, String nomeVidaReal): Recebe os nomes do personagem e atribui ao objeto.<br />
3. Construa uma classe SuperHeroi, que herda da classe Personagem, com a seguinte estrutura:<br />
  Construtor: <br />
    -SuperHeroi (String nome, String nomeVidaReal): Recebe os dois parâmetros e repassa para a superclasse.<br />
    Sobrescrita do método da superclasse:<br />
    -double getPoderTotal(): Retorna o poder do personagem super-herói com um acréscimo de 10%.<br />
4. Construa uma classe chamada Vilao, que herda da classe Personagem, com a seguinte estrutura:<br />
  Atributos públicos:<br />
    -tempoDePrisao: int<br />
  Construtor:<br />
    -Vilao (String nome, String nomeVidaReal, int tempoDePrisao): Recebe os três parâmetros e repassa dois deles para a superclasse.<br />
5. Construa uma classe chamada Confronto, com a seguinte estrutura:<br />
  Métodos públicos:<br />
    -int lutar (SuperHeroi superheroi, Vilao vilao): método recebe um super-herói e um vilão como parâmetros e decide quem é o vencedor da       batalha. O método deve retornar: <br />
    1: se o super-herói ganha a batalha
    2: se o vilão ganha a batalha
    0: se houver empate.
  O vencedor será aquele que tiver mais poder (use o método getPoderTotal() para saber qual é o poder de cada um)
6. Construa uma classe chamada Principal, com a função main. Nessa função, faça o seguinte:
  crie um objeto da classe SuperHeroi e um objeto da classe Vilao.
  crie os superpoderes a atribua-os ao objetos SuperHeroi e Vilao.
  crie um objeto da classe Confronto e invoque o método lutar, passando como parâmetro o super-herói e o vilão.
  Mostre uma mensagem na tela dizendo quem é que vence o confronto.

#### ATENÇÃO:

Será disponibilizado um arquivo de teste para auxiliar na verificação das classes. Outros testes poderão ser realizados posteriormente para correção da atividade.

Insira no início do programa um comentário com os nomes dos alunos do grupo.

Nomes das classes, atributos e métodos devem ser exatamente iguais ao apresentado no enunciado e no diagrama de classes. O programa será corrigido automaticamente e, caso algum nome seja alterado, não será incluído na correção.

Métodos e atributos adicionais podem ser incluídos caso você ache necessário, desde que os atributos e métodos descritos no enunciado sejam mantidos.

Não serão aceitos trabalhos que não sejam arquivos java (doc, pdf, txt, links para git, etc.)

Caso seja identificada cópia entre trabalhos, a nota dos grupos envolvidos será zerada.

Não serão aceitos trabalhos entregues em atraso.


#### CRITÉRIOS DE AVALIAÇÃO:

Resultado do arquivo de teste disponibilizado.

Funcionamento do programa e implementação correta das classes, conforme descrito no enunciado e no diagrama de classes.

O programa deve estar na linguagem Java.

Identação, organização e legibilidade do código.

Clareza na nomenclatura de variáveis e funções.


FORMA DE ENTREGA:
Anexar no Classroom os arquivo com as implementações das classes solicitadas.
Pode ser enviado por apenas um integrante do grupo (mas não esqueça de colocar o nome de todos os integrantes do grupo no início dos arquivos).
