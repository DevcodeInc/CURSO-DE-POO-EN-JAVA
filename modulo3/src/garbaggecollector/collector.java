package garbaggecollector;

import com.devcode.tiposdedatos.Auto;

public class collector {
	public static void main(String[] args) {
		//heap
		//GC --> JVM
		Auto miAuto=new Auto(); // 3388
		Auto miOtroAuto=miAuto; // 3388
		
		miAuto=new Auto();
		
		
		
		
		System.gc();
		
	}
}
