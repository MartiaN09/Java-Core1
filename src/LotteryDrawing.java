import java.util.*;

public class LotteryDrawing {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("请问您要从多少个数中抽取数字？");
		int n = in.nextInt();
		int[] a = new int[n];
		
		System.out.println("请问您要抽取多少个数字？");
		int k = in.nextInt();
		int[] r = new int[k];
		
		for(int i = 0 ;i<a.length;i++)
			a[i]=i+1;
		
		int e=0;
		for(int j = 0;j<r.length;j++) {
			e=(int)(Math.random()*n);
			r[j]=a[e];
			a[e]=a[n-1];
			n--;
		}
		
		Arrays.sort(r);
		
		for(int i : r)
			System.out.println(i);
		
		in.close();
	}

}
