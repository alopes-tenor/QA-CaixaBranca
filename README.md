# QA-CaixaBranca

Este repositório armazena o código de um arquivo que foi testado utilizando a técnica caixa-branca, afim de verificar o funcionamento interno do sistema.

## O que é Teste de Caixa Branca?

Resumidamente, o teste de caixa branca tem o objetivo de testar o funcionamento interno do sistema. Diferentemente do teste de caixa-preta, o tester possui acesso ao código fonte, podendo entender a estrutura interna do programa.

## Possíveis erros encontrados no código

Levando em consideração os pontos recomendados a serem observados no teste de caixa branca, é possível pontuar:

1. **Ausência de documentação do código**
A documentação do código, incluindo os métodos criados e variáveis atribuídas, é uma boa prática dentro da programação. Sem esta prática, a manutenção do código fica inviável para qualquer desenvolvedor, aumentando a possibilidade de erros lógicos.

2. **Utilização de modificadores de acesso**
Durante a leitura do código, é possível notar que há classes e métodos com acesso Public, o que significa que qualquer objeto ou método dentro do mesmo projeto tem acesso a ele. O mais correto, é classificar classes e métodos como private, afim de garantir que apenas objetos dentro da classe específica poderão acessá-los.

3. **Inexistência do tratamento de exceções**
Normalmente, após utilizar o Try, no Catch é realizado um tratamento para as possíveis exceções que possam vir a ocorrer no código, para que as mesmas sejam notificadas ao desenvolvedor, afim de garantir o conhecimento de todos os possíveis cenários durante a execução do código.
Neste caso, o catch está como: ***Catch (exception e) {}***, demonstrando que caso haja uma exceção, o código seguirá com o script normalmente, o que não é uma boa prática.
