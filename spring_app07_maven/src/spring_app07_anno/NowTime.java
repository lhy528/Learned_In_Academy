package spring_app07_anno;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NowTime {
	public String getTime() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH 시 mm 분");
		return sdf.format(d);
	}
}
