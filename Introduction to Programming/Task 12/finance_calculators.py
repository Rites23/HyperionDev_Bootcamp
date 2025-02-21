# This program does finance calculations.

# Import the math library. 
import math

# Ask the user to choose which calculator they want to use. i.e. investment or bond
calculator = input('''\nFinance Calculator

Please enter which calculator you would like to use:

Investment - to calculate the amount of interest you will earn on an investment.

Bond - to calculate your monthly repayment on a home loan\n\n''')

# If the user selects investment, the program will ask the user to input the deposit amount, interest rate, number of years and the type of interest to use for the calculation. 
# The program then calculates the total depending on the type of interest selected. Invalid input will be displayed if the user makes an error when typing simple of compound interest.
# Simple interest equation: Total = P*(1+r*t)
# Compound interest equation: Total = P(1 + r) ^ t
# P - deposit
# r - interest rate (divided by 100)
# t - number of years

if calculator == 'investment' or calculator == 'Investment' or calculator == 'INVESTMENT':
    print("\nWelcome to the investment calculator, please enter the following information with regards to your investment:")
    P = float(input("Deposit amount:                    "))
    r = float(input("Interest rate:                     "))
    t = int  (input("Number of years:                   "))
    interest = input("Type of interest (simple or compound):       ")

    if interest == 'Simple' or interest == 'simple' or interest == 'SIMPLE':
        total = P*(1+((r/100)*t))
        print("You will receive a total of R",total, "after", t , "years at an interest rate of", r)
    
    elif interest == 'Compound' or interest == 'compound' or interest == 'COMPOUND':
        total = round(P*(math.pow((1+(r/100)),t)),2)
        print("You will receive a total of R",total, "after", t , "years.")
    
    else:
        print("\nInvalid Input")

# If the user selects bond, the program will ask the user to input the present value of the house, interest rate, number of years over which the bond will be paid.
# Monthly repayment equation = (i.P)/(1 - (1+i)^(-n))
# P - Present Value of the house
# i - interest rate (interest rate is divided by 100 and then divided by 12 months)
# n - number of months

if calculator == 'bond' or calculator == 'Bond' or calculator == 'BOND':
    print("\nWelcome to the bond calculator, please enter the following information with regards to your investment:")
    P = int(input("Please enter the present value of the house:         "))
    i = int(input("Please enter the interest rate?:                     "))
    i = (float(i)/100)/12
    n = int  (input("Number of months:                                    "))

    bond = (i * P) / (1 - math.pow((1 + i), -n)) 
    print("You monthly payment will be R%2f" % (bond)) 