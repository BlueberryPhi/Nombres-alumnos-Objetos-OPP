/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import static java.lang.System.exit;
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      
        int cont=0;
        int op1=0;
        int op2=0;
        int bruh=1;
        
      int c=0;
        int ID=0;
        String n;
        String g;
        String carr;
        int m=0;
        int s=0; 
        Alumnos al1=null;
        Alumnos al2=null;
        Alumnos al3=null;
        Alumnos al4=null;
          Alumnos al5=null;
        Alumnos al6=null;
        Alumnos al7=null;
        Alumnos al8=null;
        Alumnos al9=null;
        Alumnos al10=null;
        do{
       Scanner scan=new Scanner(System.in);
       System.out.println("Seleccione que quiere hacer");
       System.out.println("1) Ingresar nuevo alumno");
       System.out.println("2) Buscar alumno");
       System.out.println("3) Salir del programa");
       op1= scan.nextInt();
       
           switch(op1){
               case 1:
                   System.out.println("Captura de datos del alumno");
                   System.out.print("Introduzca nombre: ");
                    n=scan.next();
                    System.out.print("Introduzca genero: ");
                    
                    g=scan.next();
                    
                    System.out.print("Introduzca matricula: ");
                    m=scan.nextInt();
                  
                   
                  
                    System.out.print("Introduzca semestre: ");
                    s=scan.nextInt();
                    System.out.print("Introduzca si tiene credencial: 0=No 1=Si    ");
                    c=scan.nextInt();
                     System.out.print("Introduzca la carrera que estudia: ");
                  carr=scan.next();
                  switch(bruh){
                       case 1: al1=new Alumnos(n,g,m,s,c,carr);bruh++;break;
                       case 2: al2=new Alumnos(n,g,m,s,c,carr);bruh++;break;
                       case 3: al3=new Alumnos(n,g,m,s,c,carr);bruh++;break;
                       case 4: al4=new Alumnos(n,g,m,s,c,carr);bruh++;break;
                       case 5: al5=new Alumnos(n,g,m,s,c,carr);bruh++;break;
                       case 6: al6=new Alumnos(n,g,m,s,c,carr);bruh++;break;
                       case 7: al7=new Alumnos(n,g,m,s,c,carr);bruh++;break;
                       case 8: al8=new Alumnos(n,g,m,s,c,carr);bruh++;break;
                       case 9: al9=new Alumnos(n,g,m,s,c,carr);bruh++;break;
                       case 10: al10=new Alumnos(n,g,m,s,c,carr);bruh++;break;
                       case 11: System.out.println("La capacidad maxima en este programa es de 10 alumnos desafortunadamente");break;
                   }
                   break;
                   
               case 2:
               if(bruh<=1){
                   System.out.println("No hay alumnos existentes. Prueba añadir alguno");
                   }
                   else
                   {
                  System.out.println("Buscar alumno");
                  System.out.println("Ingrese ID: ");
                  ID=scan.nextInt();
             boolean found;
             found=false;
             System.out.println(bruh);
                  if( al1.matricula==ID)
                         {
                            found=true;
                             System.out.println("Nombre ==>> " +  al1.nombre);
                             System.out.println("Genero ==>> " +  al1.genero);
                             System.out.println("Matricula ==>> " +  al1.matricula);
                              System.out.println("Carrera ==>> " +  al1.carrera);
                             System.out.println("Semestre ==>> " +  al1.semestre);
                             
                             if(al1.credencial==0)
                                 System.out.println("El alumno no cuenta con credencial");
                                 if(al1.credencial==1)
                                     System.out.println("El alumno cuenta con credencial");
                                 break;
                         }
                  
            
               else   if( bruh>2 && al2.matricula==ID)
                         {
                           found=true;
                             System.out.println("Nombre ==>> " +  al2.nombre);
                             System.out.println("Genero ==>> " +  al2.genero);
                             System.out.println("Matricula ==>> " +  al2.matricula);
                               System.out.println("Carrera ==>> " +  al2.carrera);
                             System.out.println("Semestre ==>> " +  al2.semestre);
                            if(al2.credencial==0)
                                 System.out.println("El alumno no cuenta con credencial");
                                 if(al2.credencial==1)
                                     System.out.println("El alumno cuenta con credencial");
                                 break;
                         } 
                             
                  
                  else   if( bruh>3 && al3.matricula==ID )
                         {
                        found=true;
                             System.out.println("Nombre ==>> " +  al3.nombre);
                             System.out.println("Genero ==>> " +  al3.genero);
                             System.out.println("Matricula ==>> " +  al3.matricula);
                               System.out.println("Carrera ==>> " +  al3.carrera);
                             System.out.println("Semestre ==>> " +  al3.semestre);
                             if(al3.credencial==0)
                                 System.out.println("El alumno no cuenta con credencial");
                                 if(al3.credencial==1)
                                     System.out.println("El alumno cuenta con credencial");
                                 break;
                         } 
                   
           
                  else  if( bruh>4 && al4.matricula==ID)
                         {
                             found=true;
                             System.out.println("Nombre ==>> " +  al4.nombre);
                             System.out.println("Genero ==>> " +  al4.genero);
                             System.out.println("Matricula ==>> " +  al4.matricula);
                               System.out.println("Carrera ==>> " +  al4.carrera);
                             System.out.println("Semestre ==>> " +  al4.semestre);
                            if(al4.credencial==0)
                                 System.out.println("El alumno no cuenta con credencial");
                                 if(al4.credencial==1)
                                     System.out.println("El alumno cuenta con credencial");
                                 break;
                         }
                    
                
                   else  if(bruh>5 && al5.matricula==ID )
                         {
                          found=true;
                             System.out.println("Nombre ==>> " +  al5.nombre);
                             System.out.println("Genero ==>> " +  al5.genero);
                             System.out.println("Matricula ==>> " +  al5.matricula);
                               System.out.println("Carrera ==>> " +  al5.carrera);
                             System.out.println("Semestre ==>> " +  al5.semestre);
                             if(al5.credencial==0)
                                 System.out.println("El alumno no cuenta con credencial");
                                 if(al5.credencial==1)
                                     System.out.println("El alumno cuenta con credencial");
                                 break;
                         } 
                   
                 
                   else  if(bruh>6 && al6.matricula==ID )
                         {
                           found=true;
                             System.out.println("Nombre ==>> " +  al6.nombre);
                          System.out.println("Genero ==>> " +  al6.genero);
                             System.out.println("Matricula ==>> " +  al6.matricula);
                               System.out.println("Carrera ==>> " +  al6.carrera);
                             System.out.println("Semestre ==>> " +  al6.semestre);
                            if(al6.credencial==0)
                                 System.out.println("El alumno no cuenta con credencial");
                                 if(al6.credencial==1)
                                     System.out.println("El alumno cuenta con credencial");
                                 break;
                         } 
           
              
                  else   if(bruh>7 && al7.matricula==ID )
                         {
                            found=true;
                             System.out.println("Nombre ==>> " +  al7.nombre);
                             System.out.println("Genero ==>> " +  al7.genero);
                             System.out.println("Matricula ==>> " +  al7.matricula);
                               System.out.println("Carrera ==>> " +  al7.carrera);
                             System.out.println("Semestre ==>> " +  al7.semestre);
                             if(al7.credencial==0)
                                 System.out.println("El alumno no cuenta con credencial");
                                 if(al7.credencial==1)
                                     System.out.println("El alumno cuenta con credencial");
                                 break;
                         } 
        
          
                    else  if( bruh>8 && al8.matricula==ID )
                         {
                            found=true;
                             System.out.println("Nombre ==>> " +  al8.nombre);
                             System.out.println("Genero ==>> " +  al8.genero);
                             System.out.println("Matricula ==>> " +  al8.matricula);
                               System.out.println("Carrera ==>> " +  al8.carrera);
                             System.out.println("Semestre ==>> " +  al8.semestre);
                            if(al8.credencial==0)
                                 System.out.println("El alumno no cuenta con credencial");
                                 if(al8.credencial==1)
                                     System.out.println("El alumno cuenta con credencial");
                                 break;
                         }
    
           
                  else  if(bruh>9 && al9.matricula==ID )
                         {
                             found=true;
                             System.out.println("Nombre ==>> " +  al9.nombre);
                           System.out.println("Genero ==>> " +  al9.genero);
                             System.out.println("Matricula ==>> " +  al9.matricula);
                               System.out.println("Carrera ==>> " +  al9.carrera);
                             System.out.println("Semestre ==>> " +  al9.semestre);
                            if(al9.credencial==0)
                                 System.out.println("El alumno no cuenta con credencial");
                                 if(al9.credencial==1)
                                     System.out.println("El alumno cuenta con credencial");
                                 break;
                         } 

             
                    else if(bruh>10 && al10.matricula==ID)
                         {
                            found=true;
                             System.out.println("Nombre ==>> " +  al10.nombre);
                            System.out.println("Genero ==>> " +  al10.genero);
                             System.out.println("Matricula ==>> " +  al10.matricula);
                               System.out.println("Carrera ==>> " +  al10.carrera);
                             System.out.println("Semestre ==>> " +  al10.semestre);
                           if(al10.credencial==0)
                                 System.out.println("El alumno no cuenta con credencial");
                                 if(al10.credencial==1)
                                     System.out.println("El alumno cuenta con credencial");
                                 break;
                         }
        
                   else    if(!found) {
                           System.out.println("ALUMNO NO REGISTRADO");    }      
             
         }
        }
        }while(op1<3);
    
  
      
}
}
