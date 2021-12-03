#include <iostream>
#include <bits/stdc++.h>
#include <vector>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int line;
    int answer = 0, answer2 = 0;
    vector<int> list;
    // use & to reference a variable

    while (cin >> line)
    {
        list.push_back(line);
    }

    for (int i = 1; i < list.size(); i++)
    {
        if (list[i - 1] < list[i])
        {
            ++answer;
        }
    }

    for (int i = 3; i < list.size(); i++)
    {
        if (list[i] > list[i - 3])
        {
            answer2++;
        }
    }

    cout << answer << endl;
    cout << answer2 << endl;
    return 0;
}