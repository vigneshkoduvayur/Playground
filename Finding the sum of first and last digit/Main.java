#include <stdio.h>
 
int main()
{
    int num, last,a,s ;
   
    scanf("%d", &num);
 
    last = num%10;
    
 
    while(num>=10)
    {
        num = num/10;
    }
  s=num+last;
  printf("%d",s);
  return 0;
}