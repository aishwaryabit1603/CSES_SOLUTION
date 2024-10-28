#include <iostream>
using namespace std;
int main()
{
    long t;
    cin >> t;
    while (t > 0)
    {
        long a, b;
        cin >> a;
        cin >> b;
        if (a >= b)
        {
            swap(a, b);
        }
        if ((a + b) % 3 == 0 && 2 * a >= b)
        {
            cout << "YES" << endl;
        }
        else
        {
            cout << "NO" << endl;
        }
        t--;
    }
    return 0;
}