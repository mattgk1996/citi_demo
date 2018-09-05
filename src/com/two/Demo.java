package com.two;

import com.one.MyData;

public class Demo extends MyData {
	public void myFun() {
/*		MyData m = new MyData();
		m.display();*/
		
		display();//property of parent will be property of child
	}
}
