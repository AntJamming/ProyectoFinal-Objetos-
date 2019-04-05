/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JTextField;

/**
 *
 * @author e011618
 */
public class Reader {
    
    public Reader() 
    {
        String cadena;
        
        
        try{
        FileReader f = new FileReader("C:\\Users\\e011618\\Desktop\\Usuarios.txt");
        BufferedReader b = new BufferedReader(f);
        while((cadena=b.readLine())!=null)
        {
           
            this.adder(cadena);
            
            
        }
        }
        catch(Exception e){
            
        }
        System.out.println(Arrays.toString(User.toArray()));
        System.out.println(Arrays.toString(Password.toArray()));
        
        
    }
    
    
    public void adder(String line)
    {
        
        StringTokenizer liner = new StringTokenizer(line," ");
        s=liner.nextToken();
        p=s.substring(s.indexOf(",")+1);
        StringTokenizer use = new StringTokenizer(s,",");
        u=use.nextToken();
        
        
        
        
        
        User.add(u);
        Password.add(p);
        
        

 
    }
    
    /*
    public void checker()
    {
        Scanner sc= new Scanner(System.in);
        Inputs= "Carlos";
        Inputp= "Crews";
        
       if(Inputs.equals(s) && Inputp.equals(p));
       {
           
           
               System.out.println("a");
           
           
       }
    }
    */
    public void checker(String usuario, String pass)
    {
        
        Inputs=usuario;
        Inputp=pass;
        
       for(int i=0;i<User.size();i++)
       {
           if(User.get(i).equals(Inputs))
           {
               iu=User.get(i);
               pos=i;
               break;
           }
          
       }
       for(int i=0;i<Password.size();i++)
       {
           
               ip=Password.get(pos);
               break;
           
       }
        
       
       
      
       
    }
    
    public String printer()
    {
       String res = "";
       if(iu.equals(Inputs) && ip.equals(Inputp))
       {
           res="Aceptado";
          
       }
       else 
       {
           res="Acceso Denegado";
       }
        return res;
    }
   
    ArrayList<String> User= new ArrayList<>();
    ArrayList<String> Password= new ArrayList<>();
    String s;
    String p;
    String u;
    String Inputs;
    String Inputp;
    
    
    
    boolean x=true;
    //ints para validar
    int pos;
    String ip="";
    String iu="";

  
    
    
}
