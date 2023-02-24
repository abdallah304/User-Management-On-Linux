/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class docommand {

public boolean command(String x)
        {
            
            try
            {
                Process p = Runtime.getRuntime().exec(x);
                BufferedReader stdinput = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String s;
                while(((s =stdinput.readLine())) !=null){
                System.out.println(s);}
                p.destroy();
                p.waitFor();
                return true;
            }
            catch(Exception e)
            {
                System.out.println(e); 
                return false;
            }
        }
}
