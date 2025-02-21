
x = 20

# while loop that will display count down from 20 to 0

while x > -1:
    print(x)
    x -= 1

# A loop that will display all the even numbers between 1 and 20

for x in range(1,20): 
	if (x%2 == 0): 
		print(x) 
    
# A loop that will produce the following output: * ** *** **** *****

rows = 5
for i in range(0, rows):
    # nested loop for each column
    for j in range(0, i + 1):
        # print star
        print("*", end=' ')
    # new line after each row
    print("\r")

# The greatest common divisor (GCD, or highest common factor) of two positive integers.

num1 = int(input("Enter 1st number: "))
num2 = int(input("Enter 2nd number: "))
i = 1
while(i <= num1 and i <= num2):
  if(num1 % i == 0 and num2 % i == 0):
    gcd = i
  i = i + 1
print("GCD is", gcd)




