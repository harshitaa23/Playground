#include <stdio.h>
int main() 
{
	int a;
  scanf("%d",&a);
  for(int i=0;i<=2*a-1;i++)
  {
    if(i%2==1)
    {
    printf("%d\n",i);
    }
  }
	return 0;
}