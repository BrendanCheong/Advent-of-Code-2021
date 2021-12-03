#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    string command;
    int value;
    int horizontal = 0, vertical = 0;
    while (cin >> command >> value)
    {
        if (command.compare("forward") == 0)
        {
            horizontal += value;
        }
        else if (command.compare("down") == 0)
        {
            vertical += value;
        }
        else
        {
            vertical -= value;
        }
    }
    cout << horizontal * vertical << endl;
    return 0;
}