package org.MainModule;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public void run() {
        System.out.println( "Run Hello World!" );
        Logger logger = LogManager.getLogger(App.class);
        logger.info("Run Hello World!");
    }
}
