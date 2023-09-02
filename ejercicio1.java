
public class Main
{
public static void main (String[] args) {
    
    //1 a 
    if(6<6*5)
       System.out.println("Hello");
       System.out.println("there");
       
       // Respuesta: Hello
       // there
       
       /*1 b */
       
       int x=1, y=2, z=3;
       
       if(x>y)
       if(x>z)
           System.out.println("11111");
        else 
           System.out.println("22222");
    // Respuesta: no imprime nada 
    
       
       /*1 c */
       
       if(x<z)
        System.out.println("*");
       else if (x==z)
        System.out.println("&");
       else
        System.out.println("$");
        
        //Respuesta: *
        
        
        /*1 d*/
        
        if(x<y)
         System.out.println("####");
        else 
         System.out.println("&&&&");
         System.out.println("****");
         
         //Respuesta: ####
         //****
         
         
         /*1 e*/
         
        if(x>y)
         System.out.println("####");
        else 
         System.out.println("&&&&");
         System.out.println("****");
         
         
         //Respuesta: &&&&
         // ****
         
         
         /*1 f*/
         
        int a1=100; int a2=200;
        
        if(a1>100 && a2<=200)
         System.out.println(a1+""+a2+""+(a1+a2));
        else 
         System.out.println(a1+""+a2+""+(2*a1-a2));
         
         
         //Respuesta: 1002000
         
         if(++x>y++ || x-->0)
             z++;
        else 
             z--;
        System.out.println(x+""+y+""+z);
        
        
        //Respuesta: 134
    }
}