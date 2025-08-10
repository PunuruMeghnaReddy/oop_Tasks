package C0_1;
class Player{
	String name;

    Player(String name) {
        this.name = name;
        System.out.println(name + " created.");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " is being garbage collected.");
    }
}

public class Basics_4 {

	public static void main(String[] args) {
		 for (int i = 1; i <= 5; i++) {
	            Player p = new Player("Player" + i);
	        }
	        System.gc();

	        System.out.println("Main method ends.");

	}

}
