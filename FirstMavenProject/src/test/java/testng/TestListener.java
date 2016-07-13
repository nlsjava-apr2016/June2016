package testng;

import java.util.Date;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class TestListener implements ISuiteListener {

	public long startTime;
	public long endTime;
	public void onFinish(ISuite arg0) {
		// TODO Auto-generated method stub
		System.out.println("completed");
		endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		
	}

	public void onStart(ISuite arg0) {
		// TODO Auto-generated method stub
		System.out.println(new Date());
		startTime = System.currentTimeMillis();
		
	}

}
