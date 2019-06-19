#include <stdio.h>
int main() {
	//Type your code
  int n,temp,s=0,f=1;
  scanf("%d",&n);
  temp=n;
  while(temp!=0)
  {
    int d=temp%10;
    f=1;
    for(int i=1;i<=d;i++)
    {
      f=f*i;
    }
    s=s+f;
    temp=temp/10;
  }
  if(s==n)
    printf("Yes");
  else
    printf("No");
	return 0;
}