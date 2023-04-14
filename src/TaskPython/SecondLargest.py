counter = 0
second_largest = 0
new_number = []
while counter < 5:
    numbers = int(input("Enter a number::"))
    new_number.append(numbers)
    counter = counter + 1
    new_number.sort()
for index in range(0, len(new_number)):
    if new_number[index] > second_largest:
        second_largest = new_number[-2]
print(second_largest)


