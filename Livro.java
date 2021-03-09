/*
 Classe Livro com os seguintes atributos:
Título do tipo texto público;
Autor do tipo texto público;
Gênero do tipo texto privado;
Ano do tipo inteiro privado;
Preço do tipo real privado;
Métodos acessores
Método para verificarPreco
Métodos para verificar se tem desconto de 20% quando o valor do livro for maior do que 80,00
 */
public class Livro {

    String titulo, autor;
    private String genero;
    private int ano;
    private double preco;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preço) {
        this.preco = preco;
    }
    
    String vereficarPreco() {
        double precoFinal = 0;
        String resposta;
        
        if (this.preco > 80) {
            //  precoFinal = preco - (preco * 0.2);
            precoFinal = this.preco * 0.8;
            resposta = "O valor final é: " + precoFinal;
        } else {
            resposta = "Este livro não tem desconto";
        }
        return resposta;
    }
}
