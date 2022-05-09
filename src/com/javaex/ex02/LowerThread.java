package com.javaex.ex02;

public class LowerThread extends Thread {

	// 필드

	// 생성자

	// 메소드 -gs

	// 메소드 -일반
	@Override
	public void run() {
		for (char ch = 'a'; ch < 'z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}