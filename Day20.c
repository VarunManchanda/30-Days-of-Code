#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main() {
    int n, i, Swaps=0, temp;
    scanf("%d", &n);
    int a[n];
    for(i = 0; i < n; i++){
       scanf("%d",&a[i]);
    }
    for (int i = 0; i < n; i++) {
    for (int j = 0; j < n - 1; j++) {
        if (a[j] > a[j + 1]) {
            temp = a[j+1];
            a[j+1] = a[j];
            a[j] = temp;
            Swaps++;
        }
    }
    if (Swaps == 0) {
        break;
    }
    }
    printf("Array is sorted in %d swaps.\n", Swaps);
    printf("First Element: %d\n", a[0]);
    printf("Last Element: %d\n", a[n-1]);
    
    return 0;
}

