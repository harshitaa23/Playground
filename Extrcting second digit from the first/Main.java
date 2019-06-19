#include <stdio.h>
int main() {
	int a[50],n,i=0,count=0;
  scanf("%d",&n);
  while(n!=0)
  {
  a[i]=n%10;
    i++;
    count++;
    n=n/10;
  }
  printf("%d",a[count-2]);
	return 0;
}