# PROJETO INTEGRADOR 2020.2 - FATEC & SPC BRASIL - CADASTRO POSITIVO.
#### (ENTREGA 03 / SPRINT 02 - 08/nov/2020 - EQUIPE VALCODE)
#### I - FRONT-END
#### 1) Tela de Entrada - dashboard:
![TELA ENTRADA](https://github.com/aerosdan/Valcode/blob/sprint02-nov-08/Imagens/TELA-00-ENTRADA-DASH.jpg?raw=true "Title")
Tela com a situação atual (dados -> informação)
Objetivo: Fidelização
#### 2) Minha Conta - permissões de acesso aos meus dados:
![permissões](https://github.com/aerosdan/Valcode/blob/sprint02-nov-08/Imagens/TELA-02-MINHA-CONTA-PERMISSOES.jpg?raw=true "Permissões")
Empoderamento do usuário
Objetivo 01: Fidelização
Quanto mais ele permite, mais pontos ganha
Objetivo 02: Monetização, pela qualidade dos dados a serem consultados;
Objetivo 03: Fidelização do CONSULENTE/CONCEDENTE de crédito;
Objetivo 04: Gamificação para o usuário

#### 3) Meus Pontos - Minhas Trocas:
![Meus Pontos](https://github.com/aerosdan/Valcode/blob/sprint02-nov-08/Imagens/TELA-03-MEUS-PONTOS%2BTROCAS.jpg?raw=true "Title")
Vantagens ao Usuário
Objetivo 01: Fidelização
Objetivo 02: Gamificação
Objetivo 03: Monetização, podendo conectar aqui um programa de fidelidade existente

#### 4) Minhas Trocas - Educação Financeira:
![Educa_Finan](https://github.com/aerosdan/Valcode/blob/sprint02-nov-08/Imagens/TELA-04-EDUCACAO-FINANCEIRA.jpg?raw=true "Title")
Educação Financeira
Objetivo 01: Fidelização
Objetivo 02: Gamificação
Objetivo 03: Monetização, podendo conectar aqui uma legaltech para intermediar acordos, "feirão" para limpar nome etc.

#### 5) DESBANCARIZADOS - Criação de movimentos para microcrédito:
![Desbancarizados](https://github.com/aerosdan/Valcode/blob/sprint02-nov-08/Imagens/TELA-05-DESBANCARIZADO.jpg?raw=true"Desbancarizados")
Certificação cruzada para capturar dados atualmente inexistentes, fortalecer laços nessa faixa de comércio, possibilitar microcrédito em estabelecimentos nesses locais

Objetivo 01: Atração pela eliminação de planilha e carnês em papel
Objetivo 02: Impulsionar a geração de dados nesse segmento do mercado; essas transações já existem na vida real, porém, não são capturadas.
Objetivo 03: Compartilhar risco com a rede, que se auto-avaliará (tal como fazem o passageiro do aplicativo e o motorista; comprador e vendedor nos sites de intermediação de venda etc.)
Objetivo 03:  segurança ao próximo estabelecimento, para decidir se pode vender "fiado" para pessoas de certa comunidade (Ex: o dentista atende uma emergência naquele bairro e saberá se tal paciente está pagando "em dia" o crediário do sapado e da papelaria (material escolar)
.Objetivo 04: Fidelização, já que o desbancarizado poderá usufruir dos mesmos benefícios dos demais (exceto para créditos maiores)

## II - DIAGRAMA DE CASO DE USO
![Casos-de-Uso](https://github.com/aerosdan/Valcode/blob/sprint02-nov-08/Imagens/DIAGRAMA-CASOS-DE-USO-v.2.jpg?raw=true"Casos-de-Uso")

## III - ALCANCE DA FERRAMENTA
![alcance](https://github.com/aerosdan/Valcode/blob/sprint02-nov-08/Imagens/Alcance_escopo_valscore-1.0.jpg?raw=true"Casos-de-Uso")



## VI - Tecnologias e Metodologias aplicadas
- Linguagem de programação Java;
- Linguagem de programação Java Script;
- Linguagem de marcação CSS, HTML;
- CSS framework bootstrap;
- Banco de Dados Oracle;
- Método Scrum;

## VII - Cronograma e Backlog do Projeto (Em Ordem de Prioridade).
Abaixo apresenta-se o cronograma de entregas seguindo a metodologia de Engenharia de Software (camadas visual, controle e modelo com banco de dados).
As entregas futuras são o backlog do projeto (compilação de tarefas aprovadas, necessárias à conclusão do projeto);

Nessa linha, podem sofrer alterações em razão de adiantamento ou atraso devido a adaptações do desenvolvimento à realidade, aprovação do cliente e dificuldades encontradas.

#### Sprint 00 (27 de setembro de 2020).
- Plano de Negócios com repositório de dados e documentação do projeto.
- Brainstorming 01: Quais valores podem ser gerados aos usuários do cliente? nova classificação do "bom pagador", o que oferecer pela inserção de dados? o que servir ao mercado dos *desbancarizados*? o que pode ser *monetizado*?
- Brainstorming 02: Quais as afinidades tecnológicas e funcionais de cada integrante?
- Brainstorming 03: Erros e Acertos do projeto passado, expectativas da nova equipe?
- Repositório de dados Github: <https://github.com/aerosdan/Valcode>"
 
#### Sprint 01 (17 de outubro de 2020).
- VIEW: Login, cadastrar usuário, Dashboard v.1;
- CONTROLE: Cálculo de Score;
- MODEL: registro de interações/transações no banco de dados;
- BANCO DE DADOS: imporatação do dataset em banco de dados Oracle;
- BANCO DE DADOS: INÍCIO DDL;
- BANCO DE DADOS: INÍCIO DML;

## Sprint 02 (08 de novembro de 2020).
- VIEW: Tela de permissões de acesso a dados do usuário;
- VIEW: Tela de sumário de pontos e trocas possíveis;
- VIEW: Tela de Educação Financeira e Auxílio ;
- VIEW: Cadastro de Transações para Desbancarizados;
- CONTROLE: 
- MODEL: registra dados de login e de interações/transações no banco de dados;
- BANCO DE DADOS: Modelagem para os itens acima;
#### Sprint 03 (29 de novembro de 2020).
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
