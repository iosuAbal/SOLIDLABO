package lsp;

public class ProjectFileAll extends ProjectFile implements  iStore{
	
	public ProjectFileAll(String filePath) {
		super(filePath);
	}
	
	public void storeFile(){
		System.out.println("file saved to "+filepath);
	}
}
