package com.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Serialization_Deserialization {

    public static void main(String[] args) {

//	User user1=new User(1L, "John Coffee" , "334-34-3434");
//	User user2=new User(1L, "Walter White" , "888-34-3434");
//	User user3=new User(1L, "Maximus Decimus" , "777-34-3434");
//
//	try(FileOutputStream fos=new FileOutputStream("user.ser")){
//		try(ObjectOutputStream oos=new ObjectOutputStream(fos)){
//			oos.writeObject(user1);
//			oos.writeObject(user2);
//			oos.writeObject(user3);
//		}
//	} catch (FileNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}

        readObject();

    }

    static void readObject() {

        try(FileInputStream fis=new FileInputStream("user.ser")){

            try(ObjectInputStream ois=new ObjectInputStream(fis)){

                try {
                    User user1= (User) ois.readObject();
                    User user2= (User) ois.readObject();
                    User user3= (User) ois.readObject();

                    System.out.println(user1.toString());
                    System.out.println(user2.toString());
                    System.out.println(user3.toString());

                } catch (ClassNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
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


//SerialversionUID is used to ensure that during deserialization the same class is loaded
class User implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String ssn;
//	transient private String ssn;

    public User(Long id, String name, String ssn) {

        this.id=id;
        this.name=name;
        this.ssn=ssn;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", ssn=" + ssn + "]";
    }

}