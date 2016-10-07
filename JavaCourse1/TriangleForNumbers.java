class TriangleForNumbers {
    public static void main(String args[])  {
        int i=1, k=1, j=1;
        do {
            k = 5;
            do {
                System.out.print(" ");
                k--;
            }while(k>=i);
            j = 1;
            do {
                System.out.print(i + " ");
                j++;
            }while(j<=i);
            System.out.println("");
            i++;
        }while(i<=5); 

    }
}
