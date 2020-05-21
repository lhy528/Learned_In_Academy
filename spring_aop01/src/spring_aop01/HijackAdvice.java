package spring_aop01;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

// 이 객체를 메인업무 호출 전에 실행하고 싶다
public class HijackAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		// 중간에 끼어들어서 내가 실행하고픈 코드 : advice
		System.out.println("공통된 관심업무를 지정(예를들면 로그인)");
		System.out.println("메인업무가 실행되기 전에 가로채기");
		
	}

}
