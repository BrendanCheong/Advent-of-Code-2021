import re
from typing import *


def answer() -> int:
    f = open("test.in")
    file: str = f.read()
    f.close()
    horizontal: int = 0
    vertical: int = 0
    aim: int = 0
    for line in file.splitlines():
        line: List[str] = re.findall(r'[A-Za-z]+|\d+', line)
        match line[0]:
            case "forward":
                horizontal += int(line[1])
                vertical += aim * int(line[1])
            case "down":
                aim += int(line[1])
            case "up":
                aim -= int(line[1]) if aim != 0 else 0
    return horizontal * vertical


print(answer())