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
        System.out.println(" 2 [+] AVALIACAO");
        System.out.println(" 3 [>] LISTAGEM");
        System.out.println(" 4 [>] CONSULTA ATLETA");
        System.out.println(" 5 [X] ATLETA");
        System.out.println(" 0 [X] SAIR");
        System.out.println("---------------");
        System.out.print("Opcao: ");
        op = read.nextInt();

         switch(op) {
          case 1: 
            this.incluirNovoAtleta();
          break;

          case 2: 
            System.out.println("\nfuncionalidade em desenvolvimento...");
          break;
          
          case 3: 
            this.listarAtletas();
          break;

          case 4: 
            System.out.println("\nfuncionalidade em desenvolvimento...");
          break;

          case 5: 
            this.removerAtleta();
          break;

          case 0: 
            sair = true;
          break;

          default:
            System.out.println("\nOpção inválida! \nEscolha novamente.");
        }
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

 private void removerAtleta(){
   
   if(matriculas.size() > 0) {
     System.out.println("\nRemover atleta:");
      this.listarAtletas();

     System.out.print("\nSelecione: ");
      int posicao = read.nextInt();

      matriculas.remove(posicao - 1);

     System.out.println("\nAtleta removido!");
    }
   
   else{
     System.out.println("\nNão há atletas para remoção!");
   }
  }
 
}