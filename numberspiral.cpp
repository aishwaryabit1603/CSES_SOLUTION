#include <iostream>
using namespace std;

int main()
{
    long long t;
    cin >> t;
    while (t > 0)
    {
        long long y, x;
        cin >> y >> x;

        if (x == y)
        {
            long long d = y * x - (y - 1);
            cout << d << endl;
        }
        else if (y > x)
        {
            // row (y) > column (x)
            long long diagonal = y * y - (y - 1);
            if (y % 2 == 0)
            {
                cout << diagonal + (y - x) << endl;
            }
            else
            {
                cout << diagonal - (y - x) << endl;
            }
        }
        else
        {
            // column (x) > row (y)
            long long diagonal = x * x - (x - 1);
            if (x % 2 != 0)
            {
                cout << diagonal + (x - y) << endl;
            }
            else
            {
                cout << diagonal - (x - y) << endl;
            }
        }
        t--;
    }
    return 0;
}
