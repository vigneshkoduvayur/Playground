
#include<stdio.h>
#include<math.h>
int main()
{
//Type your code here
int input;
scanf("%d", &input);
if(input % 2 == 0)
{
int number = input/2;
int x = (number  -1);
int output = pow(3, x);
printf("%d", output);
}
else
{
int number = (input+1)/2;
int x = number -1;
int output = pow(2, x);
printf("%d", output);
}
return 0;
}