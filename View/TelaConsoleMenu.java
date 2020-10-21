import java.util.Scanner;
import java.util.ArrayList;

class TelaConsoleMenu{

  Scanner read = new Scanner(System.in);
  ArrayList<Atleta> matriculas = new ArrayList<Atleta>();

 public void executar(){

  boolean sair = false;
  int op;

  while(!sair){

    System.out.println("\n**** MENU ****");
        System.out.println(" 1 [+] ATLETA");
        System.out.println("11 [>] LISTAGEM");
        System.out.println(" 0 [X] SAIR");
        System.out.println("---------------");
        System.out.print("Opcao: ");
        op = read.nextInt();

        switch(op) {
          case 1: 
            this.incluirNovoAtleta();
          break;

          case 11: 
            this.listarAtletas();
          break;

          case 0: 
            sair = true;
          break;

          // defaul: será uma Exception
        }
      
      /*
        if(op == 1) {
          this.incluirNovoAtleta();
        }

        if(op == 11) {
          this.listarAtletas();
        }

        if(op == 0) {
          sair = true;
        } */
  }

  System.out.println("\nMenu encerrado!");
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
      matriculas.add(novo);

    System.out.println("\nAtleta inserido! \n");
 }

 private void listarAtletas(){

  System.out.println("\nListagem de atletas:");
  
  if(matriculas.size() > 0){
   int i = 1;
    for(Atleta athlete : matriculas){
      System.out.println(i++ +"- " + athlete.getNome() + "("+ athlete.getIdade() + ")");
    }  
  } 
  
  else {
    System.out.println("Nenhum atleta matriculado!");
  }
  
 }

}