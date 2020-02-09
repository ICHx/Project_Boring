#include <stdio.h>
#define DEBUG 0
void algorithm(float, float);
void accumulator();
int main()
{
    puts("今有松竹并生，知云松初长a尺，竹长b尺。松日自半，竹日自倍。问松竹何日而长等。\n\n");
    float num_a, num_b;
    puts("enter a");
    scanf("%f", &num_a);
    printf("received %f\n", num_a);
    puts("enter b");
    scanf("%f", &num_b);
    printf("received %f\n", num_b);
    getchar();

    algorithm(num_a, num_b);
    getchar();
}

void algorithm(float a, float b)
{
#if DEBUG
    printf("%.2f %.2f\n", a, b);
#endif

    if (a < b)
    {
        printf("ans=%.2f %.2f", a, b);
        return;
    }
    else
    {
        if (a < __INT32_MAX__)
        {
            algorithm(1.5 * a, 2 * b);
            accumulator();
        }
        else
        {
            puts("e: too large! assume no sol!");
            exit(2);
        }
        return;
    }
}

void accumulator()
{
    static int n = 1;
    printf("\nn=%d", n++);
}
