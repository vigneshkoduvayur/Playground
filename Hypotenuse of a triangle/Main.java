#include<stdio.h>
#include<math.h>
int main()
{
  double c,d;
  float a,b;
  scanf("%f%f",&a,&b);
  c=(a*a)+(b*b);
    d=sqrt(c);
  printf("%0.2f",d);
  return 0;
}