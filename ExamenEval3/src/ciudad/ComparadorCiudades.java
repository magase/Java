package ciudad;
import java.util.Comparator;

public class ComparadorCiudades implements  Comparator <NombreCiudades> {

	@Override
	public int compare(NombreCiudades o1, NombreCiudades o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getDensidad() - o2.getDensidad());
	}
}