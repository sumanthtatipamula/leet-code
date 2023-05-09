import sys, os
sys.stdin = open(os.path.join(sys.path[0], "input.txt"), "r")
sys.stdout = open(os.path.join(sys.path[0], "output.txt"), "w")


from collections import defaultdict


n = int(input())
elements = list(map(int , input().split()))
max_count, max_index = 0, -1
map = defaultdict(int)
for i in range(0, n):
    map[elements[i]] = map[elements[i] - 1] + 1
    if(map[elements[i]] > max_count):
        max_count = map[elements[i]]
        max_index = i
print(max_count)
start = elements[max_index] - max_count + 1 
for i in range(0, max_index + i):
    if(elements[i] == start):
        print(start , end= " ")
        start += 1



        







    


