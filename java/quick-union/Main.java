import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        QuickFind uf = new QuickFind(n);

        int p = sc.nextInt();
        int q = sc.nextInt();

        if (!uf.find(p, q))
        {
            uf.union(p, q);
            System.out.println(p + " " + q);
        }
    }
}
