from math import ceil, floor
import sys, os
sys.stdin = open(os.path.join(sys.path[0], "input.txt"), "r")
sys.stdout = open(os.path.join(sys.path[0], "output.txt"), "w")

n, l, r = map(int, input().split())
mod = 10 ** 9 + 7
dp = [[0] * (3) for _ in range(n + 1)]
numbers = [
    r // 3 - (l - 1) // 3,
    (r + 2) // 3 - (l + 1) // 3,
    (r + 1) // 3 - l // 3
]
dp[0][0] = 1
for i in range(n):
    dp[i + 1][0] = ((dp[i][0] * numbers[0]) % mod + (dp[i][1] * numbers[2]) % mod + (dp[i][2] * numbers[1]) % mod) % mod
    dp[i + 1][1] = (dp[i][1] * numbers[0] + dp[i][0] * numbers[1] + dp[i][2] * numbers[2]) % mod
    dp[i + 1][2] = (dp[i][2] * numbers[0] + dp[i][1] * numbers[1] + dp[i][0] * numbers[2]) % mod

print(dp[n][0])
    



