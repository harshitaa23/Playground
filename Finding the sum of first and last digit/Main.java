#include <stdio.h>
int main() {
	int n,r;
  scanf("%d",&n);
   int f=n%10;
  while(n!=0)
  {
    r=n%10;
    n=n/10;
  }
  printf("%d",(r+f));
  
	return 0;
}