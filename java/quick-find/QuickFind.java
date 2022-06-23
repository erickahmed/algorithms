public class QuickFind
{
    private int[] id;

    /* Create array of elements with no connections */
    public int QuickFind(int n)
    {
        id = new int[n];
        for (int i = 0; i < n; i++)
            id[i] = i;
    }

    /* Check connections between two elements */
    public boolean find (int p, int q)
    {   return id[p] == id[q]; }

    /* Connect one element to a component */
    public void union (int p, int q)
    {
        int pid = id[p];
        int qid = id[q];

        for (int i = 0; i < id.length; i++)
            if (id[i] == pid) id[i] = qid;
    }
}