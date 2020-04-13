package week_9_2;

public class PDFFile extends File{
	
	//How can we call File(String name)
	//super()
	
	public PDFFile(String name) {
		super(name);
	}

	@Override
	public void open() {
		System.out.println("Opening PDF file using Adobe Acrobat Reader");
		
	}
	

}
