package com.random;
import java.util.Arrays;//����java.util.Arrays���������Arrays.toString()���
/**
 * ��дһ��JAVA���򣬴���ָ�����ȵ� int �����飬������ 100 �����������������Ϊ�����е�ÿ��Ԫ��

��ֵ��Ȼ���������
Ҫ��

1�� Ҫ��ͨ��������δ�����ֵ�ķ�����ʵ��

2�� ͨ��������������ĳ��ȣ����糤��Ϊ 8��������ִ�к󷵻ظ�ֵ�������

3�� ͨ�� (int)(Math.random() * 100) ���� 100 ���ڵ������

ע��Math �������ڽ��������������࣬Math.random() ���� 0--1 �ĸ�������

����Ч��Ϊ�� [ 2 , 52 , 8 , 26 , 66 , 32 , 98 , 0 ]

ע����������Ԫ�ص�ֵ��������ɵģ�ÿ���������ɵ�ֵ���ܶ���ͬ����Ч�������ο�*/

public class MyRandom {
	public static void main(String[] args) {
		//ʵ��������
		MyRandom myRandomOb = new MyRandom();
		//���÷���
		int[] newArr = myRandomOb.giveValue(8);
		//��ӡ��ת��Ϊ�ַ���������
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
 * ����
һ�� ����һ�����δ�����ֵ�ķ�����ʵ��������������

��ʾ��
 1�� ����һ�����δ�����ֵ�ķ�����ͨ��������������ĳ��ȣ�����ֵΪ��ֵ�������
 2�� ����ָ�����ȵ���������
 3�� ʹ�� for ѭ���������飬ͨ�� Math.random( ) ����������������Ա��ֵ
 4�� ʹ�� return ���ظ�ֵ�������
���� ��� main ����

��ʾ��
 1�� �����Զ��巽�������淽��ִ�к󷵻ص�����
 2�� ʹ�� Arrays.toString( ) ������ת��Ϊ�ַ����������ע�⵼�� java.util.Arrays;
*/
