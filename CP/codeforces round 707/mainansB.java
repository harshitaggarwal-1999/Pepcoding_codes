import java.util.*;

public class mainansB {
    public static void main(String[] args){
        Scanner scn  = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();

        int[][] arr = new int[m][n];
        
        int[] rowsum = new int[m];
        int[] colsum = new int[n];

        int[][] ansarr = new int[m][n];
        

        int count= 0;
        for(int i = 0 ; i < m; i++) {
            for(int j = 0; j < n; j++){
                arr[i][j] = scn.nextInt();
                if(arr[i][j] == 0)count++;
            }
        }
        int diff = (n*n)-count;
        if(count<diff) {
            System.out.println(-1);
            return;
        }

        for(int i=0;i<m;i++) {
            int sum=0;
            for(int j=0;j<n;j++)sum+=arr[i][j];
            rowsum[i]=sum;
        }

        for(int j=0;j<n;j++) {
            int sum=0;
            for(int i=0;i<m;i++)sum+=arr[i][j];
            colsum[j]=sum;
        }

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(arr[i][j]==0)
                {
                    if(rowsum[i]<=colsum[j])
                    {
                        if(rowsum[i]%2 == 1)arr[i][j]=1;
                        else arr[i][j]=2;

                    }
                    else
                    {
                        if(rowsum[i]%3==0)arr[i][j]=0;
                        else
                        {
                            int val = 3-(rowsum[i]%3);
                            arr[i][j]=val;
                        }
                    }
                    rowsum[i]+=arr[i][j];
                    colsum[j]+=arr[i][j];
                }
            }
        }

        

        for(int i= 0 ; i < m; i++){
            for(int j= 0; j< n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}

