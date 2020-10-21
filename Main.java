class Main {
  public static void main(String[] args) throws Exception{

    //TesteSimples teste = new TesteSimples();
    TesteUnitario TU = new TesteUnitario();
    TU.ExecutarAll();

    TelaConsoleMenu menu = new TelaConsoleMenu();
    menu.executar();

    System.out.println("\nimcmonitor, fim!");
  }
}