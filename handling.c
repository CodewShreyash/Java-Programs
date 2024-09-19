#include<stdio.h>
#include<conio.h>
void main()
{
FILE *fp;
fp=fopen("Welcome.txt","w");
fprintf(fp,"My Friend Name is AR");
printf("File Are created");
fclose(fp);
getch();
}


