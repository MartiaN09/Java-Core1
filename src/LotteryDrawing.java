import java.util.*;

public class LotteryDrawing {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("������Ҫ�Ӷ��ٸ����г�ȡ���֣�");
		int n = in.nextInt();
		int[] a = new int[n];
		
		System.out.println("������Ҫ��ȡ���ٸ����֣�");
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
