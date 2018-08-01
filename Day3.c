#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    float mealcost, tip, tax, totalcost;
    int tippercent, taxpercent, d;
    
    scanf("%f%d%d",&mealcost,&tippercent,&taxpercent);
    
    tip = mealcost*tippercent/100;
    tax = mealcost*taxpercent/100;
    totalcost = mealcost+tip+tax;
    d = round(totalcost);
    printf("The total meal cost is %d dollars.\n", d);
    return 0;
}

