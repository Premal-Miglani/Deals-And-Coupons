package com.admin.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GlobalResource {
	
	public static Logger getLogger(Class classname)
    {
        return LoggerFactory.getLogger(classname);
    }

}
