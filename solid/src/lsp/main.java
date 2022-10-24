package lsp;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Project p = new Project();
		ProjectFile file1 = new ProjectFile("../../files/File1");
		ProjectFile file2 = new ProjectFile("../../files/File2");
		ProjectFile file3 = new ProjectFile("../../files/File3");
		p.addProject(file3);
		p.addProject(file2);
		p.addProject(file1);
		p.loadAllFiles();
		p.storeAllFiles();
	}

}
