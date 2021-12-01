import sys
from typing import *

m: List[int] = []
for line in sys.stdin:
    m.append(int(line))


def answer(report: List[int]) -> int:
    answer: int = 0
    for i in range(1, len(report)):
        if (report[i - 1] < report[i]):
            answer += 1
    return answer


print(answer(m))
