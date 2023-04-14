counter = 0
guessingNumber = 30
while counter < 10:
    guess = int(input("GUESS MY BIRTH--DAY::"))
    if guess > guessingNumber:
        print("too high! Try Again")
        counter += 1
    elif guess < guessingNumber:
        print("too low! Try Again")
        counter += 1
    elif guess == guessingNumber:
        print("you guessed right!")
        break

    if counter == 10 and guess < guessingNumber or guess > guessingNumber:
        print("OOPS! Times up! Try again")
