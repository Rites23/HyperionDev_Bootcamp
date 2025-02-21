# Three variables each with a number value.

num1 = 5
num2 = 7
num3 = 3

# We determine which number is greater between num1 and num2.

if num1 >= num2:
  print("Number 1 is less then Number 2")

elif num2 >= num1:
    print(num2, "is greater then", num1)

# We determine if num1 is odd or even. 

if num1 % 2 == 0:
    print(num1, "is Even")

else: 
    print(num1, "is Odd")

# The three numbers from largest to smallest. 

list = [num1, num2, num3]
list.sort (reverse=True)
print(list)
