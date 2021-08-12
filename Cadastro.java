import java.util.Scanner;
import java.util.ArrayList;

public class Cadastro {

    public static void main(String[] Args ){
    ArrayList <Livro> cad = new ArrayList();
    int op;
    
    do{
        System.out.println("+--------------------------+");
        System.out.println("|    Catálogo de Livros    |");
        System.out.println("+--------------------------+");
        System.out.println("| 1 - Cadastrar novo livro |");
        System.out.println("| 2 -  Ver todos os livros |");
        System.out.println("| 3 - Buscar livro         |");
        System.out.println("|                          |");
        System.out.println("| 0 - sair                 |");
        System.out.println("+--------------------------+");
        Scanner sc = new Scanner(System.in);
        op = sc.nextInt();
        sc.nextLine();
        switch(op){
            case 1:
                String titulo;
                String autor;
                int ano;
                    do{
                        System.out.println("Digite o titulo do livro: ");
                        titulo = sc.nextLine().toUpperCase();
                    }while(titulo.isEmpty());
                    do{
                        System.out.println("Nome do(s) autore(s) do livro:");
                        autor =sc.nextLine().toUpperCase();
                    }while(autor.isEmpty());
                    do{
                        System.out.println("Ano de publicação: ");
                        ano = sc.nextInt();
                        sc.nextLine();
                    }while(ano < 1500 || ano > 2020);
                    cad.add(new Livro(titulo,autor,ano));
                break;
            case 2:
                    for(Object mostrar : cad){
                        System.out.println(mostrar);
                    }
                break;
            case 3:
                String termo;
                System.out.println("Digite o termo que procura: ");
                termo = sc.nextLine().toUpperCase();
                for(Livro procura : cad){
                    if(procura.getAutor().contains(termo) || procura.getTitulo().contains(termo))
                        System.out.println(procura);
                }
                break;
            default :
                System.out.println("Opção inválida tente novamente!");
        }
    }while(op != 0);
    }
}
