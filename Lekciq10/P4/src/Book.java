
public class Book {
 protected String name;
 protected String autor;
 protected int page;
 
 public Book(){
	 this.name="";
	 this.autor="";
	 this.page=0;
 }
 public Book(String name,String autor,int page){
	 this.name=name;
	 this.autor=autor;
	 this.page=page;
 }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public int getPage() {
	return page;
}
public void setPage(int page) {
	this.page = page;
}
 
 
}
