array = {1, 2, 2, 3, 4}
for i in range(0, len(array)):
    num = False
    for j in range(i + 1, len(array)):
        if array[i] == array[j]:
            num = True
