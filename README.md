# PROJETO INTEGRADOR 2020.2 - "VASCORE" - FATEC & SPC BRASIL.
[![](https://github.com/ODAGAMMXIX/2020.2-SPC-CAD-POSITIVO/blob/master/valcode-icon.jpg)](2020.2-SPC-CAD-POSITIVO/valcode-icon.jpg)
## i)	Disciplinas:
|MATÉRIA |	DOCENTE |
| ------ | ------ |
|ESTATÍSTICA DESCRITIVA|	Prof. NANCI DE OLIVEIRA|
|ESTRUTURA DE DADOS|	Prof. EDUARDO SAKAUE|
|FUNDAMENTOS DE GESTÃO DE TECNOLOGIA DA INFORMAÇÃO|	Prof. FABIANO SABHA|
|FUNDAMENTOS DE REDES DE COMPUTADORES|	Prof. ANTONIO WELLINGTON SALLES RIOS|
|LABORATÓRIO DE DESENVOLVIMENTO DE BANCO DE DADOS|	Prof. GIULIANO BERTOTTI|
|LINGUAGEM DE PROGRAMAÇÃO II|	Prof. LUCAS GONÇALVES NADALETE|
|PROGRAMAÇÃO DE BANCO DE DADOS|	Prof. JULIANA FORIN PASQUINI MARTINEZ|
##  ii)	Integrantes:
•	Caroline Paz de Sousa
RA:1460281923049
<https://www.linkedin.com/in/caroline-sousa-53a27972/>

•	Daniel Delgado
RA:1460281923005
<https://www.linkedin.com/in/daniel-delgado-274096194/>

•	Jessica Isri
RA: 1460281923019 
<https://www.linkedin.com/mwlite/in/jessica-dias1>

•	Fabio Odaguiri
RA: 1460281923008
<https://www.linkedin.com/in/fabioodaguiri/>

•	Nathan Augusto
RA:1460281923027
<https://www.linkedin.com/mwlite/in/nathan-naressi-b529081b2>

•	Wilson Amore Vieira Filho
RA: 1460281923041
<https://www.linkedin.com/in/wilson-amore-vieira-filho-7a4420183/>

## I - Introdução:
O presente documento visa apresentar a solução tecnológica proposta pela equipe para apresentar uma aplicação que gere valor aos usuários do Cadastro Positivo [C.P.], clientes da empresa SPC BRASIL.

Utilizando a base de dados do Cadastro Positivo (Lei nº 12.414/2011 c/c LC nº 166/2019), a aplicação gerará valor pelo fato de:

a)	Criar **fidelização:** conseguir manter seus usuários em sua plataforma, haja vista a presença de 4 “players” detentores da mesma base de dados;

b)	Ser **“monetizável”**;

c)	Aproveitar as características dos dados, agrupados em:
- i.	geolocalização;
- ii.	“Score” de Crédito;
- iii.	Investigação de CPF;
- iv.	Controle de Fraudes

Aqui, serão identificados e classificados o objeto, “story cards”, requisitos, proposta da solução, destacando a usabilidade e mantendo backlog.

A aplicação consiste num ambiente onde o usuário possa ter acesso aos seus dados do C.P., porém, com **algum atrativo adicional**.

A Interface Gráfica/VIEW propiciará a interação do usuário com a aplicação.
## II - Elicitação, Story Cards e Identificação de Requisitos
## II.I - Declaração do Problema.
Nossa cliente fornece dados cruciais à existência da própria Economia, vez que servem para a **concessão ou negação de crédito**. 

A partir de uma base de dados denominada Cadastro Positivo, seus usuários podem saber como estão posicionados no mercado de crédito, **seja requerer crédito ou, qual o risco de se conceder** crédito a quem lhes peça.

Os referidos dados são capturados de diversas **fontes públicas e de caráter público**, sobre histórico de crédito, definido na lei como “conjunto de dados financeiros e de pagamentos, relativos às operações de crédito e obrigações de pagamento adimplidas ou em andamento por pessoa natural ou jurídica.” Podem ser utilizado dados provados com o **consentimento do usuário**.
Nesse passo, nossa cliente busca a distinção da concorrência através de diferenciais para seus usuários.

Destaque-se a **bilateralidade** vez que a aplicação pode gerar valor **tanto para quem pede, quanto para quem dá o crédito**, *v.g.* **no ato de uma compra parcelada, a parte compradora é a requerente; a vendedora é a concedente**. Note-se que os usuários podem ser pessoas físicas ou jurídicas, eis que ambas **podem estar em qualquer das duas posições**.

Por fim, note-se que há uma massa de pessoas que raramente constava na base de dados, por não participar de aquisições suscetíveis às consultas de crédito: os chamados ***“desbancarizados”***. Sem conta bancária, são pessoas que participam anonimamente da Macroeconomia, por terem renda extremamente reduzida e utilizarem dinheiro em espécie (sem cartão de crédito, sem conta bancária, sem *fintech* de meios de pagamento eletrônico, sem salário formal). Agora, com a inserção de dados de contas de serviços públicos (*utilities*), pessoas cadastradas em empresas de energia elétrica, água, gás, telefonia dentre outros, passaram a constar na referida base de dados.

Logo, a aplicação deverá trabalhar tais dados e gerar informação que, por sua vez, há de transformar-se em conhecimento, aplicável no cotidiano dos usuários. Ademais, dados podem ser inseridos em troca de premiações (*gamificação*)

Nossa cliente declarou que a mera apresentação de dados na tela da aplicação não será considerada geração de valor; pode-se utilizar outras fontes públicas de dados; o primeiro passo é problematizar para sugerir soluções.
## II.II - Questões da Equipe.
Diante deste cenário, são perguntas plausíveis:
- a)	O usuário que paga contas e parcelas maiores e é negativado por contas menores, merece reclassificação?
- b)	O chamado “bom pagador” que está num mal momento econômico, com estabilidade financeira, não mereceria uma classificação melhor do que aquele que já perdeu os meios de recuperar-se?
- c)	Quão significativa é a massa de pessoas desbancarizadas (estimada em 20 milhões)? 
- d)	Como o desbancarizado poderia ter o registro de suas compras parceladas no banco de dados (*data entry*)? 
- e)	Quais *recortes estatísticos* agregam valor aos usuários (*Ciência de Dados*)?
- f)	Quais ferramentas de Ciência de Dados, Aprendizado de Máquina ou Inteligência Artificial podem transformar os dados em informação relevante?
- g)	Quais dados/débitos são considerados para o cálculo do “Score”, investigação de CPF e Prevenção de Fraudes?
h)	É possível automatizar consultar do CPF do indivíduo em bancos de dados tais quais CAGED, INSS e outros órgãos ou entes? Acompanhar os "likes", histórico de pesquisas, reconhecimento facial e dados biométricos?
## II.III - Brainstorming.
O que pode ser utilizado?
- **Dados primitivos:** Nome, CPF, Endereço, local de consumo (georreferenciado e endereço), data, hora, valor, nome e ramo de negócio do estabelecimento.
- **Dados históricos:** Somente pagamentos de parcelas de crédito já concedido; Não há histórico e frequência de consumo, horários e locais mais frequentes, tipos de consumo, quebra por categoria/período/local/valor, consumo mensal; renda presumida (somatória do quanto gasta e de quanto investe);
- **Dados externos:** Ainda não foram encontradas fontes de dados externos confiáveis para somar ao C.P. Descartou-se fontes oficiais pela dificuldade de segurança dos dados individualizados (CAGED, INSS e outros órgãos ou entes públicos: pensionista, aposentado, (des)empregado?).
O que pode ser apresentado?
##### a)	Nova quebra de faixas de risco para o crédito (em oposição à classificação binária):
- i.	bom pagador **sem negativações** c/c consumo e renda altas;
- ii.	bom pagador de grandes débitos com **pequenas moras**;
- iii.	bom pagador **por faixas de valores**;
- iv.	bom pagador com **renda comprometida**;
- v.	bom pagador que está em má fase **mas não perdeu sua fonte de renda**;
- vi.	***desbancarizados*** que já consomem baseado em crédito informal / crediário próprio;
- vii.	mal pagador c/c fonte de renda insuficiente;

#####  b)	Serviços que podem ser oferecidos aos *desbancarizados*:
- i.	Onde podem comprar parcelado / microcrédito (ato voluntário do comércio ou fintech dedicada – mercado: 20 milhões de pessoas)?
- ii.	Análise de risco para microcrédito;
- iii.	Microcrédito/milhagens/pontos como impulso inicial no histórico de crédito;
- iv. Mútua avaliação: *v.g. BlaBlaCar, Uber, 99taxi etc.*

#####  c)	Gamificação (opções):
- i.	**Classificação do usuário** por:
- i.i níveis de Score;
- i.ii. progressão de fases com simulações de meta/objetivos;
- i.iii. pontos;
- i.iv. colocação do usuário num determinado grupo (Os 20 melhores);
- i.v. Menu “Helper” ou Assistente com dicas para melhorar sua classificação;
- i.vi. Utilizar o Score para transformá-lo e mostrar progressão no gráfico;
- i.vii. Linha do tempo x gastos;
- i.viii. “Indique um amigo e ganhe (...)”;

- ii.	**Classificação dos gastos:**
- ii.i. Espécies de parcelas pagas pelo usuário.
- ii.ii. Espécies de gastos cadastrados pelo usuário.

- iii.	**Informações Básicas:**
- iii.i. Para que serve o Score e outras funções educativas
- iii.ii. “Quando vou me livrar das parcelas”?
- iii.iii. “Como faço para pagar mais rápido e liberar meu orçamento”?

##### d)	Momento da Negociação
Acompanhamento da **flutuação do Score** com sugestão do momento para oferecer acordo e prevenir conflito / evitar a judicialização (*machine learning*);

##### e) O que não pode ser apresentado na versão 1.0?
- a)	Itinerário do Consumo: Gráfico de “onde eu consumo ao longo do dia ou do mês” para requerentes e “qual o fluxo de consumidores em determinado local” para concedentes (por ausência de dados);
- b)	Informação sobre despesas não cadastradas (por ausência de dados);
- c)	Sugestão de consumo em novos estabelecimentos (por ausência de dados);
- d) Algoritmo de Gamificação (por escassez de recursos);
- e) Algoritmo de Serviços aos DEsbancarizados (por escassez de recursos);
- f) Nova quebra de faixas de classificação do "bom-pagar" (por escassez de recursos);
- g) importação de dados públicos, "likes", histórico de pesquisas, reconhecimento facial etc. (por escassez de recursos);

[![](https://github.com/ODAGAMMXIX/2020.2-SPC-CAD-POSITIVO/blob/0269672e858e63a03b49787268e0488c01d93440/proposta_escopo_valscore-1.0.jpg)](2020.2-SPC-CAD-POSITIVO/proposta_escopo_valscore-1.0.jpg)


# II.IV - Story Cards:
- Clicar num botão, dentro do ambiente já disponível da cliente Senão: Login (usuário e senha);
- Abrir DASHBOARD;
- Ver meu próprio Score (calculado pela aplicação), minha classificação; dicas para melhorar e ofertas (opções gamificadas);
- Alterar a configurações de visibilidade de dados pessoais:
    -  Permitir que concedentes vejam meu Score;
    -  Permitir que concedentes vejam meu Histórico de Pagamentos;
    -  Bloquear determinada empresa;
    -  Confirmar bloqueio da determinada empresa;
    -  Informar orçamento compartilhado (casal, família, etc.) com outro usuário;

- Cadastrar meus pagamentos (pelo requerente), substituindo planilhas;
- Cadastrar minhas vendas e meu crediário (pelo concedente);
- Confirmar pagamentos registrados pelos vendedores), substituindo planilhas;
- Importar arquivo com minhas despesas;
- Visualizar meus pontos ganhados por:
    -   Cadastrar minhas compras/vendas;
    -   Permitir ampliar visibilidade dos meus dados;
- Visualizar opções de interação gamificadas (opções):
    -   Minhas vantagens SPCBrasil;
    -   Dicas de como melhorar meu Score;
    -   Dicas para liberar parte do meu orçamento;
    -   Dicas de educação financeira/“pílulas“ de informação (“Muito bem, você está aumentando seu Score! Já pensou em economizar 2 pizzas por mês e formar sua reserva de emergência em x meses?”);
    -   Top 10 dos itens de maior gastos por categoria (alimentação, vestuário, educação, transporte, telefonia etc).
    -   Grafico de Pizza com o consumo;
    -   Sistema de pontos
# II.V - Especificação de Requisitos (em ordem de prioridade    ):
FUNCIONAIS:
|NOME 	| Cod| 	Descrição |
| ------ | ------ | ------ |
|Cadastrar usuário|	R1|	[O sistema deve permitir inserir novos projetos e tarefas relacionadas aos mesmos] [PlDb] |
|Calcular Score|	R2|	com novas faixas de “bons pagadores”, com dados externos disponíveis|
|Cadastrar transações|	R3|	Requerente pode cadastrar seus pagamentos; Concedente pode cadastrar suas vendas e crediário|
|Conceder, estender ou revogar acesso aos meus dados|	R4|	Diferentes níveis de acessos aos meus dados, com recompensa pelos compartilhamentos |
|Armazenar em banco de dados|	R5|	dados do C.A. serão importados pelo banco de dados, que sofrerá acréscimos oriundos da interação do usuário|
|Gerar Relatórios|	R6	|Substituídos por painel de informações e “pílulas de conhecimento”|
|Importação de arquivo|R7 |		Minhas despesas/vendas ou crediário próprio|

## III - DIAGRAMA DE CASO DE USO (Bilateralidade)
[![]( https://github.com/ODAGAMMXIX/2020.2-SPC-CAD-POSITIVO/blob/master/DIAGRAMA-CASPS-DE-USO.jpg)](2020.2-SPC-CAD-POSITIVO/DIAGRAMA-CASPS-DE-USO.jpg)
 
NÃO-FUNCIONAIS:
- Dashboard visualmente agradável, colorido;
- Web* (para fidelização, confrontar com app mobile);
- Ciência de Dados;
- Aprendizado de Máquina;
- Inteligência Artificial;
- Gerencialmente Inteligível;
- Execução no próprio dispositivo;
- multiplataforma;

## IV - Proposta da Solução (Como deve ficar a aplicação)
A tela de entrada apresentaria um DASHBOARD com 4 quadrantes e um círculo ao meio.
O círculo apresenta o Score naquele momento.
Os quadrantes seguiriam a seguinte sugestão: 
|Quadrante 	| 	Descrição |
| ------ | ------ |
|Q1 | Configurações de visibilidade de dados pessoais (cancelar cadastro, publicar meu score, mostrar minhas transações, bloquear determinada empresa);|
|Q2|  Meus pagamentos (confirmar transação realizada em estabelecimento x planilhas) / minhas vendas e meu crediário (cadastrar venda e controlar pagamento de parcelas  x planilhas);|
|Q3|  Meus pontos (e outras premiações para inserção de dados);|
|Q4|  Como melhorar? (como melhorar meu score? como criar reserva de emergência? Educação Financeira e detecção de  padrões de comportamento)|

[![](https://github.com/ODAGAMMXIX/2020.2-SPC-CAD-POSITIVO/blob/master/MOCK-UP.jpg)](2020.2-SPC-CAD-POSITIVO/MOCK-UP.jpg)

Os dados são transformados em **informações individualmente relevantes** ao usuário antes da apresentação na tela.

Objetivando **fidelização**, as informações devem ser estimulantes ao progresso dentro da ferramenta, pelo ganho de vantagens: dicas para melhorar sua vida financeira e ganho de pontos;

A **monetização** pode vir de diversas fontes, a saber: 
- oferecer pontos por informação (dados de: emprego, salário, receita disponível, transações, crediário próprio);
- -	novos produtos a partir de dados cadastrados (data entry gamificada) pelos usuários;
- a informação do C.P. pode alimentar dados de geomarketing para empresas;
-	a rede de concedentes podem oferecer vantagens para trocar os pontos; 
-	fintechs: oferta de microcrédito direto pelo meio de pagamento, sem banco, aos desbancarizados (ver experiência da Índia);
## IV.I - Visão:
Entregar uma aplicação inovadora, lucrativa, socialmente responsável, amigável ao meio ambiente e de governança transparente dentro dos limites de um produto minimamente viável (M.V.P.).

## V - HEURISTICAS (Usabilidade)
 **a) Correspondência entre o sistema e o mundo real.**
O sistema possuirá uma interface intuitiva com menus e botões de ações de fácil entendimento, utilizando nomenclatura familiar aos seus usuários. 

As ações tais quais liberar acesso a dados, cadastrar um pagamento/venda, ver dicas serão realizadas por meio de botões/opções de menu sinalizados por check-boxes ou botões nominados com os verbos “cadastrar”, "deletar", "sim/não" ou simplesmente “+”, “-”, “->”. 

Utilização de vocabulário simples da Língua Portuguesa e, balões explicativos onde necessário, conduzindo os caminhos para que a utilização seja fluída.

**b)	Controle pelo usuário e liberdade de escolhas.**

Com o sistema intuitivo, o usuário possuirá uma certa liberdade no sistema, minimizando o número de cliques e de erros, pois conseguirá identificar claramente as funcionalidades e comandos disponíveis, sem precisar decorar procedimento algum. 

Sendo a facilidade em garantir ou revogar acesso aos seus dados, segundo a Lei Geral de Proteção de Dados e regras de conforto e facilitação, para que a ferramenta não se transforme em outro dever a ser esquecido.

Ao acessar o sistema com capslock ligado o sistema avisará o usuário (campo de senha é case sensitive).

**c)	Design estético minimalista**

Com design intuitivo o sistema exibirá informações úteis e processadas pelas regras de negócio da aplicação. 

Mais informação em menos cliques; código de cores já testados pela neurociência (vermelho: quente ou perigo, amarelo: atenção; azul: frio ou sob controle.

**d)	Ajuda e documentação**

A interface será intuitiva para que o usuário tenha uma melhor experiência e liberdade em usar o sistema, com balões explicativos onde necessário.

As cores da plataforma e a interface amigável reduzirão as dúvidas. Questões mais elaboradas poderão aparecer na forma de “pílulas de informação”.

Residualmente, pode ser utilizado o benchmarking de novos menus de ajuda de fintechs e outras ferramentas.

## VI - Tecnologias e Metodologias aplicadas
- Linguagem de programação Java;
- Linguagem de programação Java Script;
- Linguagem de marcação CSS, HTML;
- CSS framework bootstrap;
- Banco de Dados Oracle;
- Google TensorFlow;
- Método Scrum;

## VII - Cronograma e Backlog do Projeto (Em Ordem de Prioridade).
Abaixo apresenta-se o cronograma de entregas seguindo a metodologia de Engenharia de Software (camadas visual, controle e modelo com banco de dados).
As entregas futuras são o backlog do projeto (compilação de tarefas aprovadas, necessárias à conclusão do projeto);

Nessa linha, podem sofrer alterações em razão de adiantamento ou atraso devido a adaptações do desenvolvimento à realidade, aprovação do cliente e dificuldades encontradas.

## Sprint 00 (27 de setembro de 2020).
- Plano de Negócios com repositório de dados e documentação do projeto.
- Brainstorming 01: Quais valores podem ser gerados aos usuários do cliente? nova classificação do "bom pagador", o que oferecer pela inserção de dados? o que servir ao mercado dos *desbancarizados*? o que pode ser *monetizado*?
- Brainstorming 02: Quais as afinidades tecnológicas e funcionais de cada integrante?
- Brainstorming 03: Erros e Acertos do projeto passado, expectativas da nova equipe?
- Repositório de dados Github: <https://github.com/aerosdan/Valcode>"
 
## Sprint 01 (17 de outubro de 2020).
- VIEW: Login, cadastrar usuário, Dashboard v.1;
- CONTROLE: Cálculo de Score;
- MODEL: registra de interações/transações no banco de dados;
- BANCO DE DADOS: imporatação do dataset em banco de dados Oracle;
- BANCO DE DADOS: INÍCIO DDL;
- BANCO DE DADOS: INÍCIO DML;

## Sprint 02 (08 de novembro de 2020).
- VIEW: Cadastro de Transações e adaptações;
- CONTROLE: Cálculo de Score (TensorFlow);
- MODEL: registra dados de login e de interações/transações no banco de dados;
- BANCO DE DADOS: Modelagem para os itens acima;
## Sprint 03 (29 de novembro de 2020).
- VIEW: Apresenta informações e “pílulas”, importa dados de transações, adaptações acima;
- CONTROLE: Realiza cálculos e devolve informação para VIEW;
- CONTROLE: Conceder, estender ou revogar acesso aos meus dados
- MODEL: Busca dados para apresentação na VIEW, insere dados importados no banco;
- MODEL: registra dados de login;
- BANCO DE DADOS: Modelagem para os itens acima (novas tabelas);
- BANCO DE DADOS: Modelagem DCL;
## Apresentação Final e Avaliação de Soft Skills (06 de dezembro de 2020).
- VIEW: correções finais;
- CONTROLE: correções finais;
- MODEL: correções finais;
- BANCO DE DADOS: correções finais;
## Feira de Soluções (13 de dezembro de 2020).
