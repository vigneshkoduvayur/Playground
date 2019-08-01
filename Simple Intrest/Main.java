#include <stdio.h>

int main()
{
    float principle, time, rate, SI;

    /* Input principle, rate and time */
 
    scanf("%f", &principle);

   
    scanf("%f", &time);

   
    scanf("%f", &rate);

    /* Calculate simple interest */
    SI = (principle * time * rate) / 100;

    /* Print the resultant value of SI */
    printf("%f", SI);

    return 0;
}