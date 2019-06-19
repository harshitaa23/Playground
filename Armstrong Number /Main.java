#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int n,temp,s=0,f,i,c=0;
  scanf("%d",&n);
  temp=n;
  while(temp!=0)
  {
    c++;
    temp=temp/10;
  }
  temp=n;
  while(temp!=0)
  {
    f=1;
    int d=temp%10;
    s=s+pow(d,c);
    temp=temp/10;
  }
  if(s==n)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
      return 0;
}