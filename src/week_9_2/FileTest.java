package week_9_2;

public class FileTest {

	public static void main(String[] args) {
		
		//File file1 = new File() --> will not worl, cannot create object
		XLSFile xl = new XLSFile();
		xl.open();
		xl.close();
		xl.setName("TestData.xls");
		System.out.println("XLS file name: "+ xl.getName());
		
		System.out.println(File.count);
		System.out.println(XLSFile.count);
		
		JPGFile jpg = new JPGFile();
		jpg.setName("graduation.jpg");
		jpg.open();
		jpg.close();
		System.out.println("JPG file name: "+ jpg.getName());
		
		System.out.println(File.count);
		System.out.println(JPGFile.count);
		System.out.println(XLSFile.count);
		
		PDFFile pdf = new PDFFile("Selenium.pdf");
		pdf.open();
		pdf.close();
		
		System.out.println(File.count);
		System.out.println(PDFFile.count);

	}

}
