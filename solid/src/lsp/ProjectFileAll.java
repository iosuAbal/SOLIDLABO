package lsp;

public class ProjectFileAll extends ProjectFile{
	public ProjectFileAll(String filePath) {
		super(filePath);
		// TODO Auto-generated constructor stub
	}
	public void loadFile(){
		System.out.println("file loaded from "+filePath);
	}
	public void storeFile(){
		System.out.println("file saved to "+filePath);
	}
}
