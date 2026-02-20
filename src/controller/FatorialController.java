package controller;

public class FatorialController {
	
	public FatorialController(){
		super();
	}
	
	public int fatorial(int n) {
        // condição de parada. O fatorial de 1 é definido como 1. 
        // Quando n chega a 1, a função para de chamar a si mesma e retorna 1.
		if(n == 1) {
			return 1;
		}
		// O fatorial de n é o próprio n multiplicado pelo fatorial de n - 1.
		else {
			return n * fatorial(n - 1);
		}
	}
}