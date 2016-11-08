import java.util.Scanner;
public class TestMatrices{
	Scanner input=new Scanner(System.in);

	public static void main(String[]args){
		MatrixOper matoper=new MatrixOper();
		double[][] mat1;
		double[][] mat2;
		double[][] result;
		char oper;
		do{
			oper='z';
			System.out.prinln("Enter a to add two matrices, s to subtract, m to multiply, t to take transpose, i to take inverse and q to quit program");
			oper=input.next().At(0);
			switch(oper)
			{
				case 'a':
					System.out.println("Enter First Matrix");
					mat1=takeInput();
					System.out.println("Enter 2nd Matrix");
					mat2=takeInput();
					if(matoper.additionPossible(mat1,mat2)==false){
						System.out.println("Addition not possible");
						break;
					}
					result=matoper.addMatrices(mat1,mat2);
					matoper.printMatrix(result);
					break;
				case 's':
					System.out.println("Enter First Matrix");
					mat1=takeInput();
					System.out.println("Enter 2nd Matrix");
					mat2=takeInput();
					if(matoper.subtractionPossible(mat1,mat2)==false){
						System.out.println("Subtraction not possible");
						break;
					}
					result=matoper.subtractMatrices(mat1,mat2);
					matoper.printMatrix(result);
					break;
				case 'm':
					System.out.println("Enter First Matrix");
					mat1=takeInput();
					System.out.println("Enter 2nd Matrix");
					mat2=takeInput();
					if(matoper.multiplicationPossible(mat1,mat2)==false){
						System.out.println("Multiplication not possible");
						break;
					}
					result=matoper.multiplyMatrices(mat1,mat2);
					matoper.printMatrix(result);
					break;
				case 't':
					System.out.println("Enter Matrix");
					mat1=takeInput();
					result=matoper.transposeOfMatrix(mat1);
					matoper.printMatrix(result);
					break;
				case 'i':
					System.out.println("Enter Matrix");
					mat1=takeInput();
					if(matoper.inversePossible(mat1)==false){
						System.out.println("Inverse not possible");
						break;
					}
					result=matoper.inverseOfMatrix(mat1);
					matoper.printMatrix(result);
					break;
			}



		}while(oper!='q');
	}

	public static double[][] takeInput(){
		System.out.println("Enter rows and columns");
		int r,c;
		r=input.nextInt();
		c=input.nextInt();
		double[][] mat=new double[r][c];
		for(int i=0;i<r;i++){
			System.out.println("Enter elements of Row"+r+" of matrix separated by spaces");
			for(int j=0;j<c;j++){
				mat[i][j]=input.nextInt();
			}
		}
		return mat;
	}

}