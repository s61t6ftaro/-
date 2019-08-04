public class FileInfo {
		private String fileName;
		private int fileSize;

		public FileInfo(String fileName,int fileSize) {
				this.fileName = fileName;
				this.fileSize = fileSize;
				fileSize=0;
		}

		public String getFileName() {
			return fileName;
		}

		public int getFileSize() {
			return fileSize;
		}

		public void addFileSize(int addSize) {

		}

}
