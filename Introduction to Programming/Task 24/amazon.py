# import math
import math

# The functions min, max and avg that take in a list of
# integers and return the min, max or avg of the list.
def average(int_list):
    total_sum = 0
    total_numbers = 0
    for num in int_list:
        total_sum += num
        total_numbers += 1
    return total_sum / total_numbers

def max_list(int_list):
    highest = int_list[0]
    for num in int_list:
        if num > highest:
            highest = num
    return highest

def min_list(int_list):
    lowest = int_list[0]
    for num in int_list:
        if num < lowest:
            lowest = num
    return lowest

# We use if / else to do the "avg", "min" and "max" calculations. 
def format_file(file):
    with open(file, "r", encoding="utf-8-sig") as input_file:
        for line in input_file:
            formatted_line = line.replace("\n", "")
            line_list = formatted_line.split(":")
            number_list = line_list[1].split(",")
            print(number_list)
            for index in range(len(number_list)):
                number_list[index] = int(number_list[index])
            calc = line_list[0]
            if calc == "avg":
                result = average(number_list)
            elif calc == "min":
                result = min_list(number_list)
            else:
                result = max_list(number_list)

# Output file will be displayed with: 
# The min of [1, 2, 3, 4, 5, 6] is 1
# The max of [1, 2, 3, 4, 5, 6] is 6
# The avg of [1, 2, 3, 4, 5, 6] is 3.5
            with open("output.txt", "a") as output_file:
                output_file.write(f"The {calc} of {number_list} is {result}\n")

format_file("input.txt")


