
name_list = []

# Validation name
valid_name = "John"

name = str(input("Please enter a name: "))

# We use a while loop 
while name != valid_name:
    name_list.append(name)    
    name = str(input("Incorrect! please enter a name: "))

# Once John has been entered all incorrect names will be added from the name_list. 
print(f"Correct! Incorrect names that you have added: {name_list}")