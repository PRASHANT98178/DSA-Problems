class Solution {
    // Function to find all possible paths
    
    public boolean isSafe(int x, int y, int[][] m, int[][] maze, int n){
        if((x>= 0 && x<n) && (y>=0 && y<n) && m[x][y] == 0 && maze[x][y] == 1){
            return true;
        }
        return false;
    }
    
    public void helper(int x, int y, int[][] maze, StringBuilder path,  ArrayList<String> ans, int[][] m, int n){
        
        if(x == n-1 && y == n-1){
            ans.add(path.toString());
            return;
        }
        
        m[x][y] = 1;
        
        // we have fpour paths D, L,R,U
        
        //down 
        int newx = x+1;
        int newy = y;
        if(isSafe(newx, newy, m, maze, n)){
            path.append("D");
            helper(newx, newy, maze, path, ans, m, n);
            path.deleteCharAt(path.length() - 1);
        }
        
        //up
         newx = x-1;
         newy = y;
        if(isSafe(newx, newy, m, maze, n)){
            path.append("U");
            helper(newx, newy, maze, path, ans, m, n);
            path.deleteCharAt(path.length() - 1);

        }
        
        //left
         newx = x;
         newy = y-1;
        if(isSafe(newx, newy, m, maze, n)){
             path.append("L");
            helper(newx, newy, maze, path, ans, m, n);
            path.deleteCharAt(path.length() - 1);
        }
        
        //right
         newx = x;
         newy = y+1;
        if(isSafe(newx, newy, m, maze, n)){
            path.append("R");
            helper(newx, newy, maze, path, ans, m, n);
            path.deleteCharAt(path.length() - 1);
        }
        
        
        
        m[x][y] = 0;
    }
    
    public ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> ans = new ArrayList<>();
        int n = maze.length;
        
        int[][] m = new int[n][n];
        for(int[] arr : m){
            Arrays.fill(arr, 0);
        }
        
        StringBuilder path = new StringBuilder();
        
        helper(0, 0, maze, path, ans, m, n);
        Collections.sort(ans);
        return ans;
        
    }
}