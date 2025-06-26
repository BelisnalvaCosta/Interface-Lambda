# Interface-Lambda

# 🎓 Conceito de Interface em Java

📘 O que é uma interface? [^1]

Em Java, uma interface é como um contrato que diz:

“Toda classe que implementar esta interface deve obrigatoriamente criar os métodos definidos nela.”
Pense na interface como um molde ou esqueleto de comportamento. Ela não implementa lógica, apenas define o que as classes devem fazer.

🧪 Exemplo real usado:

´´´´

interface FiguraGeometrica {
    double calcularArea();
}

´´´´

Ela define que toda figura geométrica (quadrado, retângulo, círculo, etc.) deve saber calcular sua área.

 Ou seja, qualquer classe que implementar FiguraGeometrica será obrigada a escrever o método calcularArea().

🧱 Classe implementando a interface:

´´´´

class Quadrado implements FiguraGeometrica {
    public double calcularArea() {
        return lado * lado;
    }
}

´´´´

✅ Benefícios:

Garante padronização do código.
Permite usar polimorfismo: posso guardar qualquer figura geométrica numa variável do tipo FiguraGeometrica.
Se o sistema crescer, é fácil adicionar novas figuras, mantendo o padrão.

****************************************************************************************************************************************

# 🧠 Conceito de Lambda em Java

📘 O que é uma expressão Lambda?

Uma expressão lambda em Java é uma forma mais curta e direta de implementar interfaces funcionais (interfaces que têm apenas um único método).

É como dizer:

“Quero passar um comportamento, uma ação, sem criar uma classe inteira para isso.”

🧪 Exemplo real usado:

No segundo código, em vez de criar uma classe para cada tipo de produto (Alimentação, Saúde, etc.), foi usado lambda:

ProdutoTributavel alimentacao = (preco) -> preco * 0.01;
Aqui, ProdutoTributavel é uma interface funcional:

´´´´

interface ProdutoTributavel {
    double calcularImposto(double preco);
}

´´´´

O lambda (preco) -> preco * 0.01 substitui a criação de uma classe anônima e já define o comportamento diretamente.

✅ Vantagens:

·      Menos código para tarefas simples.

·      Código mais limpo e legível.

·      Ideal quando se quer apenas executar uma lógica rápida, como cálculos, filtros, ordenações etc.


![image](https://github.com/user-attachments/assets/34e68547-bec9-4eec-b7a6-215079cb79b3)


Conclusão:

“Todos nós como desenvolvedores iniciantes ou veteranos, devem usar interfaces para criar estruturas sólidas, reutilizáveis e organizadas no código.

Com o tempo, para tarefas específicas e pontuais, poderá aplicar lambda expressions para reduzir o código e deixá-lo mais elegante, mantendo a clareza.

Ambos são ferramentas poderosas da linguagem Java, fundamentais para escrever código profissional, robusto e moderno.”

[^1]: Exercício do Bootcamp Santander Back-end Java.
