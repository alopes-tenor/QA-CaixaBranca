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

# Grafo de fluxo

O grafo de fluxo é uma ferramenta usada para representar o fluxo de controle lógico. A partir do código e sua enumeração, foi criado o grafo de fluxo abaixo.

![Grafo de fluxo](https://github.com/alopes-tenor/QA-CaixaBranca/assets/83618366/05cdc02c-316e-4724-8788-cc73e7ff6bf1)

# Cálculo da complexidade ciclomática

A complexidade ciclomática corresponde ao número de regiões existente no grafo. Pode ser calculada pela fórmula 

*V(G)= E – N + 2.*

Em que:

V(G) = e a complexidade ciclomática.

G = representa o grafo de fluxo.

E = representa a quantidade de arestas no grafo.

N = representa a quantidade de nós no grafo.

Neste caso, E = 2 e  N = 3, logo a complexidade ciclomática tem valor de 

V(G)= 2 - 3 + 2 
V(G)= 2.

Portanto, temos 2 caminhos independentes para esse grafo.

# Caminhos independentes.

Caminho 1 = 1-2-3-4-5-9-11-12
Caminho 2 = 1-2-3-4-5-9-10-12
