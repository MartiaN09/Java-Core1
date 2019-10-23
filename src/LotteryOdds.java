import java.math.*;
import java.util.*;

public class LotteryOdds {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("请输入您要在多少位数字中抽取？");
		int num1=in.nextInt();
		
		System.out.println("请输入抽取的数字数：");
		int num2 = in.nextInt();
		
		BigInteger num3=BigInteger.valueOf(1);
		BigInteger num4=BigInteger.valueOf(1);
		for(;num2>0;num2--,num1--) {
			num3 = num3.multiply(BigInteger.valueOf(num2));
			num4 = num4.multiply(BigInteger.valueOf(num1));
		}
		
		BigInteger jilv= BigInteger.valueOf(1);
		jilv=num4.divide(num3);
		
		System.out.println("你的几率是1/"+jilv);
		
		in.close();
	}

}
