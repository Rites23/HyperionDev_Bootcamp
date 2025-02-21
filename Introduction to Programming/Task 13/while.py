# sum and i = 0

sum = 0
i = 0

# We asked the user to enter some numbers and once the user types -1 it will calculate the average. 
while True:
        n = int(input("Input a number: "))

# if n == -1 it will break and calculate the average. 

        if n == -1:
                break
        sum += n
        i += 1

# The following will be printed once -1 is entered. 

print("Average is {}".format(sum/i))