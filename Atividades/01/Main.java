
public class Main {

	public static void main(String[] args) {
	
		Computador PC = new Computador(16, 1000, 8, 3.5);

        SistemaOperacional SO = new SistemaOperacional(PC);

        Programa prog1 = new Programa(10, 50,4, 200);
        SO.executarPrograma(prog1);
        System.out.println();

        Programa prog2 = new Programa(8, 1200,6, 2000);
        SO.executarPrograma(prog2);
        System.out.println();

        Programa prog3 = new Programa(20, 140,8, 20000);
        SO.executarPrograma(prog3);
        System.out.println();
	}

}
