package vn.codegym.QuyenLeSy;

public class PrintTree {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;

        for (int i = 1; i <= 100; i++){
            if(i%5==0) {
                num1 = i;
                System.out.println("- " + num1);
                int j = num1;
                boolean check = false;
                while (check==false) {
                    j++;
                    if (j % 5 == 0) {
                        num2 = j;
                        check = true;
                    }
                }

                for (int k = num1+1; k < num2; k++) {
                    if (k % 2 == 0) {
                        System.out.println("\t+ " + k);
                    }
                }
            }
        }
    }
}
