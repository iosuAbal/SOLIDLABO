package lsp;

public class ProjectFile implements iLoad{
	protected String filepath;
	public ProjectFile(String filePath) {
		this.filepath=filePath;
	}
	public void loadFile(){
		System.out.println("file loaded from "+filepath);
	}
}