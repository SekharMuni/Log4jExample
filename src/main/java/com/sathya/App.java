package com.sathya;


import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.XMLLayout;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger log=Logger.getLogger(App.class);
    public static void main( String[] args )
    {
    	Layout layout=new XMLLayout();
    	Appender ap=new ConsoleAppender(layout);
    	log.addAppender(ap);
    	log.info("Hello");
    	log.error("warning");
    	log.debug("DEBUG");
    	log.fatal("FATAL");
    	log.warn("QQQQQ");
        System.out.println( "Hello World!" );
    }
}
