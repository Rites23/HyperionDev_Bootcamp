# We ask the user to enter all names of the pupils in the class. 

print ("""Enter the names of the pupils in your class.
Type 'Stop' to indicate that all the names have been entered.""")

# Initialize count_names to 0

count_names = 0 

# All names entered will be stored in pupil_names. 

while True:
    pupil_names = input("Enter a name: ")

# One user types stop it will display the total number of names. 
    
    if pupil_names == "Stop":
            print(f"There are {count_names} students")
            break

# Add 1 each time we count a pupil

    count_names += 1 