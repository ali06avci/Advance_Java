package com.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingFile {

    /*Scanner
     *  1) Not multithreaded
     *  2) Not synchronized
     *  3) Use little buffer size than BufferedReader
     *  4) slower because the scanner does the parsing of the input data and BufferedReader simply reads a
     *  sequence of characters
     * 1) Multithreaded
     * 2) Synchronized
     * 3) Uses larger buffer
     * 4) Faster
     */

    public static void main(String [] args) {
        //1.way to read a file
//		try(BufferedReader bfr=new BufferedReader(new FileReader("src/com/fileio/folder1/MyFile.txt"))){
//			String line;
//
//			while((line=bfr.readLine())!=null) {
//				System.out.println(line);
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        // 2.way to read a file
//		try(Scanner scan=new Scanner(new File("src/com/fileio/folder1/MyFile.txt"))){
//
//			while(scan.hasNextLine()) {
//				String line=scan.nextLine();
//				System.out.println(line);
//			}
//
//		} catch (FileNotFoundException e) {
//			System.err.println("You have an error while reading file");
//		}

        //BufferedReader uses character stream

        //FileInputStream uses ByteStream

        //3.way to read a file

        try(FileInputStream fis=new FileInputStream("src/com/fileio/folder1/MyFile.txt")){
            int k;
            while ((k=fis.read())!=-1) {
                System.out.println((char)k);
            }


        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}