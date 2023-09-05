# SindicatoNutricionistas
Com o sucesso do projeto anterior, agora o Sindicato de Nutricionistas se interessa em um projeto de software para os consultórios dos nutricionistas associados. O software, a princípio, será desktop. Neste momento, serão feitas provas de conceito sem o uso de banco de dados. Com a aprovação do cliente, esse recurso poderá ser adicionado no futuro.

O software deve permitir a inclusão e exclusão de registros de consulta. Para cada consulta, informam-se o nome do paciente, o CPF, o telefone, a idade e a data da consulta. Por fim, há uma marcação indicando se essa pessoa já é paciente ou não.
 
Ao registrar a consulta, esta aparecerá para o usuário listada em uma tabela na tela. Para excluir uma consulta, o usuário deve selecionar a linha na tabela e clicar no botão Excluir. Para o usuário atualizar uma consulta, ele deve selecionar uma linha na tabela e marcar que a consulta já foi realizada. Além disso, pode informar, em texto, o que foi receitado ao paciente.
 
Todas as operações acontecerão sob listas em memória.
 
Atividade
Crie um projeto Java no NetBeans e implemente o sistema, que contará com as seguintes telas:
 
Tela inicial, com a listagem de todas as consultas cadastradas em memória.
 

Descrição: Wireframe de tela com o título “Boas-vindas ao sistema de agendamento” e uma tabela abaixo, contendo as colunas “Paciente”, “CPF”, “Telefone”, “Data”, “Já era paciente?” e “Consulta Realizada”. Alguns dados estão na tabela apenas para ilustração. Abaixo, há os botões “Nova Consulta”, “Excluir Consulta” e “Finalizar Consulta”. Clique para obter mais opções
 Figura 1 – Tela inicial
Fonte: Senac EAD (2022)
 
O botão Nova Consulta leva à tela de cadastro de consulta. O botão Excluir Consulta exclui da lista o registro que estiver selecionado na tabela. O botão Finalizar Consulta leva à tela Detalhes da Consulta. Quando houver alguma ação de inclusão, exclusão ou finalização de consulta, a tabela sempre deve ser atualizada.
 
Tela de cadastro da consulta. 

Descrição: Wireframe de tela com o título “Cadastrar Consulta” e o rótulo “Nome do(a) Paciente”, seguido, à direita, de um campo de entrada de texto. Abaixo, há o rótulo “Telefone”, seguido, à direita, de um campo de entrada de texto, o rótulo “CPF”, seguido, à direita, de um campo de entrada de texto, e o rótulo “Data da Consulta”, seguido, à direita, de um campo de entrada de texto. Abaixo, há uma checkbox com o rótulo “Já é paciente”. Ainda mais abaixo, há o botão “Cadastrar”. Clique para obter mais opções
 Figura 2 – Cadastrar consulta
Fonte: Senac EAD (2022)
 
Essa tela deve:
 
Validar formato de CPF
Validar formato de data
Validar formato de telefone
Não permitir cadastro sem informar nome, CPF, telefone e data da consulta
 
Ao clicar em Cadastrar, deve-se incluir novo registro na lista em memória e fechar a janela.
 
Tela de detalhes e finalização da consulta.
 
Descrição: Wireframe de tela com o título “Detalhes da Consulta”. Abaixo, há uma checkbox desativada com o rótulo “Consulta Realizada”. Abaixo, há o rótulo “Receita e observações”, seguido de um campo largo de texto. No rodapé, há o botão “Finalizar”.
 Figura 3 – Detalhes e finalização da consulta
Fonte: Senac EAD (2022)
 
Ao clicar no botão Finalizar, essa tela deve tornar-se visível. Será necessário um atributo na classe dessa tela para que você possa repassar a informação de qual consulta está selecionada e, neste caso, preencher esse atributo antes ou logo após abrir a janela.
 
Nessa tela, a checkbox Consulta Realizada deve ser marcada automaticamente, se a consulta já está como realizada, e não ficar disponível para o usuário alterar (modo enabled falso).
 
O campo Receita e observações é de texto livre. Nele, o nutricionista pode informar o histórico da consulta, por exemplo.
 
O botão Finalizar deve ficar visível apenas se a consulta ainda não foi realizada. Quando clicado, registrará o texto digitado na consulta, atualizando-a para “já realizada”. Não se deve permitir a finalização sem um texto digitado na caixa de observações.
 
Crie as classes necessárias para a implementação dessas regras. Toda a aplicação deve usar uma estrutura de dados em memória para seu funcionamento. Observe o uso de tratamento de exceção para evitar quebra do programa.
 
Entrega
No espaço dedicado às entregas da atividade, envie um arquivo compactado (ZIP, RAR ou 7z) contendo todos os projetos NetBeans criados para esta.
 
Dica de leitura
Para esta atividade, leia os seguintes materiais:
 
Interface desktop: construção de interface de usuário, manipulação de eventos, uso de controles, manipulação de janelas, construção de formulários e listagens (parte 1)
Interface desktop: construção de interface de usuário, manipulação de eventos, uso de controles, manipulação de janelas, construção de formulários e listagens (parte 2)
Validações de formulário: funções da linguagem, formatação de dados
Tratamento de exceções em linguagem de programação: comandos, classes, aplicabilidade
Estrutura de dados: sintaxe, bibliotecas de linguagem e aplicabilidade
 
Avaliação
Nesta atividade, você será avaliado no seguinte indicador:
 
Programa eventos e validações de interface conforme requisitos do sistema e de acordo com recursos da linguagem de programação.
