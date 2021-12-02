import re
from typing import *


def answer() -> int:
    f = open("test.in")
    file: str = f.read()
    f.close()
    horizontal: int = 0
    vertical: int = 0
    for line in file.splitlines():
        line: List[str] = re.findall(r'[A-Za-z]+|\d+', line)
        match line[0]:
            case "forward":
                horizontal += int(line[1])
            case "down":
                vertical += int(line[1])
            case "up":
                vertical -= int(line[1])
    return horizontal * vertical


print(answer())
