/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import GUI.main;
import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
        
       /* Scanner inputcommand = new Scanner(System.in);
	System.out.println("Add user press 1 delete user press 2 : ");
        int x = inputcommand.nextInt();

	String getchar1 = inputcommand.nextLine();
	
        switch(x)
    {
	case 1:
	System.out.println("Enter name of the new user: ");
	String add_user = inputcommand.nextLine();
	String add_command = "useradd -m -s /bin/bash ";
	String total_add_command = add_command + add_user;// now total_add_command = user -m -s /bin/bash username

	// this try and catch from line 25 to 38 equal system() function in c language
	//this function used to run any command 
        try
        {
        Process p = Runtime.getRuntime().exec(total_add_command);
        BufferedReader stdinput = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String s;
        while(((s =stdinput.readLine())) !=null){
        System.out.println(s);}
	p.destroy();
	p.waitFor();
        }
        catch(Exception e)
        {
            System.out.println(e);    
        }

	System.out.println("user added");
	break;

	case 2:
	System.out.println("Enter username to delete it: ");
	String delete_user = inputcommand.nextLine();
	String delete_command = "userdel -r ";
	String total_del_command = delete_command + delete_user;// now total_del_command = userdel -r username
	
	// here i using thi try and catch again to delete user 
        try
        {
        Process p = Runtime.getRuntime().exec(total_del_command);
        p.waitFor();
        BufferedReader stdinput = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String s;
        while(((s =stdinput.readLine())) !=null){
        System.out.println(s);}
	p.destroy();
        }
        catch(Exception e)
        {
            System.out.println(e);    
        }

	System.out.println("user deleted");
	break;

	default:
	System.out.println("soryy, enter just 1 or 2");

	break;

    }*/
    }
    
}
