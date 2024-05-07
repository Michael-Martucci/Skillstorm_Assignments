// package com.skillstorm.warehouseinventoryapi.aspects;

// import org.aspectj.lang.JoinPoint;
// import org.aspectj.lang.annotation.Aspect;
// import org.aspectj.lang.annotation.Before;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.stereotype.Component;

// @Aspect // aspect j interweaves this code with ours
// @Component // tells sprong to make a bean 

// public class LoggingAspects {


//     private Logger logger = LoggerFactory.getLogger(getClass());
// // point cut expression 

// @Before(value = "execution(void com.skillstorm..set*(*))")

// public void logChanges(JoinPoint joinPoint){
//     logger.info("Setter running is " + joinPoint.getSignature().getName());
//     logger.info("about to change"); // replaces println
//     // System.out.println();
//     logger.info("the new value is " + joinPoint.getArgs()[0]); // get array pf arguments

// }
// }
