import java.util.Scanner;

class TelaConsoleMenu{

  Scanner read = new Scanner(System.in);
  Atleta atletaAcademia = new Atleta();

public void executar(){

  boolean sair = false;
  int op;

  while(!sair){

    System.out.println("\n**** MENU ****");
        System.out.println(" 1 [+] ATLETA");
        System.out.println("11 [>] LISTAGEM");
        System.out.println(" 0 [X] SAIR");
        System.out.println("---------------");
        System.out.println("Opcao: ");
        op = read.nextInt();

        if(op == 1) {
          this.incluirNovoAtleta();
        }

        if(op == 11) {
          this.listarAtletas();
        }

        if(op == 0) {
          sair = true;
        }
  }

  System.out.println("\nfim, telaconsolemenu!");
}

private void incluirNovoAtleta(){

  System.out.println("\nNovo Atleta");

    System.out.print(" + Nome: ");
     String nome = read.next();

    System.out.print(" + Idade: ");
    int idade = read.nextInt();

    Atleta novo = new Atleta();
      novo.setNome(nome);
      novo.setIdade(idade);

    atletaAcademia = novo;
}

private void listarAtletas(){

  System.out.println("\nListagem de atletas:");
  System.out.println("- "+ atletaAcademia.getNome() + "(" + atletaAcademia.getIdade() +")");
  
}

}