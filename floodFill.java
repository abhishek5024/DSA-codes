class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int oldColour = image[sr][sc];
        if( oldColour == color){
            return image;
        }
        dfs(image, sr, sc, oldColour, color);
        return image;
    }
        private void dfs(int[][] image, int i, int j, int oldColour, int newColour){
            if( i < 0 || i >= image.length || j < 0 || j >= image[0].length || image[i][j] != oldColour){
                return;
            }
            image[i][j] = newColour;
            dfs( image, i+1, j, oldColour, newColour);
            dfs( image, i-1, j, oldColour, newColour);
            dfs( image, i, j+1, oldColour, newColour);
            dfs( image, i, j-1, oldColour, newColour);
        }
    }
