package test.com.jfinal.plugin.cron4j;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JobB implements Runnable {

	@Override
	public void run() {
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+" JobB works");
	}


}
