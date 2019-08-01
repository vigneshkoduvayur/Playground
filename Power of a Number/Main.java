#include <stdio.h>
#include <math.h>
int main()
{
    double base, exponent, result;
    scanf("%lf", &base);
    scanf("%lf", &exponent);
    // calculates the power
  if (exponent >=0)
  {
    result = pow(base, exponent);
    printf("%.0lf",result);
  }
  else
  {
    printf("Wrong input");
  }
    return 0;
}