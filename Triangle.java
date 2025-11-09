public class Triangle {
    public static void main(String[] args) {
        printRow(1, 5);
    }
    public static void printStar(int n){
        if(n==0){
            return;
        }
        System.out.print("* ");
        printStar(n-1);
    }
    public static void printRow(int i,int r){
        if(i==r+1){
            return;
        }
        printStar(i);
        System.out.println();
        printRow(i+1, r);

        
    }
}
