package lsp;

import java.util.List;


public class Project {
	public List<iLoad> files;
	public List<iStore> files2;
	public void addProject(ProjectFile p){
		files.add(p);
	}
	public void loadAllFiles(){
		for (iLoad f:files)
			f.loadFile();
	}
	public void storeAllFiles(){
		for (iStore f:files2) {
			f.storeFile();
		}
			
	}
}