import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

//        Instanciação dos objetos

        Filme meuFilme = new Filme();
        Filme outroFilme = new Filme();
        Serie lost = new Serie();
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        Episodio episodio = new Episodio();

//        Definição dos atributos de cada objeto

        //Filmes 1
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(false);

        //metodo
        meuFilme.exibirFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações do filme: " + meuFilme.pegaMedia());
        filtro.filtra(meuFilme);
        System.out.println("");

        //Filmes 2
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);
        outroFilme.setIncluidoNoPlano(true);

        //metodo
        outroFilme.exibirFichaTecnica();
        outroFilme.avalia(9);
        outroFilme.avalia(8);
        outroFilme.avalia(9);
        System.out.println("total de avaliações: " + outroFilme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações do filme: " + outroFilme.pegaMedia());
        filtro.filtra(outroFilme);
        System.out.println("");

        //Series
        lost.setNome("lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalAvaliacoes(300);

        //metodo
        lost.exibirFichaTecnica();
        filtro.filtra(lost);
        filtro.filtra(episodio);
        System.out.println("");

        //Calculadora
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);

        System.out.println("\nTempo total dos itens: " + calculadora.getTempoTotal());

    }
}