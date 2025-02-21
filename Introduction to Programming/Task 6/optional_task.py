# Requested user to input the lenght of the 3 sides of triangle. The values are stored in side1, side2 
# and side3. 

user = input ("Please enter the lengths of all three sides of a triangle")
side1 = float(input("Please enter side1?"))
side2 = float(input("Please enter side2?"))
side3 = float(input("Please enter side3?"))

# Semi - Perimeter is calculated.

s = (side1 + side2 + side3)/2 

# Area of the triangle is calculated. 

area = (s*(s-side1)*(s-side2)*(s-side3)) ** 0.5
print(area)


