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
		
		//FileCopyPaste.copyFile("d:/Müzikler/", "d:/yeni/recep/özen/", "01. Bangýr Bangýr.mp3");
		//FileCopyPaste.cutFile("d:/", "d:/yeni/recep/özen/", "okunan.txt");
		FileCopyPaste.FileList("c:/");
		System.out.println("----------------");
		FileCopyPaste.FileList("d:/");
		System.out.println("----------------");
		FileCopyPaste.FileList("f:/");
	}

}
