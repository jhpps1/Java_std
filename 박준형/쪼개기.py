T = int(input())
for tc in range(1, T + 1):
    N = int(input())
    nums = list(map(int, input().split()))
    cnt = 0

    while len(set(nums)) > 1:
        target = min(nums)

        if max(nums) == min(nums) + 1:
            cnt += len(nums)
            break

        for i in nums:
            if i > target + 1:
                if i % 2 == 0:
                    i = i / 2
                    cnt += 1
                else:
                    even = i // 2 + 1
                    if even == target:
                        i = even
                        cnt += 1
                    else:
                        i = i // 2
                        cnt += 1
    print(cnt)
