import java.util.ArrayList;


public class Biblioteka {

	private String name;
	private String adres;
	private ArrayList<Book>books=new ArrayList<Book>();
	
	public Biblioteka() {
		super();
		
	}

	public Biblioteka(String name, String adres, ArrayList<Book> books) {
		super();
		this.name = name;
		this.adres = adres;
		this.books = books;
	}
	 
	public void addBook(Book temp){
		books.add(temp);
	}
	public void remBook(Book temp){
		books.remove(temp);
	}
	public void print(){
		System.out.print(name);
		System.out.print(adres);
		System.out.println();
		
       for(int i=0;i<books.size();i++){
    	   System.out.println(books.get(i).getAutor());
    	   System.out.println(books.get(i).getName());
    	   System.out.println(books.get(i).getPage());
       }
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
}
