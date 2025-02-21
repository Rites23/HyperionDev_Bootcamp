# Requested the weight and height input from the user.

weight = float(input("Please enter your weight in kg: \n"))
height = float(input("Please enter your height in m: \n"))

# Calculation formula for bmi:

bmi = round(weight/ (height * height), 1)

# If the bmi is less then or equal to 18.5 print the following: 

if bmi <=18.5:
    print ("User is underweight")

# If the bmi is greater then 18.5 and less then 25 print the following: 

elif bmi > 18.5 and bmi < 25:
    print("User is normal")

# If the bmi is greater then 25 and less then 30, print the following: 

elif bmi > 25 and bmi < 30:
    print ("User is overweight")

# If the bmi is greater then 30, print the following: 

elif bmi > 30:
    print("User is obese")

# If there is a invalid input, the following will be printed: 

else:
    print('There is an invalid input')
 

