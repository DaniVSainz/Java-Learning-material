import ocean.Fish;
import ocean.plants.Seaweed;

// or we can do ctrl-shift-o and eclipse will import anything we need and remove what we dont
// or we can do import.*; to import everything
// to use things from ocean package i need to import
public class app {
	public static void main(String[] args) {
		Fish fish1 = new Fish();
//		Now this works since we imported ocean.fish 
		Seaweed weed = new Seaweed();
	}
}

// You can have packages within packages