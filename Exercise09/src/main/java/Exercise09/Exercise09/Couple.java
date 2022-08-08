package Exercise09.Exercise09;

public class Couple {
	private String[]bkColors  = {"WHITE","GREEN", "RED", "YELLOW", "BLACK", "ORANGE", "MAGENTA", "CYAN"};

	/**
	 * @param bkColors
	 */
	public Couple(String[] bkColors) {
		super();
		this.bkColors = bkColors;
	}

	public String[] getBkColors() {
		return bkColors;
	}

	public void setBkColors(String[] bkColors) {
		this.bkColors = bkColors;
	}
	
	

}
