package day39;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class TextFileToList {

	 public static void main(String[] args) {

		    List<String> lineLst = getTextFileAsList("RandomFileName.txt");
		    //List<String> lineLst2 = getTextFileAsList("");
		   
		    String fullPath = "/Users/batyrjany/eclipse-workspace/My Spring Class_2019/RandomFileName";
		    
		    List<String> lineLst1 = getTextFileAsList(fullPath);
		    
		    List<String> lineLst2 = getTextFileAsList("Names.txt");
		    
		    List<String> lineLst3 = getTextFileAsList("texting.txt");
		    
		   // System.out.println(lineLst1);
		    
		    System.out.println(lineLst);
		    
		    System.out.println(lineLst2);
		    
		    System.out.println(lineLst3);
		    
		    
		    
		    
		    System.out.println(  lineLst.size()  );
		    
		    // xls  doc  ppt  pdf
		    String s = "erat_quisque_erat.xls" ; 
		    // how do we just get file extention 
		    String fileExtention = s.substring( s.indexOf(".")+1  ); 
		    System.out.println( fileExtention   );
		    
		    
		    int count = 0;
		    
		    for (String each : lineLst) {
		     
		    	if(each.endsWith(".xls"))
		    		count++;
		    	
		    	
		    	//System.out.println(each);
		    }
		    System.out.println("excel file count is : "+ count);
		    
		    
		    
		    // Task2 find the longest file name
		    
		    
		    String longest = lineLst.get(0);
		    
		   
		    
		    for (String each : lineLst) {
				
		    	if(each.length()>longest.length()) {
		    		longest=each;
		    	}
		    	
		    	
			}System.out.println("Longest file name is : " + longest);
			
			
			
			// find longest excel file
			
			String lxls = lineLst.get(0);
			for (String each : lineLst) {
			     
		    	if(each.endsWith(".xls") ) {
		    		if(each.length()>lxls.length())
		    			lxls=each;
		    	}
		    		
		    	
		    }System.out.println("The longest xls file name is "+ lxls);
		   
		    
		   
			
		    
		    
		    
		  }
		  /*
		   * DO NOT MODIFY AND JUST USE IT
		   * Method name : getTextFileAsList2
		   * @parameter  location of text file as String
		   *   if your file is at root path (right under project folder)
		   *  you may directly path your filename.txt
		   *  if not pass /your/own/folder/name/filename.txt as String to method
		   * 
		   * @return List of String that contain each line as per element

		   */
		  public static List<String> getTextFileAsList(String filePath) {

		    List<String> allLines = null;
		    try {
		      allLines = Files.readAllLines(Paths.get(filePath));
		    } catch (Exception e) {
		      System.out.println("Wrong file path probably");
		    }
		    return allLines;

		  }
		}