package com.tianmaying;
import com.tianmaying.others.Car;
import com.tianmaying.others.Post;

/**
 * 
 * Hello Word 类
 * 
 * @author yongche
 * @return void
 *
 */
public class HelloWord {

	public static void main(String[] args) {
//		System.out.println("hello word");
		
//		实例化 post类
		Post postObj = new Post();
		
		postObj.title = "天码营的博";
		postObj.content = "这是我的第一篇博";
		postObj.print();
		
		Car carObj = new Car();
		carObj.speed = 100;
		carObj.startup();
		carObj.run();
		
	}
}
