names = []
birthdate = []

# We open the DOB.txt. We "r" which is for reading only.
f = open("DOB.txt", "r")
data = f.readlines()

# We use a for loop to determine the name and birthdate. 

for line in data:
    parts = line.split()
    names.append(parts[:2])  # store the name
    birthdate.append(parts[2:])  # store the birthdate

# We close the DOB.txt

f.close()

# We us the enumerate() function allows us to loop over an iterable object and keep track of how many iterations have occurred.

print("Name")
for i, name in enumerate(names, start=1):
    print("{}. {}".format(i, " ".join(name)))

print("Birthdate")
for i, bday in enumerate(birthdate, start=1):
    print("{}. {}".format(i, " ".join(bday)))