# Requested user to enter thier age. I have used of int.

age = int(input("Please enter your age: \n"))

# If the users age is greater or equal to print the following:

if age >= 18:
    print ("You are old enough!")

# If the users age is greater or equal to 16 but less then 18 print the following:

elif age >=16:
    print("Almost there!")

# If the age is below 16 print the following: 

else:
    print("You’re just too young!")
