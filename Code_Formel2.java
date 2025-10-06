public class Code_Formel2
{
     public int calc(int a, int b)
     {
         return 2*(a+b);
     }
     public int calc(int was, boolean ja)
     {
         if(ja== false)
         {
             return 2+was;
         }
         else
         {
             return 2*was;
         }
     }
     public int clac (int x, int y, int z)
     {
         int res;
         res= calc(y, false)+ calc(z,z)+ calc(x,true);
         return res;
     }
    }
