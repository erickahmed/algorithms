public class QuickUnion {
    private int[] id;

    /* Create array of elements with no connections */
    public int QuickUnion(int n)
    {
        id = new int[n];
        for (int i = 0; i < n; i++)
            id[i] = i;
    }

    private int  root(int i)
    {
        while (i != id[i]) i = id[i]
        return i;
    }

    public boolean connected (int p, int q)
    {   return root[p] == root[q]; }

    public void union (int p, int q)
    {
        int pid = id[p];
        int qid = id[q];

        id[i] = j;
    }
}
