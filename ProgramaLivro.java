/*
 Digitar o nome do título, autor, gênero, ano e preço
O programa deverá retornar todas as informações digitadas e informar se o livro terá desconto
 */
import java.util.Scanner;

public class ProgramaLivro {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Livro l1 = new Livro();

        System.out.println("Digite o Título do livro: ");
        l1.setTitulo(ler.nextLine());
        System.out.println("Digite o nome do Autor do livro: ");
        l1.setAutor(ler.nextLine());
        System.out.println("Digite o Gênero do livro: ");
        l1.setGenero(ler.nextLine());
        System.out.println("Digite o ano de lançamento do livro: ");
        l1.setAno(ler.nextInt());
        System.out.println("Digite o Preço do livro: ");
        l1.setPreco(ler.nextDouble());

        System.out.println("== Dados do Livro ==");
        System.out.println("Titulo: " + l1.getTitulo());
        System.out.println("Autor: " + l1.getAutor());
        System.out.println("Genero: " + l1.getGenero());
        System.out.println("Ano de lançamento: " + l1.getAno());
        System.out.println("preço: " + l1.getPreco());
        System.out.println(l1.vereficarPreco());
        
        
    }    
}
