public class Floyd {

    private int[][] matrix;

    public Floyd(int[][] adjecencyMatrix){
        matrix = adjecencyMatrix;
    }


    public void updateDistances(){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                for(int k=0; k<matrix.length; k++){
                    int twoVerticles = matrix[i][k]+matrix[k][j];
                    if(twoVerticles < matrix[i][j]){
                        matrix[i][j] = twoVerticles;
                    }
                }
            }
        }
    }


    public void print(){

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }

}
