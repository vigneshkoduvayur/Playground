#include<stdio.h>
int main ()
{
float a,b,c;
scanf("%f%f",&a,&b);
c=((a/360)*(2*3.14*b));
printf("%0.2f",c);
return 0;
}