class Solution {
    public int[][] dfs(int[][] image, int sr, int sc, int color,int n,int m,int initial){
        if(sr<0 || sc<0 || sr>=m || sc>=n || image[sr][sc]==color || image[sr][sc]!=initial) return image;
        image[sr][sc]=color;
        dfs(image,sr,sc+1,color,n,m,initial);
        dfs(image,sr+1,sc,color,n,m,initial);
        dfs(image,sr,sc-1,color,n,m,initial);
        dfs(image,sr-1,sc,color,n,m,initial);
        return image;
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m=image.length;
        int n=image[0].length;
        int initial=image[sr][sc];
        image=dfs(image,sr,sc,color,n,m,initial);
        return image;
    }
}