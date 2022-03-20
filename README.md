## 📚 Seções Portfólios

<h4 align="left"><a href="https://github.com/caroolps/Portfolio01">PROJETO 1º SEMESTRE: Mapeador de Criminalidade ao Redor da FATEC</a></h4>
<h4 align="left"><a href="https://github.com/caroolps/Portfolio02">PROJETO 2º SEMESTRE: Gantt Chart</a></h4>
<h4 align="left"><a href="https://github.com/caroolps/Portfolio03">PROJETO 3º SEMESTRE: Cadastro Positivo</a></h4>
<h4 align="left"><a href="https://github.com/caroolps/Portfolio04">PROJETO 4º SEMESTRE: JobNation</a></h4>
<h4 align="left"><a href="https://github.com/caroolps/Portfolio05">PROJETO 5º SEMESTRE: Educalytics</a></h4>

![image](https://user-images.githubusercontent.com/61089745/158082449-894548ea-e14d-4de7-896d-12d2a9ec1d74.png)

## FATEC & IONIC HEALTH - EDUCALYTICS:mortar_board:

### **I - RESUMO DO PROJETO**:page_facing_up: 

Neste quinto Projeto Integrador a FATEC trouxe o Cliente "IONIC HEALTH" para que pudéssemos achar uma solução tecnológica para sanar e atender às necessidades do cliente. 

O cliente busca obter indicadores e avaliar o uso e gerenciamento de sua plataforma de cursos, buscando os alunos que estão com boa frequência nas aulas, que entra em contato por chat para sanar dúvidas e avaliação das aulas dadas.

Com base nesse briefing, solicita uma plataforma funcional com capacidade analítica, com dashboards, histórico de chat e armazenamento desses dados. Para a realização da análise deverá ter especialmente:


* Ativação: Quantos usuários ativos (aluno/colaboradores) na plataforma legado;
* Engajamento: Conhecer o número de usuários, tipos, seu comportamento (matrícula, curso, disciplina, participação);
* Desempenho: qual o aproveitamento do aluno(nota atingida) e do professor (andamento da turma);
* Participação x taxas de conclusão x desempenho dos alunos/colaboradores;
* Avaliação de reação: quanto ao conteúdo apresentado, experiência do aluno/colaborador durante o curso;
* Registro do tempo de participação no curso;
* Guardar logs e histórico das conversas do chat;


#### Requisitos Funcionais


| Functional Requirements                                                 | Reference | Priority | Sprint |
|------------------------------------------------------------------------|--------|------------|--------|
| Dashboard: apresentar dados ao cliente (via backend e banco de dados 01 relacional)        | RF01   | 1          | 1      |
| Continuous Integration | RF02   | 1          | 4      |
| Tratar Logs| RF03   | 1          | 2      |
| Tratar Chats T   | RF04  | 1          | 3     |
| Acumular dados históricos tratados e gerar inteligência para o client, via DASHBOARD |RF05	| 1	| 4




#### Requisitos Não Funcionais


| Non-functional Requirements                            | Reference | 
|------------------------------------------------------|--------|
| Regras de segurança da informação         | RNF01  |
| Regras de privacidade              | RNF02  |
| Documentação | RNF03  |
| Escalabilidade  | RNF04  |
| Facilidade de Uso | RNF05 |



### Proposta:

Desenvolver um aplicativo capaz de buscar dados de uma fonte externa, ou seja, um aplicativo legado (chamado Skillshare), para fornecer aos usuários informações suficientes para administrar uma instituição de ensino.

Os dados são produzidos através do uso regular de uma plataforma de e-learning. Assim, um histórico de uso, incluindo interação do usuário via chats e logs do sistema, atribuições, desempenho dos alunos e satisfação do usuário devem ser extraídos, compilados e apresentados aos nossos clientes.

Eventualmente, a Educalytics deve ser capaz de transmitir o comportamento dos usuários de aplicativos legados e fornecer à instituição de ensino inteligência suficiente, apoiando seu processo de tomada de decisão.

Seguindo essas premissas listadas acima, a Educalytics apresentará uma GUI por meio de um DASHBOARD com os dados mais importantes do ponto de vista da instituição de ensino.

#### Diagrama de Casos de Uso
(translated to Portuguese).
![image](https://user-images.githubusercontent.com/61089745/159184157-6fff7a22-2156-4560-a6f5-bcabda70e1ac.png)


#### FEATURES:

1- ARQUITETURA DO EDUCALYTICS

![image](https://user-images.githubusercontent.com/61089745/159179873-f5a8d7c4-46a5-4a91-91a1-e0e801627a9f.png)

2- FRONTEND;

2.1- DASHBOARD (MVP);

![image](https://user-images.githubusercontent.com/61089745/159179889-472655a1-6d5e-42a4-9cb2-eea4712c2dea.png)

2.2- TELA DE LOGIN (COM CRIPTOGRAFIA "bcript");

![image](https://user-images.githubusercontent.com/61089745/159179961-dcf5594d-12dc-478b-b458-35f7781dd083.png)

![image](https://user-images.githubusercontent.com/61089745/159179972-f344d07b-364b-4aed-9f0d-b81657fcc252.png)


2.3- SOLICITAÇÃO USANDO TOKEN ÚNICO;

![image](https://user-images.githubusercontent.com/61089745/159180013-a0041a64-1b65-45d8-addf-41ac2479f773.png)

2.4- INTEGRAÇÃO CONTÍNUA;

![image](https://user-images.githubusercontent.com/61089745/159180157-a0b5818d-0427-46b8-acdc-74a18df75e9c.png)

![image](https://user-images.githubusercontent.com/61089745/159180165-7dd29c0b-2c8b-45b2-8065-21603f725f8c.png)

![image](https://user-images.githubusercontent.com/61089745/159180282-37075ff4-a3e2-4caf-a144-ddcf97ee4a75.png)

![image](https://user-images.githubusercontent.com/61089745/159180717-f73588d8-e928-4b77-bf04-f0061acfe084.png)


2.5- APRESENTAÇÃO DOS RESULTADOS DA PARTICIPAÇÃO DOS ALUNOS VIA GRÁFICOS NO PAINEL;
![image](https://user-images.githubusercontent.com/61089745/159181410-6229d04f-c7df-4b15-8979-61d8e15d9efd.png)

![image](https://user-images.githubusercontent.com/61089745/159181602-bc46a33f-fd96-4944-9b35-7e400f4809c2.png)

![image](https://user-images.githubusercontent.com/61089745/159181803-d5d3c9a3-a6e0-4d32-9a44-e4afdfc701e1.png)

2.6- RESULTADOS EM CADA AULA;

![image](https://user-images.githubusercontent.com/61089745/159182151-5df61b9d-3654-4446-8038-e1b2e1abb040.png)

3-  BACKEND - AS 8 CAMADAS (MPConConRVSC).

Model, 
Payload, 
Config, 
Converter, 
Repository, 
Validator, 
Services, 
Controller.

![image](https://user-images.githubusercontent.com/61089745/159182598-11dad1b7-4f34-4e8f-b108-2f1dfc772df2.png)

![image](https://user-images.githubusercontent.com/61089745/159182772-fe3f1484-3eb9-4c07-96d6-aaa1e9545245.png)

3.1- BACKEND - VALIDAÇÃO (usuário e senha).

![image](https://user-images.githubusercontent.com/61089745/159183570-aa8ac41f-46a5-4dac-a5e7-e7f38a69a303.png)

3.2- BACKEND - ACESSO A BANCO DE DADOS

![image](https://user-images.githubusercontent.com/61089745/159183668-f5723b53-0a9a-42ce-9114-4d4a4a87f344.png)

3.3- BACKEND - ETL.

![image](https://user-images.githubusercontent.com/61089745/159183744-7e2c9c21-0b80-4aef-8874-6ec2d75805da.png)


3.3.1- BACKEND - ETL TIME DIMENSION.

![image](https://user-images.githubusercontent.com/61089745/159183767-2cab25de-25d6-4c70-a051-04a98087495f.png)

4- EDUCALYTICS's DATABASE (RELATIONAL)

4.1- LOGICAL MODEL

![image](https://user-images.githubusercontent.com/61089745/159183917-ca07238a-9570-4461-917f-481f6088cb52.png)

4.2- MODELO DE RELACIONAMENTO DE ENTIDADE

![image](https://user-images.githubusercontent.com/61089745/159183927-84af1794-bd8d-49a8-a4cc-b9727d9109e6.png)

4.3 MODELO DE BANCO DE DADOS DE HABILIDADES

![image](https://user-images.githubusercontent.com/61089745/159183977-df1d3a86-dc4f-4137-982b-02907d96b264.png)

4.4 MODELO DE BANCO DE DADOS DE DESEMPENHO DA DATAMART

![image](https://user-images.githubusercontent.com/61089745/159183992-7ca0ab76-540f-4b0a-96e3-7d20ff48cd41.png)
![image](https://user-images.githubusercontent.com/61089745/159184002-072023f4-d0cb-4479-a87a-687da8e8c13b.png)

4.5 INTEGRAÇÃO ETL DA PARTICIPAÇÃO DO DATAMART

![image](https://i.ibb.co/3m6V6n6/DATAMART-ENGAJAMENTO.png)

4.6 PARTICIPAÇÃO DO DATAMART - EXTRAÇÃO DE DADOS DO MONGO DB

![image](https://i.ibb.co/ssS7yBm/EXTRACAO-MONGO-DB.png)

4.7 PARTICIPAÇÃO DO DATAMART - EXTRAINDO DA DIMENSÃO AO FATO

![image](https://i.ibb.co/W27gGDW/EXTRACAO-DIMENSOES-FATO.png)

5- BASE DE DADOS(NÃO RELACIONAL)

![image](https://i.ibb.co/pXyJ1qQ/DATAMART-02-ENGAJAMENTO.png)

5.1- ESTRUTURA DE PARTICIPAÇÃO DO DATAMART

![image](https://i.ibb.co/b63mVjP/MODELAGEM-ATUALIZADA.png)

5.1.1-  PARTICIPAÇÃO DO DATAMART - COBRANÇA DE CONEXÃO

![image](https://i.ibb.co/kMLBtPv/COLLECTION-CONNECTIONS.png)

5.1.2- PARTICIPAÇÃO DO DATAMART - COLETA DE MENSAGENS

![image](https://i.ibb.co/NNj5jnf/COLLECTION-MESSAGES.png)

5.2- BANCO DE DADOS NÃO RELACIONAL ETL

![image](https://i.ibb.co/wMrLpBB/ETL-BDNR.png)

5.3- REGISTRO DE CHAT+LOGS INSERIDO NO MONGO DB CLOUD
![image](https://i.ibb.co/WxhRFtm/DADOS-DO-CHAT-E-DOS-LOGS.png)


### Inovação
Criamos o 1º BD a partir dos dados considerados necessários, a partir dos requisitos do cliente e da aplicação legado (Skillshare).  Subsequentemente, alteramos o protagonismo para as entidades que envolvem a ligação entre Alunos, Professores e Disciplina.
Então, estudamos quais ferramentas servirão aos requisitos (não) funcionais:


No FRONTEND - criptografia e token.
No BACKEND - arquitetura em oito camadas;
No BANCO DE DADOS 01 (RELACIONAL) - Primeira versão com todos os dados necessários (será decomposto);
No BANCO DE DADOS 02 (NÃO-RELACIONAL) - Receberá tabelas do BD01, segundo critérios de performance;
Distribuição dos BD - Se necessária a clusterização / fragmentação;
No DATA WAREHOUSE - Ferramentas de relatório, de ETL no terceiro banco de dados;



### **II - TECNOLOGIAS**:iphone:

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![VS CODE](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Eclipse](https://img.shields.io/badge/Eclipse-FE7A16.svg?style=for-the-badge&logo=Eclipse&logoColor=white)
![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=for-the-badge&logo=javascript&logoColor=%23F7DF1E)
![NodeJS](https://img.shields.io/badge/node.js-6DA55F?style=for-the-badge&logo=node.js&logoColor=white)
![MicrosoftSQLServer](https://img.shields.io/badge/Microsoft%20SQL%20Sever-CC2927?style=for-the-badge&logo=microsoft%20sql%20server&logoColor=white)
![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white)
![React](https://img.shields.io/badge/react-%2320232a.svg?style=for-the-badge&logo=react&logoColor=%2361DAFB)
![Insomnia](https://img.shields.io/badge/Insomnia-black?style=for-the-badge&logo=insomnia&logoColor=5849BE)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)
![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)
![GitLab](https://img.shields.io/badge/gitlab-%23181717.svg?style=for-the-badge&logo=gitlab&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-%234ea94b.svg?style=for-the-badge&logo=mongodb&logoColor=white)
- Git Flow
- OBS Studio / Kdenlive

### **III - CONTRIBUIÇÕES INDIVIDUAIS**:bow:


### **IV - APRENDIZADOS EFETIVOS**:closed_book:

**Hard Skills Efetivamente Desenvolvidas:**

**Soft Skills Efetivamente Desenvolvidas:**
