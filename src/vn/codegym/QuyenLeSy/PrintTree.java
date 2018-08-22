package vn.codegym.QuyenLeSy;

public class PrintTree {
    public static void main(String[] args) {

        for (int i = 0;i <= 100;i++)
        {
            if (i % 5 == 0)
            {
                System.out.println("-->" + i);

                int j = i + 1;

                while (j % 5 != 0)
                {
                    if (j % 2 == 0)
                    {
                        System.out.println("------" + j);
                    }

                    j++;

                    if (j % 2 == 0 && j % 5 == 0)
                    {
                        System.out.println("------" + j);
                    }
                }
            }
        }
    }
}
