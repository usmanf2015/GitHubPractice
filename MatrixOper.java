public class MatrixOper{
	
	public boolean additionPossible(double[][] mat1, double[][] mat2){
		return (mat1.length==mat2.length)&&(mat1[0].length==mat2[0].length);
	}

	public boolean subtractionPossible(double[][] mat1, double[][] mat2){
		return (mat1.length==mat2.length)&&(mat1[0].length==mat2[0].length);
	}
	
	public boolean multiplicationPossible(double[][] mat1, double[][] mat2){
		return (mat1[0].length==mat2.length);
	}

	public boolean inversePossible(double[][] mat){
		return (mat.length==mat[0].length)&&determinentOfMatrix(mat)!=0;
	}
	
	public double[][] addMatrices(double[][] mat1, double[][] mat2){
		double[][] result=new double[mat1.length][mat1[0].length];
		for(int r=0;r<result.length;r++){
			for(int c=0;c<result[r].length;c++){
				result[r][c] = mat1[r][c] + mat2[r][c];
			}
		}
		return result;
	}

	public double[][] subtractMatrices(double[][] mat1, double[][] mat2){
		double[][] result=new double[mat1.length][mat1[0].length];
		for(int r=0;r<result.length;r++){
			for(int c=0;c<result[r].length;c++){
				result[r][c] = mat1[r][c] - mat2[r][c];
			}
		}
		return result;
	}

	public double[][] multiplyMatrices(double[][] mat1, double[][] mat2){
		double[][] result=new double[mat1.length][mat2[0].length];
		for(int r=0;r<result.length;r++){
			for(int c=0;c<result[r].length;c++){
				double sum=0;
				for(int i=0;i<mat1[i].length;i++){
					sum += (mat1[r][i]*mat2[i][c]);
				}
				result[r][c]=sum;
			}
		}
		return result;
	}

	public double[][] transposeOfMatrix(double[][] mat){
		double[][] result=new double[mat.length][mat[0].length];
		for(int r=0;r<mat.length;r++){
			for(int c=0;c<mat[r].length;c++){
				result[c][r] = mat[r][c];
			}
		}
		return result;
	}
	
	public double determinentOfMatrix(double[][] mat){
		return (mat[0][0]*mat[1][1])-(mat[0][1]*mat[1][0]);
	}

	public double[][] adjointOfMatrix(double[][] mat){
		double[][] result=new double[mat.length][mat[0].length];
		result[0][0]=mat[1][1];
		result[1][1]=mat[0][0];
		result[0][1]=0-mat[0][1];
		result[1][0]=0-mat[1][0];
		return result;
	}

	public double[][] inverseOfMatrix(double[][] mat){
		double[][] result=new double[mat.length][mat[0].length];
		result=adjointOfMatrix(mat);
		double det=determinentOfMatrix(mat);
		for(int r=0;r<mat.length;r++){
			for(int c=0;c<mat[r].length;c++){
				result[r][c] /= det;
			}
		}
		return result;
	}
	
	public void printMatrix(double[][] mat){
		for(int r=0;r<mat.length;r++){
			for(int c=0;c<mat[r].length;c++){
				System.out.println(mat[r][c]+"\t");
			}
			System.out.println();
		}
	}
		
}