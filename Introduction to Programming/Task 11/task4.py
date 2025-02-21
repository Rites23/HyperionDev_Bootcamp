# We request the user to enter a positive integer.

number = int(input("Please Enter any Positive Integer : \n"))

# We use if / else to determine if the number is divisible by 2 & 5, 2 or 5 or not divisible. Modulo operator will be used.   

if number %2 == 0 and number %5 ==0:
        print ("Divisible by 2 and 5!")
elif number %2 == 0:
        print ("Divisible by 2!")
elif number %5 == 0:
        print ("Divisible by 5!")
else:
        print ("Not Divisible by 2 or 5!") 








