package test4j.yfsanchez.com;

import org.apache.log4j.Logger;

public class ClaseUno {
	
	static final Logger logger = Logger.getLogger(ClaseUno.class);
	
	public ClaseUno() {}
	
	public void imprimirUno() {
		
		logger.fatal("ClaseUno - fatal");
        logger.error("ClaseUno - error");
        logger.warn("ClaseUno - warn");
        logger.info("ClaseUno - info");
        logger.debug("ClaseUno - debug");
        logger.trace("ClaseUno - trace");
		
	}

}
