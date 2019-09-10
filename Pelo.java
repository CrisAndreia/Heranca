# Heranca
Projeto de Programação Orientada a Objeto

class Pelo extends Cachorro{
  private boolean limpo;
  private int cor;

	public Pelo(int cor, boolean limpo){
    this.cor = cor;
    this.limpo = limpo;
	}

  public int getCor(){
    return this.cor;
  }

  public boolean getLimpo(){
    return this.limpo;
  }

}
