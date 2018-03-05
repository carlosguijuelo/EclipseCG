package factorial;

public class Factorial {
	public static void main(String[] args){
		System.out.println(Factorial.factorial(3));   
    }
    public static int factorial(int numero){
        int factorial = 1;
        while (numero!= 0){
            factorial = factorial * numero;
            numero--;
        }
        return factorial;
    }
}
