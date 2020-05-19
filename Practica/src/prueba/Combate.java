package prueba;

public class Combate {

	
	//POKEMON 1 ATACA AL 2
	public void getAttack1(Pokemon pokemon1, Pokemon pokemon2) {

		if (pokemon1.ps <= 0) {//SI TIENE 0 o MENOS VIDA EL GANADOR ES POKEMON 2 SINO SIGUE ATACANDO

			System.out.println( "El ganador es: " + pokemon2.nombre);
		} else {
			int ataque1 = (pokemon2.ps - pokemon1.attack);
			System.out.println(pokemon1.nombre + " ataca a " + pokemon2.nombre);
			System.out.println(ataque1);
			pokemon2.setPs(ataque1);
			System.out.println(pokemon1.nombre + " ataca a " + pokemon2.nombre); 
		}
		
	}

	//POKEMON 2 ATACA AL 1
	public void getAttack2(Pokemon pokemon1, Pokemon pokemon2) {
		
		if (pokemon2.ps <= 0) {//SI TIENE 0 o MENOS VIDA EL GANADOR ES POKEMON 1 SINO SIGUE ATACANDO

			System.out.println( "El ganador es: " + pokemon1.nombre);
		} else {
		
		int ataque2 = (pokemon1.ps - pokemon2.attack);
		System.out.println(pokemon2.nombre + " ataca a " + pokemon1.nombre);
		System.out.println(ataque2);
		pokemon1.setPs(ataque2);
		System.out.println( pokemon2.nombre + " ataca a " + pokemon1.nombre);
		}
	}

	
}
