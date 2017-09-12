package excepcionesCreadas;

public class Principal {
	
	public static void main(String[] args) {
		try{
			throw new MiExcepcion("Tengo un error, pero ahora desde el constructor");
		} catch(MiExcepcion e){
			System.out.println(e.getMessage());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("Todo bien");
		}
	}
	
}
