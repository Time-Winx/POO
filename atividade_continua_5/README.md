

# Atividade continua 5

## Integrantes

Arthur Alves Correa - 1903356 
Gabriel Tomaz do Nascimento - 1903811 
Eduardo Akira Hanada Oushiro - 1903669
Matheus Pollini Malaquias - 1903942
Victor Bastos De Carvalho - 1903491
William Alves Ribeiro - 1903690


## Descrição do problema

## Classes

#### Formação

##### Atributos

- Lista de possiveis formaçoes
[ ortopedia, traumatologia, infectologia]

##### Metodos

- Itera sobre lista

#### Médicos


##### Atributos

- [x] CRM
- [x] CPF
- [x] Nome
- [x] Telefone
- [x] Salário
- [x] Formações
- [ ] Formação em que atua


##### Metodos

- [x] Cadastrar novo medico
- Mostrar pacientes vinculados 
- Cadastra novo item ao historico
- Recupera historico do paciente
- Recupera hitorico geral de **seus pacientes**

#### pacientes internados

##### Atributos

- Nome
- RG
- CPF
- Endereço
- Telefone
- Data de nascimento
- Médico responsável `[CRM]`
- Model.entidades.Quarto individual

##### Metodos

- Cadastrar paciente
- Mostrar paciente pelo CPF
- Mostrar pacientes pelo Nome
- Destinar paciente a quarto
- Destinar medico a paciente
- Mostrar todos os pacientes

#### Quartos

##### Atributos

- chave (Andar especilizado + numero)
- Número
- Andar especializado
- Limite de hospedes

##### Metodos

- Recupera atual hospede
- Recura historico de hospedes
- Verifica limite de hospedes
- Atualiza numero de hospedes

#### Histórico

- Observaçoes
- Estado atual do paciente (Classificação de 0 a 10)
- Localidade_id SE DER TEMPO 
- Data
- Hora
- Paciente_cpf
- Medico_crm

##### Metodos

- Inserir item
- Recuperar todos os itens do historico
