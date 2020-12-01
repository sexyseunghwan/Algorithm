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
      System.out.println("=======================");
      
      for (int i = 0; i < 6; i++) {
    	  for (int j = 0; j < 5; j++) {
    		  System.out.print(island[i][j]);
    	  }
    	  System.out.println();
      }
      
      
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
      int max2 = 0;// ? 애는 뭐지?
      
      for(int i=0;i<m;i++) {//행만큼 반복
          
          for(int j=0;j<n;j++) {//열만큼 반복
             
             if(grid[i][j]==1) {//배열의 값이 1이면 -> 육지인 경우
                
                //area변수에 1의 개수 저장
                int area = dfs(grid,i,j,0);//처음에 area를 0 으로 놔준다.
                     
                //가장큰 area의 크기를 구한다.
                max2 = Math.max(max2,area);//가장 큰 area 를 비교해서 올려준다. -> 여기서 max 계속 변할것이다.
             }
          }
       }
      
      return max2;
      
   }//max 끝나는 문장.
   
   	//깊이 우선 탐색
    int dfs(int[][] grid,int i,int j,int area) {
      
        //dfs를 빠져나가기 위한 문장
      if(i<0 || i>=m || j<0 ||j>=n|| grid[i][j] == 0) { return area;}//여기서 하나하나씩 필터링 해주는 구조라고 생각하면 된다.
        
      //위에 if 절에 걸리면 바로 나가리 되는거니까 아래 실행문은 소용이 없게 된다.
           
      	  //값이 1인 배열의 데이터는 방문체크를 위해 0으로 바꿔준다
          grid[i][j] = 0;
          
          //area값을 1 증가시킨다.
          area++;// -> 여기서 area 가 정의된것
          
         for(int[] dirs : dir) {//총 네번을 돌것이다 -> 상하좌우
            
        	//기준으로부터 상하좌우 탐색을 실시한다. -> 재귀실행
            area = dfs(grid, i + dirs[0] , j + dirs[1] ,area);
            
         }
         
      return area;
   }//dfs   
}