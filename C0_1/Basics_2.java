package C0_1;
class Book{
	private String Title;
	private String Author;
	private int price;
	
	void setter(String Title,String Author,int price)
	{
		this.Title=Title;
		this.Author=Author;
		this.price=price;
	}
	void getter()
	{
		System.out.println("Title of the book: "+Title);
		System.out.println("Author of the book: "+Author);
		if(price>0)
		System.out.println("Price of the book: "+price);
		else
			System.out.println("Invalid price");
	}
}
public class Basics_2 {

	public static void main(String[] args) {
		Book b1 = new Book();
        b1.setter("The Alchemist", "Paulo Coelho", 299);

        Book b2 = new Book();
        b2.setter("Invisible Man", "Ralph Ellison", -50); // Invalid price

        Book b3 = new Book();
        b3.setter("Atomic Habits", "James Clear", 450);

        System.out.println("\n--- Book Details ---");
        b1.getter();
        b2.getter();
        b3.getter();

	}

}
