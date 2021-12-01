import sys
from typing import *

m: List[int] = []
for line in sys.stdin:
    m.append(int(line))


def answer(report: List[int]) -> int:
    answer: int = 0
    for i in range(3, len(report)):
        if m[i] > m[i - 3]:
            answer += 1
    return answer


print(answer(m))
