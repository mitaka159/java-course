import java.util.ArrayList;


public class Test {

	public static void main(String[] args) {
		
		ArrayList<Book>book=new ArrayList<Book>();
		
		book.add(new Book("Pederasite","Dimitar",623));
		
		Biblioteka temp=new Biblioteka("Koko","Plovdiv",book);
		Book temp1=new Book("Smeshnite","Gotinite",432);
		temp.addBook(temp1);
		
		temp.remBook(temp1);
		temp.print();
	}

}
