word = 'Mississippi'
counter_for_I = 0
counter_for_S = 0
for i in word:
    if 'i' in i:
        counter_for_I += 1
    elif 's' in i:
        counter_for_S += 1
print("the number of i is ", counter_for_I)
print("the number of s is ", counter_for_S)
