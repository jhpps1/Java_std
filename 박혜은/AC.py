import sys

input = sys.stdin.readline

# .reverse() -> 시간 오래 걸림
# 따라서 토글 방식으로 reverse여부를 판단하고, 마지막에 한 번만 뒤집기
def solve(command, n, p):
    rev = False
    if n == 0 and 'D' in command:
        return "error"
    for char in command:
        if char == 'R':
            rev = not rev
        elif char == 'D':
            if len(p) == 0:
                return "error"
            if rev:
                p.pop()
            else:
                p.pop(0)
    if rev:
        p.reverse()  # 변수에 할당하면 안된다(None 반환)
    # 이것때메 틀린게 아니라고 해줘..
    str = '[]'
    if p:
        str = '[' + ','.join(p) + ']'
    return str


T = int(input().rstrip())
for tc in range(1, T + 1):
    command = list(input().rstrip())
    n = int(input().rstrip())
    data = input().rstrip().strip('[]')  # 1,2,3
    arr = list(data.split(',')) if data else []  # ['1','2','3']
    result = solve(command, n, arr)
    print(result)