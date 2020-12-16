package com.test.dcy;

//복호화
public class Dcy {
	//확인용
			static void arrPrint(String[][] arr) {
				
				int rows = arr.length;
				int col = arr[0].length;
				
				
				for (int i = 0; i < rows; i++) {
					for (int j = 0; j < col; j++) {
						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}
			}
			
			//ver1
			//public String[] zeroRowPw = {"A","D","F","G","V","X","S","B","M","Z"};
			//ver2
			public String[] zeroRowPw = {"@","&","#","!","+","*","x","$","?","X"};
			
			public String[] innerContents = {"K","Z","W","R","1","F","<","l","c","**",
											 "9","B","6","C","L","5",".","x","&","**",
											 "Q","7","J","P","G","X",">","m","*","**",
											 "E","V","Y","3","A","N","/","v","z","**",
											 "8","O","D","H","0","2","?","'","(","**",
											 "U","4","I","S","T","M","^","n","_","]",
											 "~","`","!","@","#","$","%","b","k","[",
											 "q","i","t","d",":","=","\"","j","h","}",
											 "f",")",";","p","g","s",",","a","o","{",
											 "u","+","y","r","e","w","-","\\","|"," "};

			
			//암호화키판 리턴시켜준다.
			public String[][] initialMatrix() {
				
				String[][] initialMatrix = new String[11][11];//여기에 암호들이 들어있음.
				String[] standard = {"A","D","F","G","V","X","S","B","M","Z"};
				

				for (int i = 1; i <= standard.length; i++) {
					initialMatrix[0][i] = standard[i-1]; 
					initialMatrix[i][0] = standard[i-1]; 
				}//for
				
				int shift = 0;
				
				for (int i = 1; i < 11; i++) {
					for (int j = 1; j < 11; j++) {
						initialMatrix[i][j] = innerContents[shift++];
					}
				}//for
				
				
				return initialMatrix;
				
			}
			
			public static void main(String[] args) {
				//확인용
				
				Dcy dcy = new Dcy();
				
				arrPrint(dcy.initialMatrix());
				
				
			}
}
