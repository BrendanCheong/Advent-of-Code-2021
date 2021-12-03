#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    string command;
    int value;
    int horizontal = 0, vertical = 0, aim = 0;

    while (cin >> command >> value)
    {
        if (command.compare("forward") == 0)
        {
            horizontal += value;
            vertical += aim * value;
        }
        else if (command.compare("up") == 0)
        {
            aim -= std::max(0, value);
        }
        else
        {
            aim += value;
        }
    }
    cout << horizontal * vertical << endl;
    return 0;
}