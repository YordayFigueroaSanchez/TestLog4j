package test4j.yfsanchez.com;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import test4j.yfsanchez.com.modelo.ClaseDos;

public class Principal {

	static final Logger logger = Logger.getLogger(Principal.class);
	 
    public static void main(String[] args)
    {
    	//DOMConfigurator is used to configure logger from xml configuration file
        DOMConfigurator.configure("log4j.xml");
 
        //Log in console in and log file
        logger.fatal("Principal - fatal");
        logger.error("Principal - error");
        logger.warn("Principal - warn");
        logger.info("Principal - info");
        logger.debug("Principal - debug");
        logger.trace("Principal - trace");
        
        ClaseUno uno = new ClaseUno();
        uno.imprimirUno();
        
        ClaseDos dos = new ClaseDos();
        dos.imprimirDos();
    }

}
