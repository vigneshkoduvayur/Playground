
#include<stdio.h>

int main()
{
    double a, b, c;
    scanf("%lf%lf%lf", &a, &b, &c);  //lf is a format specifier to take double as input

    // a is the largest
    if(a >= b && a >= c)
    {
        if(b >= c)
        {
            /*
                .2lf restricts the number till 
                2 decimal places
            */
            printf("%lf", b);
        }
        else
        {
            printf("%lf", c);
        }
    }
    else if(b >= a && b >= c)
    {
        if(a >= c)
        {
            printf("%lf",a);
        }
        else
        {
            printf("%lf",c);
        }
    }

    // c is the largest number of the three
    else if(a >= b)
   
        printf("%lf", a);
    else
    {
        printf("%lf", b);
    }

    return 0;
}