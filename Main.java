public class Principal {

	public static void main(String[] args) {
		int soma=0;
		for(int i = 0; i < 10; i ++) {
			if((i % 2 != 0)&&(i % 3 == 0)) {
				soma+=i;
			}
		}
         System.out.println("Resultado = " +soma);
	}

}

