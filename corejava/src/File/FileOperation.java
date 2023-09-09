package File;

import java.io.*;

public class FileOperation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stubE:
	File newFile=new File("E:\\javaprograms");
	//File newFile=new File("test12.txt");
	//System.out.println("Absolute path"+newFile.getAbsolutePath());
	//File newFile1=new File("ListOfCourses2.txt");//relative
	//System.out.println("Relative path"+newFile1.getCanonicalPath());
	//System.out.println("Absolute path"+newFile1.getAbsolutePath());
	//System.out.println("RW"+newFile1.canRead());
	//System.out.println("Read Write"+newFile1.canWrite());
//	System.out.println("File Name"+newFile1.getName());
	//System.out.println("size of the file"+newFile1.length());
	//System.out.println("Relative path"+newFile1.getCanonicalPath());
	//System.out.println(newFile.getParent());
	
	//File newFile2=new File("E:\javaprograms);//relative
	//String[] List= newFileF2.List();
	//System.out.println("List of files:"+List.length);
	//for(int i=0;i<List.length;i++) {
//		System.out.println(List[i]);
	//}
	if(newFile.createNewFile()) {
		System.out.println("File Created");
	}
	else {
		System.out.println("File exists");
	}
	}}

	

