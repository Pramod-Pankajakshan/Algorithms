package advancedjava;

public class Cow implements Mammal{

	@Override
	public boolean alive() {		
	return true;
	}

	@Override
	public Color getColor() {		
	return Color.BROWN;
	}

	@Override
	public TYPE getType() {
		return TYPE.Land;
		
	}

}


