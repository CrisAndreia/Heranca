/*
1) Criar mais cinco classes que extendam a classe Animal.ok
2) Criar duas classes que extendam a classe Cachorro.
3) Instanciar os objetos e mostrar o funcionamento.
*/
public class Main{
	public static void main(String[] args){

    System.out.println("Cor do cão:");
    System.out.println("1 - claro");
    System.out.println("2 - médio");
    System.out.println("3 - escuro");
    int cor;
    System.out.println("Se limpo digite 0");
    System.out.println("Se sujo digite 1");
    Pelo pelo = new Pelo();
    pelo=c.getPelo();

		Gato g = new Gato();
		Cachorro c = new Cachorro();

		//Animal animal = g;
		Animal animal = c;
		animal.fazerBarulho();
	}
}
/*String shampoo1 = "Shampoo para pelos claros";
String shampoo2 = "Shampoo para pelos médios";
String shampoo3 = "Shampoo para pelos escuros";*/
