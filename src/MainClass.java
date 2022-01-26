import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("999 if infinity");
        Scanner in = new Scanner(System.in);
        int[][] a = new int[3][3];
        for(int i=0; i<a.length; i++){
                String text = in.nextLine();
                String[] str = text.split(" ");
                for(int j=0; j<a.length; j++){
                    a[i][j] = Integer.valueOf(str[j]);
                }
        }
        Floyd A = new Floyd(a);
        A.updateDistances();
        A.print();

    }

}
