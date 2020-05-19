package prueba;

public class Main {

	public static void main(String[] args) {
		Pokemon pokemon1 = new Pokemon("Charmander", 100, 20);
		Pokemon pokemon2 = new Pokemon("Bulbasur", 100, 20);

		System.out.println(pokemon1);
		System.out.println(pokemon2);

		Combate combate = new Combate();

		combate.getAttack1(pokemon1, pokemon2);
		System.out.println(pokemon2);

		combate.getAttack2(pokemon1, pokemon2);
		System.out.println(pokemon1);
		
		combate.getAttack2(pokemon1, pokemon2);
		System.out.println(pokemon1);
		
		combate.getAttack2(pokemon1, pokemon2);
		System.out.println(pokemon1);
		
		combate.getAttack2(pokemon1, pokemon2);
		System.out.println(pokemon1);
		
		combate.getAttack2(pokemon1, pokemon2);
		System.out.println(pokemon1);
		
		

	}

}
