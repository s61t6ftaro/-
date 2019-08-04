public class Renshu02 {
	public static void main(String args[]) {
		FileInfo fi1,fi2;
		fi1 = new FileInfo("sample.txt",1536);
		fi2 = new FileInfo("test.doc",16380);
		FileInfo fi3 = fi2;
		System.out.print("file1:"+fi1.getFileName());
		System.out.println(":"+fi1.getFileSize()+"バイト");
		System.out.print("file2:"+fi2.getFileName());
		System.out.println(":"+fi2.getFileSize()+"バイト");
		System.out.print("file3:"+fi3.getFileName());
		System.out.println(":"+fi3.getFileSize()+"バイト");
	}
}
