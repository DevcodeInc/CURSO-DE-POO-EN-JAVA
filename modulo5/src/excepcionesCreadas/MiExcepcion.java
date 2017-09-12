package excepcionesCreadas;

public class MiExcepcion extends Exception{
	
    public MiExcepcion(String mensaje){
    		super(mensaje);
    };

    public String mensajeExcepcion(){
        return "Error provocado.";
    }
    
    public String mensajeExcepcion2(){
        return "Error provocado 2.";
    }
    
}