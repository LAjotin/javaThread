package javaThread;

import org.omg.CORBA.PUBLIC_MEMBER;

public class TestThread {

	public static void main(String[] args){
	threadPool pool=new threadPool();
	int sleep=1000;
	while(true) {
		pool.add(new Runnable(){
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		});
		try {
			Thread.sleep(sleep);
			sleep = sleep>100?sleep-100:sleep;
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	}
}

