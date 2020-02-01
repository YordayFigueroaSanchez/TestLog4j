package test4j.yfsanchez.com.modelo;

import org.apache.log4j.Logger;

public class ClaseDos {
	
	static final Logger logger = Logger.getLogger(ClaseDos.class);
	
	public ClaseDos() {}
	
	public void imprimirDos() {
		
		logger.fatal("ClaseDos - fatal");
        logger.error("ClaseDos - error");
        logger.warn("ClaseDos - warn");
        logger.info("ClaseDos - info");
        logger.debug("ClaseDos - debug");
        logger.trace("ClaseDos - trace");
		
	}

}
