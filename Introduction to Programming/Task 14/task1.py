# We ask the user to enter any number so we can display a timetable. 

number = int(input("Please enter any number: \n"))

# We use a for loop to determine the multiplication table. 

for mul in range(1, 13):
    print(number, "x", mul, "=", number*mul)
