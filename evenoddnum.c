#include<stdio.h>
int main()
{
    int num[]={1,2,3,4,5,6};
    int even=0,odd=0;
    for(int i=0;i<6;i++)
    {
        if(i%2==0)
        {
            even++;
        }
        else
        {
            odd++;
        }
    }
    printf("Even numbers:%d\n",even);
    printf("Odd numbers:%d\n",odd);
}