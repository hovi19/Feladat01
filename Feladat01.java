package Feladat01;

public class Feladat01 {
	public  int feladat01(String []colors) {
		int colorMix =0;
		for(int i = 2; i <= colors.length; i++) {
			colorMix += nCr(colors.length, i);
		}
		
		return colorMix;
		
	}
	 int factorial(int n) {
		//faktori�lis sz�m�t�s
		int factorial = 1;
		for (int i = 2; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}
	 int nCr(int n, int k) {
		//az n alatt a k kombin�ci� k�plete
		return factorial(n)/ (factorial(k) * factorial(n-k));
	}
}



