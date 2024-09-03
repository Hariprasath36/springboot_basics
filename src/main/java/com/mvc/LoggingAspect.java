package com.mvc;

import java.util.List;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.mvc.model.Alien;

@Aspect
@Component
public class LoggingAspect 
{
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);
	@Before("execution(public * com.mvc.AlienController.getAliens())")
	public void log()
	{
		LOGGER.info("getAlien method called from aspect");
	}
	@After("execution(public * com.mvc.AlienController.getAliens())")
	public void logAfter()
	{
		LOGGER.info("getAlien method Executed");
	}

}
