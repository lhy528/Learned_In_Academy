package spring_aop09_anno_HW;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CheckTime {
	@Pointcut("execution(public * fire())")
	public void test() {}
	
	@After("test()")
	public void whatTime(JoinPoint jp) throws Throwable{
		System.out.println("되었나?");
		WeaponImple wp = (WeaponImple)jp.getTarget();
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMDDhh24mmss");
		String fileName = sdf.format(d);
		String dir = "C:\\Users\\사용자\\Downloads\\log";
		File f = new File(dir);
		File f2 = new File(dir+"\\"+fileName+".txt");
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분");
		String weaponTime = sdf2.format(d);
		
		if(!f.exists()) f.mkdir();
		if(!f2.exists())
			try {
				f2.createNewFile();
				PrintWriter pw = new PrintWriter(f2);
//		pw.println(wp.type+"(으)로 공격한 수행시간은 "+weaponTime+"초 입니다");
				pw.println(wp.type+"(으)로 공격한 시각은 "+weaponTime+" 입니다");
				pw.flush();	
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
//		thisJoinPoint.getThis();
	}
}
