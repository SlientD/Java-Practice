public class BreakLabelUsing {

    public static void main(String[] args) {
        int[][] a={{1,2},{3,4},{5,6}};
	  found:
            for(int i=0;i<a.length;i++)
            {
                int [] ia=a[i];
                for(int j=0;j<ia.length;j++)
                {
                    if(ia[j]==1||ia[j]==6)
                    {
			System.out.println(ia[j]);
                        break found;   
                    }
                }
            }

    }
}
