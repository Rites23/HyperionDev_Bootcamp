
# We import the math module
import math

# We write a program that starts by asking the user to input 10 floats (these can
# be a combination of whole numbers and decimals). Store these numbers
# in a list.
a_list = []
print("Please enter 10 numbers with or without decimals\n")

for num in range(10):
    list_num = float(input(f"Enter number {num+1} : "))
    a_list.append(list_num)

# Total of all the numbers
print("The total of all the numbers is:" ,sum(a_list))

# Index of the maximum
max_index = a_list.index(max(a_list))
print("The index of the maximum is: ", max_index)

# Index of the minimum
min_index = a_list.index(min(a_list))
print("The index of the minimum is:", min_index)

# Average of the numbers and round off to 2 decimal places
print("The average of the numbers rounded off to 2 decimal places is:", round(sum(a_list) / len(a_list)))

# Median of list
# Using loop + "~" operator
a_list.sort()
mid = len(a_list) // 2
res = (a_list[mid] + a_list[~mid]) / 2

# Printing result
print("The median number is:", str(res))