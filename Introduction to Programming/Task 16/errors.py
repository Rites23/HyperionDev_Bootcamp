# This example program is meant to demonstrate errors.
 
# There are some errors in this program, try run the program by pressing F5.
# Now look at the error messages and find and fix the errors.

# ageStr needed only one = (Runtime Error)

ageStr = "24" #I'm 24 years old.
age = int(ageStr)

# Incorrect indentation (Syntax Error)

print("I'm "+ ageStr +"years old.")
three = "3"

answerYears = age + int(three)

# We needed to use str for (answerYears) and (answerMonths) other the calculations will be incorrect. 
# Syntax Error

print("The total number of years:" + str(answerYears))
answerMonths = answerYears*12+6

print("In 3 years and 6 months, I'll be " + str(answerMonths) + " months old")

#HINT, 330 months is the correct answer