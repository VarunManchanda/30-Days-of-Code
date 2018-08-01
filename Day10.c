#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

#include<stdio.h>
int main(){
	
int n, temp, r, c=-1, i, max=0, var=0;
scanf("%d", &n);
temp = n;
int ar[n];
while(temp!=0){
	c++;
	ar[c] = temp%2;
	temp = temp/2;
	

}	
	
	for(i=0; i<=c; i++){
		if(ar[i]==1){
			max++;
			}
			 if(ar[i]==0){
			 	if(var<=max){
				var = max;
				}
				max=0;
				continue;
             }
	}
	if(var>max)
	printf("%d\n", var);
	else 
	printf("%d\n", max);
	
	
	return 0;
}


