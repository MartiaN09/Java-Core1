import java.math.*;
import java.util.*;

public class LotteryOdds {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("��������Ҫ�ڶ���λ�����г�ȡ��");
		int num1=in.nextInt();
		
		System.out.println("�������ȡ����������");
		int num2 = in.nextInt();
		
		BigInteger num3=BigInteger.valueOf(1);
		BigInteger num4=BigInteger.valueOf(1);
		for(;num2>0;num2--,num1--) {
			num3 = num3.multiply(BigInteger.valueOf(num2));
			num4 = num4.multiply(BigInteger.valueOf(num1));
		}
		
		BigInteger jilv= BigInteger.valueOf(1);
		jilv=num4.divide(num3);
		
		System.out.println("��ļ�����1/"+jilv);
		
		in.close();
	}

}
