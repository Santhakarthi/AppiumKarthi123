package NowServing;

public class pattern {

	public static void main(String[] args) {
		char ch='A';
		int n=3; int row;int col;
		for(row=1;row<=n;row++) {
			for(col=1;col<=n;col++) {
				if(row==col) {
					System.out.print(ch+" ");
				}
				else {
					System.out.print((row+col)*row+" ");
				}
				
			}
			ch+=3;
			System.out.println(" ");
		}


	}

}
