package com.techlabs.foldertest;

import com.techlabs.Folder.Folder;
import com.techlabs.file.File;
import com.techlabs.istorable.IStorable;

public class FolderTest {
	
	public static void main(String[] args) {
		
		Folder movieFolder = new Folder("movie");
		Folder actionFolder = new Folder("action");
		Folder comedyFolder = new Folder("comedy");
		
		File abcFile = new File("abc", 100, "avi");
		File defFile = new File("def", 100, "mp4");
		File mnoFile = new File("mno", 100, "avi");
		File pqrFile = new File("pqr", 100, "mp4");
		File xyzFile = new File("xyz", 100, "avi");
		File ghiFile = new File("ghi", 100, "mp4");
		
		comedyFolder.addChildren(mnoFile);
		comedyFolder.addChildren(pqrFile);
		
		actionFolder.addChildren(xyzFile);
		actionFolder.addChildren(ghiFile);
		
		movieFolder.addChildren(abcFile);
		movieFolder.addChildren(defFile);
		movieFolder.addChildren(comedyFolder);
		movieFolder.addChildren(actionFolder);
		
		movieFolder.display(new StringBuilder(""));
	}

}
