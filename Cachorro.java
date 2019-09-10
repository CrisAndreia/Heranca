# Heranca
Projeto de Programação Orientada a Objeto

import java.util.Scanner;

class Cachorro extends Animal{
  private Pelo p;

	public Cachorro(){
    
	}
	@Override
	public void fazerBarulho(){
		System.out.println("au au");
	}

  public Pelo getPelo(){
    return this.p;
  }

  public void peloCachorro(){
    Scanner s = new Scanner(System.in);
    System.out.println("Cor do cão:");
    System.out.println("1 - claro");
    System.out.println("2 - médio");
    System.out.println("3 - escuro");
    int cor = s.nextInt();

    System.out.println("Se limpo digite 0");
    System.out.println("Se sujo digite 1");
    int b = s.nextInt();
    boolean limpo;

    if(b == 0)
      limpo = true;
    else if(b == false)
      limpo = false;
    Pelo pelo = new Pelo(cor, limpo);
  }
}
