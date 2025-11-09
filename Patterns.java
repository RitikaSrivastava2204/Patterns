public class Patterns {
    public static void main(String[] args) {
        // square(5);
        // rightTriangle(5);
        // System.out.println();
        // invertedRightTriangle(6);
        // System.out.println();
        // pyramid(5);
        // invertedPyramid(5);
        printX(6);

    }
    public static void printX(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i!=j){
                    System.out.print(" ");
                }
                if(i==j){
                    System.out.print("*");
                }
                else if(i+j==n-1){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    
    public static void square(int side){
        for(int i=0; i<side; i++){
            for(int j=0; j<side; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void rightTriangle(int side){
        for(int row = 1; row<=side; row ++){
            for(int column = 1; column<=row; column++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void invertedRightTriangle(int side){
        for(int row = 0; row<side; row++){
            for(int column = 0; column < side - row; column++){
                System.out.print('*');

            }
            System.out.println();
        }
    }
    public static void pyramid(int side){
        for(int i = 1; i<=side; i++){
            for(int j=1;j<=side-i;j++){
                System.out.print(" ");
            }
            for(int k=1; k<= i*2-1; k++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void invertedPyramid(int side){
        for(int i=1;i<=side;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*(side-i)+1;k++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
