def areacalculator():

# We request the user to input Square, Rectangular or Round (Shape)

    _input_ = input("Enter the shape you want to calculate area of: (Square, Rectangular or Round): \n").capitalize()
    area = 0
    pie = 3.14

# Calcuation for "Square" - area = area + (side ** 2) [if / elif will be used for the calculations]
    
    if _input_ == "Square":
        side = int(input("Enter the value of side: "))
        area = area + (side ** 2)

# Calculation for "Rectangle" - area = area + (length * width)

    elif _input_ == "Rectangle":
        length = int(input("Enter the value of length: "))
        width = int(input("Enter the value of length: "))
        area = area + (length * width)

# Calculation for "Round" - area = area + (2 * pie * radius)

    elif _input_ == "Round":
        radius = int(input("Enter the value of radius: "))
        area = area + (2 * pie * radius) 


# A valid shape must be entered. 
# The total area will be printed if entered correctly. 
 
    else:
        print ("Select a valid shape")
    print ("%.2f" % area)

areacalculator()