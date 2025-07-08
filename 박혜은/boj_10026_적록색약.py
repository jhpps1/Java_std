from collections import deque

N = int(input())
arr = [list(input()) for _ in range(N)]

d = [(-1, 0), (1, 0), (0, -1), (0, 1)]
visited1 = [[0]* N for _ in range(N)]
visited2 = [[0]* N for _ in range(N)]


def bfs(arr, visited, r, c, is_color_blind):
    q = deque([(r, c)])
    visited[r][c] = 1

    while q:
        cr, cc = q.popleft()  # 첫 번째 요소 반환

        for dr, dc in d:
            nr, nc = cr + dr, cc + dc
            if N > nr >= 0 and N > nc >= 0 and not visited[nr][nc]:
                if is_color_blind:
                    if (arr[nr][nc] in 'RG' and arr[cr][cc] in 'RG') or arr[nr][nc] == arr[cr][cc]:
                        visited[nr][nc] = 1
                        q.append((nr, nc))
                elif arr[nr][nc] == arr[cr][cc]:
                    visited[nr][nc] = 1
                    q.append((nr, nc))

cnt1 = 0
cnt2 = 0
for i in range(N):
    for j in range(N):
        if not visited1[i][j]:
            bfs(arr, visited1, i, j, False)
            cnt1 += 1
        if not visited2[i][j]:
            bfs(arr, visited2, i, j, True)
            cnt2 += 1

print(cnt1, cnt2)