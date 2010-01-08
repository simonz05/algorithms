#include <stdio.h>

int bfind(int *key, int *base, int n) {
    int b = 0, e = n, v;
    
    while (e >= b) {
        v = (b + e) / 2;
        if (base[v] < *key)
            b = v + 1;
        else if (base[v] > *key)
            e = v - 1;
        //else if (base[v] == *key) 
        // if not bigger or not smaller, then === key
        else 
            return v;            
    }
    return -1;
} 
void bdelete(int *key, int *base, int *n) {}
void binsert(int *key, int *base, int *n, int max) {}
