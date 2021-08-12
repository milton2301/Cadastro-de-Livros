
public class Livro {
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }
    
    
    
    
    @Override
    public String toString(){
        return  "-"+this.titulo+"; "+this.autor+"; "+this.ano+".";
    }
    
    public String getTitulo() {
        return titulo;
    }

    void setTitulo(String titulo) {
          this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    void setAutor(String autor) {
            this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    void setAno(int ano) {
            this.ano = ano;
    }
       
}
