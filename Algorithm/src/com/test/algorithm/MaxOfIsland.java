package com.test.algorithm;

public class MaxOfIsland {
   
   
   public static void main(String[] args) {
      int[][] island = {{1,1,0,1,1},
                      {0,1,1,0,0},
                      {0,0,0,0,0},
                      {1,1,0,1,1},
                      {1,0,1,1,1},
                      {1,0,1,1,1}};
      MaxOfIsland a = new MaxOfIsland();
      System.out.println(a.max(island));
      
      
   }//main
   
   //방향을 나타내는 배열생성
   int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
    
   int m,n;//행과 열의 개수 뽑아둔것이다.
   
   public int max(int[][] grid) {
      //grid 가 행렬을 뜻한다.
      
       //오류처리 -> 입력이 없는 경우 or 
      if(grid == null || grid.length ==0) return 0;
        
      m = grid.length;// 행의 개수
      n = grid[0].length;// 열의 개수
      int max2 = 0;
      
      for(int i=0;i<m;i++) {//행만큼 반복
         
         for(int j=0;j<n;j++) {//열만큼 반복
               //배열의 값이 1이면 -> 육지인 경우
            if(grid[i][j]==1) {
               
               //area변수에 1의 개수 저장
               int area = dfs(grid,i,j,0);
                    
                    //가장큰 area의 크기를 구한다.
               max2= Math.max(max2,area);
            }
         }
      }
      
      return max2;
      
   }//max 끝나는 문장.
   
    int dfs(int[][] grid,int i,int j,int area) {
      
        //dfs를 빠져나가기 위한 문장
      if(i<0 || i>=m || j<0 ||j>=n|| grid[i][j] == 0) return area;
        
           //값이 1인 배열의 데이터는 방문체크를 위해 0으로 바꿔준다.
           grid[i][j]=0;
             
             //area값을 1 증가시킨다.
           area++;
            
          
         for(int[] dirs : dir) {
               //기준으로부터 상하좌우 탐색을 실시한다.
            area = dfs(grid, i+dirs[0] , j + dirs[1] ,area);
         }
         
      return area;
   }//dfs   
}