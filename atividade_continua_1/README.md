# Jogo da velha

## Requisições

- [ ] Representar o tabuleiro como uma matriz de caracteres 3x3. Você deve implementar o método initialize, que deve
  retornar uma matriz de caracteres 3x3, com algum valor preenchido para indicar que uma posição não foi ocupada.
<br>
  <br>
- [ ] Implementar o método step que recebe a matriz do jogo da velha, uma posição (linha e coluna) e o código do
  jogador (X ou O) e preencher a posição da matriz com o código do jogador, caso a posição esteja livre e seja válida.
  Se a posição puder ser preenchida, o método deve retornar true e caso não puder, deve retornar false. Considere como
  posições válidas as linhas 0, 1 e 2; e as colunas 0, 1 e 2.]
<br>
  <br>
- [ ] Implementar o método status que recebe a matriz do jogo da velha e retorna um código indicando
  o estado do jogo: alguém venceu, ocorreu um empate ou o jogo deve continuar. Utilize os seguintes
  códigos:
  - `1` - o jogo pode continuar 
  - `0` - ocorreu um empate
  - `1` - jogador O venceu
  - `2` - jogador X venceu  
<br>
- [ ] Implementar o método game para executar a lógica do jogo. Considere que o jogador O sempre irá
   começar o jogo. A cada jogada, a matriz do jogo deverá ser exibida na tela. Ao final do jogo, esse
   método deve mostrar o resultado (o jogador que venceu, ou se houve empate ou se não houve
   vencedor).