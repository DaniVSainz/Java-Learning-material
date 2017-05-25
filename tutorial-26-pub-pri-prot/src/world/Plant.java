package world;

public class Plant {
//	This is bad practice, you usually shouldnt make instance variables public
//	You want to make them private and hide them from the world and access via methods
//	usually constant variables are static
	public  String name;
//	Uppercase signifies constant
	
// Acceptable nothing wrong with public final constants	
	public final static int  ID = 8;
	
//	Only accessable from within this class
	private String type;
	
	int height;
	
//	Accesible by childs
	protected String size;
	public Plant(){
		name = "Thornbush";
		
		type = "plant";
		
		size = "medium";
		
		height = '8inches';
	}
}