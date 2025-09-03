# 🎬 ScreenMatch

Um projeto em **Java** criado para treinar conceitos de **Programação Orientada a Objetos (POO)** como **herança, polimorfismo, interfaces e encapsulamento**.

---

## 🚀 Tecnologias
- Java 21
- IntelliJ IDEA

---

## 📂 Estrutura do Projeto
- `modelos/` → Contém as classes principais (`Filme`, `Serie`, `Titulo`, `Episodio`...)
- `calculos/` → Classes de cálculo e filtros (`CalculadoraDeTempo`, `FiltroRecomendacao`, `Classificavel`)
- `Principal.java` → Classe de execução, onde os objetos são instanciados e os métodos testados.

---

## ✨ Funcionalidades
- Cadastrar filmes e séries com título, duração e ano de lançamento.
- Calcular a duração total de maratonas.
- Avaliar títulos e obter média das avaliações.
- Filtrar recomendações com base em classificações.
- Trabalhar com polimorfismo através da interface `Classificavel`.

---

## 📸 Exemplo de Uso
```java
Filme meuFilme = new Filme();
meuFilme.setNome("O poderoso chefão");
meuFilme.setAnoDeLancamento(1970);
meuFilme.setDuracaoEmMinutos(180);
meuFilme.avalia(10);
meuFilme.avalia(9);

FiltroRecomendacao filtro = new FiltroRecomendacao();
filtro.filtra(meuFilme);