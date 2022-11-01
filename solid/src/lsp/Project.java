package lsp;

import java.util.Vector;

public class Project {
	public Vector<ProjectFile> files;
	public void addProject(ProjectFile p){
		files.add(p);
	}
	public void loadAllFiles(){
		for (ProjectFile f:files)
			f.loadFile();
	}
	public void storeAllFiles(){
		for (ProjectFile f:files)
			if(f instanceof ProjectFileAll) {
				((ProjectFileAll) f).storeFile();
			}
	}
}