# We request the user to enter the time in minutes it took for swimming. 

swimming = int(input("Please enter the time in minutes for you to complete the swimming? \n"))

# We request the user to enter the time in minutes it took for cycling. 

cycling = int(input("Please enter the time in minutes for you to complete the cycling? \n"))

# We request the user to enter the time in minutes it took for running.

running = int(input("Please enter the time in minutes for you to complete the running? \n"))

# We calculate the sum of all of the above combined. 

total = swimming + cycling + running

# We print the total. 

print  (total)

# If the total within 100 print the following. 

if total <= 100:
    print ("Provincial Colours")

# If the total is >100 and <= 105 print the following. 

if (total >100) and (total <=105):
    print ("Provincial Half Colours")

# If the total is >105 and <= 110 print the following.

if (total >105) and (total <=110):
    print ("Provincial Scroll")

# If the total is >=110 print the following.   

if total >= 110:
    print ("No award")

