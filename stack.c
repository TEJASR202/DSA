#include<stdio.h>
#define MAX_SIZE 5
char stack[MAX_SIZE];
int top=-1;
void push(char ch)
    {
        if(top==MAX_SIZE - 1)
        {
            printf("Stack Overflow");
        }
        else
        {
            top++;  
            stack[top]=ch;
        }
    }

void display()
    {
        printf("Reversed string: ");
        for(int i=top;i>=0;i--)
        {
            printf("%c",stack[i]);
        }
    }
int main()
{
    char str[5]="Hello";
    int i;
    for(int i=0;i<5;i++)
    {
        push(str[i]);
    }

    display();

    return 0;
}