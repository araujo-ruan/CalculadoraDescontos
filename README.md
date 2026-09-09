# Calculadora de Descontos e Juros 📊

Aplicação de console desenvolvida em Java para automação de cálculos financeiros essenciais (juros compostos, juros simples e descontos), construída como projeto prático do **Módulo 0 (Semana 6)** da trilha de Engenharia de Software Back-end Java.

---

## 🎯 Contexto e Regra de Negócio

No planejamento financeiro e contábil, a projeção precisa do valor do dinheiro no tempo é fundamental para análise de viabilidade, investimentos e amortizações. Esta aplicação resolve o cálculo de rentabilidade acumulada a partir do capital inicial, taxa de juros periódica e prazo em meses, simulando operações financeiras reais diretamente pelo terminal.

Fórmula aplicada para o cálculo de juros compostos:
$$M = C \times (1 + i)^t$$

Onde:
* **$M$**: Montante final acumulado
* **$C$**: Capital inicial investido
* **$i$**: Taxa de juros por período (em taxa decimal)
* **$t$**: Tempo/período decorrido (em meses)

---

## 🛠️ Tecnologias e Decisões Técnicas

* **Java 21+**: Linguagem fortemente tipada e compilada utilizada como base da aplicação.
* **`java.util.Scanner`**: Captura e parsing dos dados de entrada fornecidos pelo usuário via console.
* **`java.lang.Math.pow`**: Processamento exponencial com precisão numérica.
* **Gerenciamento de Recursos**: Encerramento explícito do fluxo de I/O (`scanner.close()`) para prevenção de *resource leak*.
* **Controle de Versão**: Histórico padronizado utilizando a convenção **Conventional Commits** (`feat:`, `docs:`, `fix:`).

---

## 🚀 Como Executar Localmente

### Pré-requisitos
* Java Development Kit (JDK 21 ou superior instalado)
* Git configurado

### Execução via Terminal

1. Clone o repositório:
```bash
git clone [https://github.com/araujo-ruan/CalculadoraDescontos.git](https://github.com/araujo-ruan/CalculadoraDescontos.git)
