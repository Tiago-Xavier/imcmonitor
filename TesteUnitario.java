class TesteUnitario {

  public void ExecutarAll() throws Exception {
    this.testeNome();
    this.testeIdade();
  } 

  public void testeNome() throws Exception{
    
    Atleta atleta = new Atleta();
    String nome;

    nome = "ABCD";
    atleta.setNome(nome);
    
      if(!atleta.getNome().equals(nome))
        throw new Exception("[Erro] falha manipulando NOME valor " + nome);

    nome = " ";
    atleta.setNome(nome);
    
      if(!atleta.getNome().equals(nome))
        throw new Exception("[Erro] falha manipulando NOME valor " + nome);

    nome = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    atleta.setNome(nome);
    
      if(!atleta.getNome().equals(nome))
        throw new Exception("[Erro] falha manipulando NOME valor " + nome);

  }

  public void testeIdade() throws Exception{

    Atleta atleta = new Atleta();
    int idade;

    idade = 10;
    atleta.setIdade(idade);

      if(atleta.getIdade() != idade)
        throw new Exception("[Erro] falha manipulando IDADE valor " + idade + "esta retornando " + atleta.getIdade());

    idade = 99999;
    atleta.setIdade(idade);

      if(atleta.getIdade() != idade)
        throw new Exception("[Erro] falha manipulando IDADE valor " + idade + "esta retornando " + atleta.getIdade());

    idade = -9;
    atleta.setIdade(idade);

      if(atleta.getIdade() != idade)
        throw new Exception("[Erro] falha manipulando IDADE valor " + idade + "esta retornando " + atleta.getIdade());

    idade = 0;
    atleta.setIdade(idade);

      if(atleta.getIdade() != idade)
        throw new Exception("[Erro] falha manipulando IDADE valor " + idade + "esta retornando " + atleta.getIdade());
/*
    idade = 0.9;
    atleta.setIdade(idade);

      if(atleta.getIdade() != idade)
        throw new Exception("[Erro] falha manipulando IDADE valor " + idade + "esta retornando " + atleta.getIdade());
*/       
  }
}