package it.devlec.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EsempioLog {
    private static final Logger logger =  LogManager.getLogger(EsempioLog.class);

    public EsempioLog(){

    }
    public void stampaAltriLog(String stringa){
        while(true) {
            logger.info(stringa);
            logger.error(stringa);
            logger.warn(stringa);
            logger.fatal(stringa);
        }

    }
}
