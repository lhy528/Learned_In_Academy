package spring_aop04_after_throw_advice;

import org.springframework.aop.ThrowsAdvice;

public class InterceptorAdvice implements ThrowsAdvice{
	public void afterThrowing(IllegalArgumentException e) {
		System.out.println("예외가 터졌습니다!");
	}
}
