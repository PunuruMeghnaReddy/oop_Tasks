/*rite a Java program to declare variables of all primitive data types. Initialize them with valid values and print their sizes using appropriate wrappers.
*/
package tasks;

public class Task2 {

	public static void main(String[] args) {
         int age=19;
         String name="Meghna";
         float height=5.1f;
         double weight=52.45;
        System.out.println("Name: "+name);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight);
        System.out.println("Age: "+age);
        System.out.println("Sizes of primitive datatypes");
        System.out.println("int: " + Integer.SIZE);
        System.out.println("float: " + Float.SIZE);
        System.out.println("double: " + Double.SIZE);
        System.out.println("char: " + Character.SIZE);
	}

}
