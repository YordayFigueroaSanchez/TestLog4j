package test4j.yfsanchez.com;

import org.apache.log4j.Logger;

public class ClaseUno {
	
	static final Logger logger = Logger.getLogger(ClaseUno.class);
	
	public ClaseUno() {}
	
	public void imprimirUno() {
		
		 logger.debug("Log4j appender - Clase Uno");
		
	}

}
