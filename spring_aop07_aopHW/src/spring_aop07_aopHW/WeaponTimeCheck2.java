package spring_aop07_aopHW;

import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class WeaponTimeCheck2 {
	public void logAround(ProceedingJoinPoint pjp) throws Throwable {
		StopWatch sw = new StopWatch();
		
		sw.start();
		Object obj = pjp.proceed();
		sw.stop();
		
		// 지금 수행하려는 클래스를 가져올 수 있다!
		WeaponImple wp = (WeaponImple) pjp.getTarget();
		
		double weaponTime = sw.getTotalTimeSeconds();
		System.out.println("수행시간 : "+weaponTime);
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMDDhh24mmss");
		String fileName = sdf.format(d);
		String dir = "C:\\Users\\사용자\\Downloads\\log";
		File f = new File(dir);
		File f2 = new File(dir+"\\"+fileName+".txt");
		
		if(!f.exists()) f.mkdir();
		if(!f2.exists()) f2.createNewFile();
		
		PrintWriter pw = new PrintWriter(f2);
		pw.println(wp.type+"(으)로 공격한 수행시간은 "+weaponTime+"초 입니다");
		pw.flush();			
	}
}
