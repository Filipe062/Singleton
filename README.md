# 📘 Padrões de Projeto em Java: Singleton, Strategy e Facade

Este repositório/documento apresenta três padrões de projeto fundamentais utilizados no desenvolvimento de software com Java:

* Singleton
* Strategy
* Facade

Esses padrões ajudam a escrever código mais organizado, reutilizável e de fácil manutenção.

---

## 🔒 Singleton

### 📌 O que é?

O padrão Singleton garante que uma classe tenha **apenas uma única instância** durante toda a execução da aplicação.

### 🎯 Quando usar?

* Conexão com banco de dados
* Configurações globais
* Logs

### 💻 Exemplo

```java
public class Singleton {

    private static final Singleton INSTANCIA = new Singleton();

    private Singleton() {}

    public static Singleton getInstancia() {
        return INSTANCIA;
    }
}
```

### ✅ Vantagens

* Controle global de acesso
* Evita múltiplas instâncias desnecessárias

### ⚠️ Desvantagens

* Pode dificultar testes
* Pode criar alto acoplamento

---

## 🔄 Strategy

### 📌 O que é?

O padrão Strategy permite definir **diferentes algoritmos ou comportamentos** e alterná-los em tempo de execução.

### 🎯 Quando usar?

* Múltiplas formas de executar uma ação
* Evitar muitos `if/else`
* Tornar o código flexível

### 💻 Exemplo

```java
public interface PagamentoStrategy {
    void pagar(double valor);
}
```

```java
public class PixPagamento implements PagamentoStrategy {
    public void pagar(double valor) {
        System.out.println("Pagamento via PIX: " + valor);
    }
}
```

```java
public class PagamentoContext {

    private PagamentoStrategy strategy;

    public void setStrategy(PagamentoStrategy strategy) {
        this.strategy = strategy;
    }

    public void pagar(double valor) {
        strategy.pagar(valor);
    }
}
```

### ✅ Vantagens

* Código limpo e organizado
* Fácil de adicionar novas estratégias
* Segue o princípio aberto/fechado (OCP)

### ⚠️ Desvantagens

* Aumenta o número de classes
* Pode ser mais complexo para iniciantes

---

## 🧱 Facade

### 📌 O que é?

O padrão Facade fornece uma **interface simplificada** para um conjunto de classes ou subsistemas complexos.

### 🎯 Quando usar?

* Sistemas complexos
* Muitas dependências entre classes
* Necessidade de simplificar o uso

### 💻 Exemplo

```java
class Estoque {
    void verificar() {
        System.out.println("Estoque verificado");
    }
}

class Pagamento {
    void processar() {
        System.out.println("Pagamento processado");
    }
}

class Envio {
    void enviar() {
        System.out.println("Produto enviado");
    }
}
```

```java
public class LojaFacade {

    private Estoque estoque = new Estoque();
    private Pagamento pagamento = new Pagamento();
    private Envio envio = new Envio();

    public void realizarCompra() {
        estoque.verificar();
        pagamento.processar();
        envio.enviar();
    }
}
```

### ✅ Vantagens

* Simplifica o uso do sistema
* Reduz acoplamento
* Esconde complexidade

### ⚠️ Desvantagens

* Pode esconder problemas de design
* Não reduz a complexidade interna

---

## ⚖️ Comparação rápida

| Padrão    | Objetivo                         | Quando usar                           |
| --------- | -------------------------------- | ------------------------------------- |
| Singleton | Garantir uma única instância     | Configuração, conexão, logs           |
| Strategy  | Trocar comportamentos facilmente | Pagamentos, cálculos, regras          |
| Facade    | Simplificar sistemas complexos   | APIs, serviços, integração de módulos |

---

## 🚀 Conclusão

Esses três padrões são essenciais para qualquer desenvolvedor que deseja evoluir no desenvolvimento backend:

* **Singleton** → controle de instância
* **Strategy** → flexibilidade de comportamento
* **Facade** → simplificação de uso

Dominar esses conceitos ajuda a escrever código mais limpo, escalável e profissional.

---

## 👨‍💻 Autor

Luiz Filipe Ferreira Gonçalves
Desenvolvedor em formação | Java | React | Front-End & Back-End

---
