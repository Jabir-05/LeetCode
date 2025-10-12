import java.util.Arrays;
import java.util.HashSet;

public class Repeatmissingnumber {
    public static int[] findMissingAndMissing(int[][]grid){
        HashSet<Integer> set = new HashSet<>();
        int n = grid.length;
        int sq=n*n;
        int currSum =0;
        int ans []=new int[2];
        for(int i=0; i<n; i++){
            for(int j =0; j<n; j++){
                if(set.contains(grid[i][j])){
                    ans[0]=grid[i][j];

                }
                else{
                    set.add(grid[i][j]);
                    currSum += grid[i][j];
                }
            }
        }
        int totalSum = sq*(sq+1)/2;
        ans[1]= totalSum - currSum;
        return ans;

    }
    public static void main(String[] args) {
        int [][] grid = {{1,2,3},{4,6,7},{8,9}};
        System.out.println(Arrays.toString(findMissingAndMissing(grid)));
    }
}
