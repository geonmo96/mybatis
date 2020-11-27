package test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Test {

	@Around("execution(* com.care.controller.TestController.*(..))") // TestController의 모든 메소드에, 매개변수가 1개 이상인 메소드(..)
	public Object setTest(ProceedingJoinPoint joinpoint) throws Throwable {
		System.out.println("controller 실행시 실행됩니다.");
		return joinpoint.proceed();
	}
}
