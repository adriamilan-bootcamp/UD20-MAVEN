package Exercise09.Exercise09;

public class Couple {

	private String[]randomColors;
	/**
	 * @param columns
	 * @param rows
	 * @param randomColors
	 */
	public Couple(String[] columns, String[] rows, String[] randomColors) {

		//this.randomColors = columns[(int)Math.floor(Math.random()*9)];
	}
	
	public void createSquares() {
		String[]columns  = {"A","B","C","D"};
		String[]rows = {"1","2","3","4"};

		// WE TRAVERSE THE OF COLUMNS AND FOR EACH POSITION WE TRAVERSE THE ARRAY OF ROWS
		for (int i = 0; i < columns.length; i++) {
			for (int j = 0; j < rows.length; j++) {
				String square = columns[i] + rows[j];
			}
		}
	}
	
	

}
