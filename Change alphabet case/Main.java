#include<stdio.h>
void main()
{
   char ch;
  
   scanf("%c", &ch);
   if('a' <=  ch && ch <= 'z')
   {
      printf("%c",ch-32);
   }
   if('A' <=  ch && ch <= 'Z')
   {
      printf("%c", ch+32);
   }
   else
   {
     
   }
}