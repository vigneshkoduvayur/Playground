#include<stdio.h>
int main()
{
  int num1, num2;
 
  scanf("%d%d", &num1, &num2);

    if (num1 > num2)
    {
        printf("num1 is the greatest", num1);
    }
    else
    {
        printf("num2 is the greatest", num2);
    }

    return 0;
}