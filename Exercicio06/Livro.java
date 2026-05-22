package orientacaoaobjetos.Exercicio06;

public class Livro {
    private final int codigo;
    private String titulo;
    private String autor;
    private boolean disponivel;

    //método construtor
    public Livro(int codigo, String titulo, String autor, boolean disponivel){
        this.codigo = codigo; //this.codigo = atributo / codigo = parametro
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    //getters
    public int getCodigo(){
        return this.codigo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public boolean getDisponivel(){
        return this.disponivel;
    }

    //setters
    //obs: codigo nao tem setter por ser um atributo do tipo final
    //obs2: disponivel tambem nao tem setter por ja ter os metodos que alteram o valor
    public void setTitulo(String novoTitulo){
        this.titulo = novoTitulo;
    }

    public void setAutor(String novoAutor){
        this.autor = novoAutor;
    }

    public void emprestarLivro(){
        if(this.disponivel == true){
            System.out.println("O livro '" + this.titulo + "' foi emprestado.");
            this.disponivel = false;
        }
    }

    public void livroIndisponivel(){
        System.out.println("Este livro está indisponível. Volte novamente outra hora.");
    }

    public void devolverLivro(){
        if(this.disponivel == false){
            System.out.println("O livro '" + this.titulo + "' foi devolvido. Volte sempre!");
            this.disponivel = true;
        }
    }

    public void livroDisponivel(){
        System.out.println("Este livro ainda está disponível, não foi possível devolvê-lo");
    }

    public String disponibilidade(){
        if(this.disponivel == true){
            return "Disponível";
        } else {
            return "Já foi emprestado";
        }
    }

    @Override //KASANE TETO & MMJ MENTIONED??
    public String toString(){
        return this.codigo + " | " + this.titulo + ", de " + this.autor + " | Disponibilidade: " + disponibilidade();
    }
}
