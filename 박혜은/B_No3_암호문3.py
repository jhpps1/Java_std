T = 10

for tc in range(1, T + 1):
    # 첫 번째 줄: 암호문 개수 N
    N = int(input())
    # 두 번째 줄: 원본 암호문 뭉치
    arr = list(map(int, input().split()))
    # 세 번째 줄 : 명령어의 개수 ( 250 ≤ M ≤ 500 의 정수)
    M = int(input())
    # 네 번째 줄: 명령어
    commands = list(map(str, input().split()))

    i = 0
    while True:
        if i >= len(commands):
            break

        if commands[i] == 'I':  # I 3 2 123152 487651
            x, y = int(commands[i+1]), int(commands[i+2])  # 3, 2
            for j in range(y):  # 0, 1
                arr.insert(x, commands[i+2+y-j])
            i += (2 + y + 1)  # 다음 알파벳의 위치
        elif commands[i] == 'D':  # D 4 4
            x, y = int(commands[i+1]), int(commands[i+2]) # 4, 4
            for _ in range(y):
                arr.pop(x)
            i += 3
        elif commands[i] == 'A':  # A 2 421257 796813
            y = int(commands[i + 1])
            for j in range(y):  # 0, 1
                arr.append(commands[i + 2 + j])
            i += (1 + y + 1)

    print(f'#{tc}', *arr[:10])