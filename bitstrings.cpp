#include <iostream>
using namespace std;
int main()
{
    int n;
    cin >> n;
    int mod = 1000000007;
    long ans = 1;

    while (n != 0)
    {
        ans = ans * 2;
        ans = ans % mod;
        n--;
    }
    cout << ans << endl;
    return 0;
}