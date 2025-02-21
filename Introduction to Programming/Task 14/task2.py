# We ask the user which year does he want to start with.

start = int(input("What year do you want to start with? \n"))

# We ask the user how many years he wants to check. 

amount = int(input("How many years do you want to check? \n"))

total = start + amount + 1

# We use a if/else statemnt to determine which is a leapyear. This will be done by checking the range. 

for years in range (start, total):
    if years %4 == 0:
        print(years, "is a leap year.")
    else:
        print(years, "isn’t a leap year.")