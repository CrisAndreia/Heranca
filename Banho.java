# Heranca
Projeto de Programação Orientada a Objeto

import java.util.*;
import java.util.Scanner;
class Banho{
  ArrayList<Shampoo> shampoo;


  public Banho(){
    this.shampoo = new ArrayList<Shampoo>();
    Shampoo shampoo1 = new Shampoo("Shampoo para pelos claros",1);
    Shampoo shampoo2 = new Shampoo("Shampoo para pelos médios",2);
    Shampoo shampoo3 = new Shampoo("Shampoo para pelos escuros",3);
  }

  public void lavar(Cachorro c){
    Pelo pelo = c.getPelo();
    int cor = pelo.getCor();
    boolean limpo = pelo.getLimpo();

    if(limpo==true){
      System.out.println("Cão limpo! :)");
    }
    else
      if(cor==1){
        System.out.println(this.ArrayList.shampoo1);
      }

      if(cor==2){
        System.out.println(shampoo2);
      }

      if(cor==3){
        System.out.println(shampoo3);
      }
 	} 
}
