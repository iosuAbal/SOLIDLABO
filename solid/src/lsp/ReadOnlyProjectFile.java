package lsp;

public class ReadOnlyProjectFile extends ProjectFile{
	public ReadOnlyProjectFile(String filePath) {
		super(filePath);
		// TODO Auto-generated constructor stub
	}
	public void loadFile(){
		System.out.println("file loaded from "+filePath);
	}
}