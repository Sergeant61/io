package io.recepozen.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import io.recepozen.file.FileCopyPaste;

public class Main {

	public static void main(String[] args) {
		List<String> list = FileCopyPaste.fileExists();
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		//FileCopyPaste.copyFile("d:/M�zikler/", "d:/yeni/recep/�zen/", "01. Bang�r Bang�r.mp3");
		//FileCopyPaste.cutFile("d:/", "d:/yeni/recep/�zen/", "okunan.txt");
		FileCopyPaste.FileList("c:/");
		System.out.println("----------------");
		FileCopyPaste.FileList("d:/");
		System.out.println("----------------");
		FileCopyPaste.FileList("f:/");
	}

}
