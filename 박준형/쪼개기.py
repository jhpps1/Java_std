T = int(input())
for tc in range(1, T + 1):
    N = int(input())

    nums = list(map(int, input().split()))
    sorted(nums)
    cnt = 0

    while len(set(nums)) > 1:
        target_num = min(nums)

        if max(nums) == min(nums) + 1:
            if target_num == 2:
                cnt += len(nums) - (nums.count(2))
                break
            cnt += len(nums)
            break

        for i in range(len(nums)):
            if nums[i] > target_num + 1:
                if nums[i] % 2 == 0:
                    nums[i] = nums[i] / 2
                    cnt += 1
                else:
                    if (nums[i] // 2) % 2 == 0:
                        even_num = nums[i] // 2
                    else:
                        even_num = nums[i] - (nums[i] // 2)

                    if even_num == target_num:
                        nums[i] = even_num
                        cnt += 1
                    else:
                        nums[i] = nums[i] // 2
                        cnt += 1

    print(cnt)
