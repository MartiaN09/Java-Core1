import java.util.*;

public class LotteryArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("请输入要生成的三角矩阵的行列数：");
		int i = in.nextInt();
		
		int[][] a= new int[i][];
		
		for(int j=0;j<i;j++) {
			a[j] = new int[j+1];
		}
		
		for(int n=0 ; n<a.length;n++) {
			for(int k=0; k<a[n].length;k++) {
				if(n==k||k==0) 
					a[n][k]=1;
				else
					a[n][k]=a[n-1][k-1]+a[n-1][k];
				System.out.printf("%6d",a[n][k]);
			}
			System.out.printf("\n");
		}
		in.close();
	}

}
