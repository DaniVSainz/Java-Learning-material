
public class Application {

	public static void main(String[] args) {

		int[] values = {3,4,2323};
		
//		multi dim arary
		
		int[][] grid = {
				{3,4,2323},
				{2,33},
				{2312,123}
		};
		
		// System.out.println(grid[1][1]);
		
		String[][] texts = new String[2][3];
		
		texts[0][1] ="Wassup";
		
		// System.out.println(texts[0][1]);

		for(int i= 0;i< grid.length;i++){
			for(int row=0;row < grid[i].length ;row++){
				System.out.println(grid[i][row] + "\t");
			}
			System.out.println();
		}
		
		String[][] words = new String[2][];
		


	}

}