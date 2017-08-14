package com.techify.java.advanced;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFromNotepad {

	public static void main(String[] args) {
		readData();
	}

	public static void readData() {
		try {
			String fileName = "D:\\ReadData\\TestData.txt"; // file location
			File f = new File(fileName); // creating java file
			FileReader file = new FileReader(f); // file reader 
			BufferedReader reader= new BufferedReader(file);
			
			//BufferedReader reader= new BufferedReader(new FileReader("D:\\ReadData\\TestData.txt"));
			System.out.println(reader.readLine().toString());
			
			
			/*String line="";
			while((line == reader.readLine()) != false){
				System.out.println(line);
			}*/
			reader.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
