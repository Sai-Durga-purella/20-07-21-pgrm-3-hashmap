import java.util.*;
 
class map1 
 
{ 
   
public static void main(String args[])
    
{ 
       
HashMap<Integer,Integer> x=new HashMap<Integer,Integer>();
       
 int[] arr= {2,3, 4, 5, 4, 6, 4, 7, 4, 5, 6, 6};
         
for(int i=0;i<arr.length;i++) 
         
{ 
          
int key; 
           
key=arr[i];
            
if(x.containsKey(key)) 
             
x.put(key,x.get(key)+1); 
              
x.put(key,1); 
             
 } 
               
System.out.println(x);
                
 } 
}




output:
{2=1, 3=1, 4=4, 5=2, 6=3,  7=1} 