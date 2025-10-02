package com.assignment.aop;

@Aspect
@Component
public class LoggingAspect {
    private Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Around("execution(* com.example.service.StudentService.*(..))")
    public Object logExecution(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long timeTaken = System.currentTimeMillis() - start;
        logger.info("{} invoked at {}. Execution time: {} ms", joinPoint.getSignature().getName(), LocalDateTime.now(), timeTaken);
        return result;
    }
}
