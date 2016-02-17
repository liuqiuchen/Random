package com.random;
import java.util.Arrays;//导入java.util.Arrays类包，用于Arrays.toString()输出
/**
 * 编写一个JAVA程序，创建指定长度的 int 型数组，并生成 100 以内随机数【整数】为数组中的每个元素

赋值，然后输出数组
要求：

1、 要求通过定义带参带返回值的方法来实现

2、 通过参数传入数组的长度（例如长度为 8），方法执行后返回赋值后的数组

3、 通过 (int)(Math.random() * 100) 生成 100 以内的随机数

注：Math 类是用于进行算术操作的类，Math.random() 生成 0--1 的浮点数。

运行效果为： [ 2 , 52 , 8 , 26 , 66 , 32 , 98 , 0 ]

注：由于数组元素的值是随机生成的，每次运行生成的值可能都不同，此效果仅供参考*/

public class MyRandom {
	public static void main(String[] args) {
		//实例化对象
		MyRandom myRandomOb = new MyRandom();
		//调用方法
		int[] newArr = myRandomOb.giveValue(8);
		//打印被转换为字符串的数组
		System.out.println(Arrays.toString(newArr));
	}
	public int[] giveValue(int length){
		int[] myArr = new int[length];
		for(int i = 0;i < length;i++){
			myArr[i] = (int)(Math.random()*100);
		}
		return myArr;
	}
}


/**
 * 任务
一、 定义一个带参带返回值的方法，实现输出随机数数组

提示：
 1、 定义一个带参带返回值的方法，通过参数传入数组的长度，返回值为赋值后的数组
 2、 创建指定长度的整型数组
 3、 使用 for 循环遍历数组，通过 Math.random( ) 生成随机并给数组成员赋值
 4、 使用 return 返回赋值后的数组
二、 完成 main 方法

提示：
 1、 调用自定义方法，保存方法执行后返回的数组
 2、 使用 Arrays.toString( ) 将数组转换为字符串并输出，注意导入 java.util.Arrays;
*/
