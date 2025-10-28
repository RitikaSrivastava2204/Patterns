public class Pyramid {
    public static void main(String[] args) {
        int n =5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=2*n-1; j++){
                if(n-i<j && j<n+i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
