import java.util.*;

public class Retirement {
	public static void main(String[] args) {
		System.out.println("Please enter retierment for each year: ");
		Scanner in = new Scanner(System.in);
		double date = in.nextDouble();
		
		System.out.println("Please enter lilv for each year: ");
		double lilv = in.nextDouble();
		
		System.out.println("Please enter zong retierment: ");
		double zong = in.nextDouble();
		
		double zong1=date*(1+lilv);
		int i=1;
		while(zong1<zong) {
			i++;
			zong1 = (zong1+date)*(1+lilv);		
		}
		
		System.out.printf("%d", i);
		in.close();
	}

}
