package test4j.yfsanchez.com;

import org.apache.log4j.Logger;

public class ClaseDos {
	
	static final Logger logger = Logger.getLogger(ClaseDos.class);
	
	public ClaseDos() {}
	
	public void imprimirUno() {
		
		 logger.debug("Log4j appender - Clase Dos");
		
	}

}
