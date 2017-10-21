
public class TdArray2 {
	public static void main(String[] args) {
		int[][] studentmarks = new int [10][4];
		
		studentmarks [0] [0] =78;
		studentmarks [0] [1] =90;
		studentmarks [0] [2] =100;
		studentmarks [0] [3] =100;
		
		studentmarks [1] [0] =90;
		studentmarks [1] [1] =100;
		studentmarks [1] [2] =70;
		studentmarks [1] [3] =85;
		
		studentmarks [2] [0] =90;
		studentmarks [2] [1] =90;
		studentmarks [2] [2] =85;
		studentmarks [2] [3] =100;
		
		System.out.println("firststudent "+ studentmarks[0][2]);
		System.out.println("secondstudent "+ studentmarks[1][2]);
		
		for(int r=0;r<10; r++)
		{
			for(int c=0; c<4; c++)
			{
			System.out.println("studentmarks:["+r+"]["+c+"]"+studentmarks[r][c]);
			}
			System.out.println("***********************************");
		}
	}
}
		



