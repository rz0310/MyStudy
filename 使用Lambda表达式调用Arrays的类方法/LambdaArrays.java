package 使用Lambda表达式调用Arrays的类方法;

import java.util.Arrays;

public class LambdaArrays {
	public static void main(String[] args) {
		String[] arr1 = new String[] {"java","fkjava","fkit","ios","Android"};
//		Lambda表达式的目标类型：Comparator
		Arrays.parallelSort(arr1,(o1,o2)->o1.length()-o2.length());
		System.out.println(Arrays.toString(arr1));
		int[] arr2 = new int[] {3,-4,25,16,30,18};
//		Lambda表达式的目标类型:IntBinaryOperator
		Arrays.parallelPrefix(arr2, (left,right)->left*right);
		System.out.println(Arrays.toString(arr2));
		long[] arr3 = new long[5];
//		Lambda表达式的目标类型:IntToLongFunction
		Arrays.parallelSetAll(arr3, operand->operand*5);
		System.out.println(Arrays.toString(arr3));
	}
}
